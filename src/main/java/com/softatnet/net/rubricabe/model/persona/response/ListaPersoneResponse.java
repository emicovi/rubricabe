package com.softatnet.net.rubricabe.model.persona.response;

import com.softatnet.net.rubricabe.model.BaseResponse;
import com.softatnet.net.rubricabe.model.persona.PersonaDTO;

import java.util.List;

public class ListaPersoneResponse extends BaseResponse {

    private List<PersonaDTO> persone;

    public List<PersonaDTO> getPersone() {
        return persone;
    }

    public void setPersone(List<PersonaDTO> persone) {
        this.persone = persone;
    }
}

