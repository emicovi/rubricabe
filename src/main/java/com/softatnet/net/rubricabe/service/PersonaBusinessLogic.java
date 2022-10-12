package com.softatnet.net.rubricabe.service;

import com.softatnet.net.rubricabe.model.*;
import com.softatnet.net.rubricabe.service.mappers.PersonaMapper;
import org.springframework.stereotype.Component;


@Component
public class PersonaBusinessLogic {

    private PersonaValidationService personaValidationService;

    private PersonaService personaService;


    public PersonaBusinessLogic(PersonaValidationService personaValidationService, PersonaService personaService) {
        this.personaValidationService = personaValidationService;
        this.personaService = personaService;
    }

    public AddPersonaResponse addPersona(AddPersonaRequest request) {
        return personaService.savePersona(request);
    }

    public EditPersonaResponse editPersona(EditPersonaRequest request) {
        EditPersonaResponse response = new EditPersonaResponse();
        if (!personaValidationService.validateRequest(request)) {
            response.setError(true);
            response.setMessage("Errore");
        } else {
            response = personaService.updatePersona(request);
            response.setError(false);
            response.setCodiceFiscale(request.getCodiceFiscale());
            response.setMessage("La persona con codice" + request.getCodiceFiscale() + " è stata modificata");
        }

        return response;
    }

    //method that deletes a person if the person exists in
    //the database

    public RemovePersonaResponse removePersona(RemovePersonaRequest request) {
        RemovePersonaResponse response = new RemovePersonaResponse();
        if (!personaValidationService.validateRequestCf(request.getCodiceFiscale())) {
            response.setError(true);
            response.setMessage("Errore");
        } else {
            response = personaService.deletePersonaById(request);
            response.setError(false);
            response.setMessage("La persona con codice" + request.getCodiceFiscale() + " è stata eliminata");
        }

        return response;
    }



    //method that searches a person by id if the person exists in
    //the database

    public SearchPersonaResponse searchPersona(SearchPersonaRequest request) {
        SearchPersonaResponse response = new SearchPersonaResponse();
        if (!personaValidationService.validateRequestCf(request.getCodiceFiscale())) {
            response.setError(true);
            response.setMessage("Errore");
        } else {
            response = personaService.findPersonaById(request);
            response.setError(false);
            response.setMessage("La persona con codice" + request.getCodiceFiscale() + " è stata trovata");
        }

        return response;
    }

    //method that returns all the persons in the database

    public GetAllPersonasResponse getAllPersonas() {
        GetAllPersonasResponse response = new GetAllPersonasResponse();
        response = personaService.findAllPersonas();
        response.setError(false);
        response.setMessage("Tutte le persone sono state trovate");
        return response;
    }

    //method that search a person by name if the person
    //exists in the database

    public SearchPersonaByNameResponse searchPersonaByName(SearchPersonaByNameRequest request) {
        SearchPersonaByNameResponse response = new SearchPersonaByNameResponse();
        if (!personaValidationService.validateRequestName(request.getNome())) {
            response.setError(true);
            response.setMessage("Errore");
        } else {
            response = personaService.findPersonaByName(request);
            response.setError(false);
            response.setMessage("La persona con nome" + request.getNome() + " è stata trovata");
        }

        return response;
    }
}
