package com.softatnet.net.rubricabe.service.mappers;

import com.softatnet.net.rubricabe.entity.PersonaEntity;
import com.softatnet.net.rubricabe.model.persona.PersonaDTO;
import com.softatnet.net.rubricabe.model.persona.request.AddPersonaRequest;
import com.softatnet.net.rubricabe.model.persona.request.EditPersonaRequest;
import com.softatnet.net.rubricabe.model.persona.request.RemovePersonaRequest;
import com.softatnet.net.rubricabe.model.persona.request.SearchPersonaRequest;
import com.softatnet.net.rubricabe.model.persona.response.AddPersonaResponse;
import com.softatnet.net.rubricabe.model.persona.response.EditPersonaResponse;
import com.softatnet.net.rubricabe.model.persona.response.ListaPersoneResponse;
import com.softatnet.net.rubricabe.model.persona.response.RemovePersonaResponse;

import java.util.ArrayList;
import java.util.List;

public class PersonaMapper {

    public static PersonaEntity toPersonaEntity(PersonaDTO personaDTO) {
        PersonaEntity personaEntity = new PersonaEntity();
        personaEntity.setNome(personaDTO.getNome());
        personaEntity.setCognome(personaDTO.getCognome());
        personaEntity.setEmail(personaDTO.getEmail());
        personaEntity.setTelefono(personaDTO.getTelefono());
        personaEntity.setCodiceFiscale(personaDTO.getCodiceFiscale());
        return personaEntity;
    }

    public static PersonaDTO fromPersonaEntity(PersonaEntity personaEntity) {
        PersonaDTO personaDTO = new PersonaDTO();
        personaDTO.setNome(personaEntity.getNome());
        personaDTO.setCognome(personaEntity.getCognome());
        personaDTO.setEmail(personaEntity.getEmail());
        personaDTO.setTelefono(personaEntity.getTelefono());
        personaDTO.setCodiceFiscale(personaEntity.getCodiceFiscale());
        return personaDTO;
    }

    public static List<PersonaDTO> fromListPersonaEntity(List<PersonaEntity> personaEntities) {
        ArrayList<PersonaDTO> personaDTOs = new ArrayList<>();
        personaEntities.stream().forEach(personaEntity -> {
            personaDTOs.add(PersonaMapper.fromPersonaEntity(personaEntity));
        });
        return personaDTOs;
    }

    public static List<PersonaEntity> toListPersonaEntity(List<PersonaDTO> personaDTOs) {
        ArrayList<PersonaEntity> personaEntities = new ArrayList<>();
        personaDTOs.stream().forEach(personaDTO -> {
            personaEntities.add(PersonaMapper.toPersonaEntity(personaDTO));
        });
        return personaEntities;
    }

}
