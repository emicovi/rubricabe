package com.softatnet.net.rubricabe.model.persona.request;

import com.softatnet.net.rubricabe.model.persona.PersonaDTO;

public class EditPersonaRequest {

    private PersonaDTO persona;
    private String codiceFiscale;

    public PersonaDTO getPersona() {
        return persona;
    }

    public void setPersona(PersonaDTO persona) {
        this.persona = persona;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }
}
