package com.softatnet.net.rubricabe.service;

import com.softatnet.net.rubricabe.entity.PersonaEntity;
import com.softatnet.net.rubricabe.model.*;
import com.softatnet.net.rubricabe.repository.PersonaRepository;
import com.softatnet.net.rubricabe.service.mappers.PersonaMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    private PersonaRepository personaRepository;

    public PersonaServiceImpl(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    @Override
    public AddPersonaResponse savePersona(AddPersonaRequest addPersonaRequest) {
        PersonaEntity personaEntity = PersonaMapper.personaEntityFromAddPersonaRequest(addPersonaRequest);
        if(personaRepository.findById(personaEntity.getCodiceFiscale()).isPresent()){
            AddPersonaResponse addPersonaResponse = new AddPersonaResponse();
            addPersonaResponse.setError(true);
            addPersonaResponse.setMessage("Persona già presente");
            addPersonaResponse.setCodiceFiscale(personaEntity.getCodiceFiscale());
            return addPersonaResponse;
        }
        personaRepository.save(personaEntity);
        return PersonaMapper.addPersonaResponseFromPersonaEntity(personaEntity);
    }

    @Override
    public RemovePersonaResponse deletePersonaById(RemovePersonaRequest personaRequest) {
        PersonaEntity personaEntity = PersonaMapper.personaEntityFromRemovePersonaRequest(personaRequest);
        if(personaRepository.findById(personaEntity.getCodiceFiscale()).isPresent()){
            personaRepository.deleteById(personaEntity.getCodiceFiscale());
            return PersonaMapper.removePersonaResponseFromPersonaEntity(personaEntity);
        }
        else {
            RemovePersonaResponse removePersonaResponse = new RemovePersonaResponse();
            removePersonaResponse.setError(true);
            removePersonaResponse.setMessage("Persona non presente");
            return removePersonaResponse;
        }
    }

    @Override
    public EditPersonaResponse updatePersona(EditPersonaRequest personaRequest) {
        PersonaEntity personaEntity = PersonaMapper.personaEntityFromEditPersonaRequest(personaRequest);
        personaRepository.save(personaEntity);
        return PersonaMapper.editPersonaResponseFromPersonaEntity(personaEntity);
    }


    @Override
    public SearchPersonaResponse findPersonaById(SearchPersonaRequest personaRequest) {
        PersonaEntity personaEntity = PersonaMapper.personaEntityFromSearchPersonaRequest(personaRequest);
        personaRepository.findById(personaRequest.getCodiceFiscale());
        return PersonaMapper.searchPersonaResponseFromPersonaEntity(personaEntity);
    }

    public SearchPersonaByNameResponse findPersonaByName(SearchPersonaByNameRequest personaRequest) {
        PersonaEntity personaEntity = PersonaMapper.personaEntityFromSearchPersonaByNameRequest(personaRequest);
        if(personaRepository.existsByNome(personaRequest.getNome())){
            return PersonaMapper.searchPersonaByNameResponseFromPersonaEntity(personaEntity);
        }
        else {
            SearchPersonaByNameResponse searchPersonaByNameResponse = new SearchPersonaByNameResponse();
            searchPersonaByNameResponse.setError(true);
            searchPersonaByNameResponse.setMessage("Persona non presente");
            return searchPersonaByNameResponse;
        }
    }

    @Override
    public GetAllPersonasResponse findAllPersonas() {
        List<PersonaEntity> personaEntityList = (List<PersonaEntity>) personaRepository.findAll();
        return PersonaMapper.getAllPersonasResponseFromPersonaEntityList(personaEntityList);
    }


}

