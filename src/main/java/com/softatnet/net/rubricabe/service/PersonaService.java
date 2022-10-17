package com.softatnet.net.rubricabe.service;

import com.softatnet.net.rubricabe.model.persona.PersonaDTO;
import com.softatnet.net.rubricabe.model.persona.request.AddPersonaRequest;
import com.softatnet.net.rubricabe.model.persona.request.EditPersonaRequest;
import com.softatnet.net.rubricabe.model.persona.request.RemovePersonaRequest;
import com.softatnet.net.rubricabe.model.persona.request.SearchPersonaRequest;
import com.softatnet.net.rubricabe.model.persona.response.AddPersonaResponse;
import com.softatnet.net.rubricabe.model.persona.response.EditPersonaResponse;
import com.softatnet.net.rubricabe.model.persona.response.ListaPersoneResponse;
import com.softatnet.net.rubricabe.model.persona.response.RemovePersonaResponse;

import java.util.List;

public interface PersonaService {

    //save operation
    PersonaDTO savePersona(PersonaDTO personaDTO);
    //update operation

    PersonaDTO removePersona(PersonaDTO PersonaDTO);
    //read operation
    PersonaDTO editPersona(PersonaDTO personaDTO);
    //get person by codiceFiscale
    PersonaDTO getPersonaByCodiceFiscale(String codiceFiscale);
    Boolean isPersonaPresent(String codiceFiscale);

   // SearchPersonaResponse findPersonaById(SearchPersonaRequest personaRequest);

    List<PersonaDTO> findAllPersonas();

    //SearchPersonaByNameResponse findPersonaByName(SearchPersonaByNameRequest request);

}
