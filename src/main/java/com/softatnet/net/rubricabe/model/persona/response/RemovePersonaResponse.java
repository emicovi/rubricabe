package com.softatnet.net.rubricabe.model.persona.response;

import com.softatnet.net.rubricabe.model.BaseResponse;
import com.softatnet.net.rubricabe.model.persona.PersonaDTO;

public class RemovePersonaResponse {

    private Boolean error=false;

    private String message;
    private PersonaDTO persona;
    private String codiceFiscale;

    public String getCodiceFiscale() {
        return codiceFiscale;
    }


    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public PersonaDTO getPersona() {
        return persona;
    }

    public String getMessage() {
        return message;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getError() {
        return error;
    }

    public void setPersona(PersonaDTO persona) {
        this.persona = persona;
    }

}
