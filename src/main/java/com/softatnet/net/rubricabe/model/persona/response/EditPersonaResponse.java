package com.softatnet.net.rubricabe.model.persona.response;

import com.softatnet.net.rubricabe.model.BaseResponse;
import com.softatnet.net.rubricabe.model.persona.PersonaDTO;

public class EditPersonaResponse {

    private Boolean error=false;
    private String message;
    private PersonaDTO persona;

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public PersonaDTO getPersona() {
        return persona;
    }

    public void setPersona(PersonaDTO persona) {
        this.persona = persona;
    }










}
