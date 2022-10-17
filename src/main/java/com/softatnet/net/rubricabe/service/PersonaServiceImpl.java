package com.softatnet.net.rubricabe.service;

import com.softatnet.net.rubricabe.entity.PersonaEntity;
import com.softatnet.net.rubricabe.model.persona.PersonaDTO;
import com.softatnet.net.rubricabe.repository.PersonaRepository;
import com.softatnet.net.rubricabe.service.mappers.PersonaMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    private PersonaRepository personaRepository;

    public PersonaServiceImpl(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }


    @Override
    public PersonaDTO savePersona(PersonaDTO personaDTO) {
        PersonaEntity personaEntity = PersonaMapper.toPersonaEntity(personaDTO);
        personaRepository.save(personaEntity);
        return PersonaMapper.fromPersonaEntity(personaEntity);
    }


    @Override
    public PersonaDTO removePersona(PersonaDTO personaDTO) {
        PersonaEntity personaEntity = PersonaMapper.toPersonaEntity(personaDTO);
        personaRepository.delete(personaEntity);
        return PersonaMapper.fromPersonaEntity(personaEntity);
    }

    @Override
    public PersonaDTO editPersona(PersonaDTO personaDTO) {
        PersonaEntity personaEntity = PersonaMapper.toPersonaEntity(personaDTO);
        personaRepository.save(personaEntity);
        return PersonaMapper.fromPersonaEntity(personaEntity);
    }

    @Override
    public Boolean isPersonaPresent(String codiceFiscale) {
        if(personaRepository.findById(codiceFiscale).isPresent()){
            return true;
        }
        return false;
    }


    @Override
    public List<PersonaDTO> findAllPersonas() {
        List<PersonaEntity> personaEntityList = (List<PersonaEntity>) personaRepository.findAll();
        return PersonaMapper.fromListPersonaEntity(personaEntityList);
    }


}

