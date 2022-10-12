package com.softatnet.net.rubricabe.service;

import com.softatnet.net.rubricabe.entity.PersonaEntity;
import com.softatnet.net.rubricabe.model.*;

import java.util.List;

public interface PersonaService {

    //save operation
    AddPersonaResponse savePersona(AddPersonaRequest personaRequest);
    //update operation
    EditPersonaResponse updatePersona(EditPersonaRequest personaRequest);
    //delete operation
    RemovePersonaResponse deletePersonaById(RemovePersonaRequest personaRequest);
    //read operation

    SearchPersonaResponse findPersonaById(SearchPersonaRequest personaRequest);

    GetAllPersonasResponse findAllPersonas();

    SearchPersonaByNameResponse findPersonaByName(SearchPersonaByNameRequest request);
}
