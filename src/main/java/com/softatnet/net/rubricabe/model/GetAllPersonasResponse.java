package com.softatnet.net.rubricabe.model;

import com.softatnet.net.rubricabe.entity.PersonaEntity;

import java.util.List;

public class GetAllPersonasResponse extends PersonaResponse {

    private List<PersonaEntity> personaEntityList;

    public List<PersonaEntity> getPersonaEntityList() {
        return personaEntityList;
    }

    public void setPersonaEntityList(List<PersonaEntity> personaEntityList) {
        this.personaEntityList = personaEntityList;
    }
}

