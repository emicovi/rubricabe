package com.softatnet.net.rubricabe.model.persona.request;

import com.softatnet.net.rubricabe.model.persona.PersonaDTO;

public class RemovePersonaRequest {

        private String codiceFiscale;

        private PersonaDTO persona;


    public PersonaDTO getPersona() {
        return persona;
    }

    public void setPersona(PersonaDTO persona) {
        this.persona = persona;
    }


}
