package com.softatnet.net.rubricabe.model.persona.request;

import com.softatnet.net.rubricabe.model.persona.PersonaDTO;

public class RemovePersonaRequest {

        private String codiceFiscale;

        private PersonaDTO persona;



    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public PersonaDTO getPersona() {
        return persona;
    }

    public void setPersona(PersonaDTO persona) {
        this.persona = persona;
    }


}
