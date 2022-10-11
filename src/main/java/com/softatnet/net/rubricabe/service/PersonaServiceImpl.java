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
        personaRepository.save(personaEntity);
        return PersonaMapper.addPersonaResponseFromPersonaEntity(personaEntity);
    }

    @Override
    public EditPersonaResponse updatePersona(EditPersonaRequest personaRequest) {
        PersonaEntity personaEntity = PersonaMapper.personaEntityFromEditPersonaRequest(personaRequest);
        personaRepository.save(personaEntity);
        return PersonaMapper.editPersonaResponseFromPersonaEntity(personaEntity);
    }


    @Override
    public RemovePersonaResponse deletePersonaById(RemovePersonaRequest personaRequest) {
        PersonaEntity personaEntity = PersonaMapper.personaEntityFromRemovePersonaRequest(personaRequest);
        personaRepository.deleteById(personaEntity.getCodiceFiscale());
        return PersonaMapper.removePersonaResponseFromPersonaEntity(personaEntity);
    }

    public List<PersonaEntity> getAllPersonas() {
        return (List<PersonaEntity>) personaRepository.findAll();
    }


    @Override
    public SearchPersonaResponse findPersonaById(SearchPersonaRequest personaRequest) {
        PersonaEntity personaEntity = PersonaMapper.personaEntityFromSearchPersonaRequest(personaRequest);
        personaRepository.findById(personaRequest.getCodiceFiscale());
        return PersonaMapper.searchPersonaResponseFromPersonaEntity(personaEntity);
    }

    @Override
    public GetAllPersonasResponse findAllPersonas() {
        List<PersonaEntity> personaEntityList = (List<PersonaEntity>) personaRepository.findAll();
        return PersonaMapper.getAllPersonasResponseFromPersonaEntityList(personaEntityList);
    }


}

