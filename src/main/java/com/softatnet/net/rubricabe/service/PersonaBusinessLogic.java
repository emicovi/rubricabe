package com.softatnet.net.rubricabe.service;

import com.softatnet.net.rubricabe.model.persona.PersonaDTO;
import com.softatnet.net.rubricabe.model.persona.request.AddPersonaRequest;
import com.softatnet.net.rubricabe.model.persona.request.EditPersonaRequest;
import com.softatnet.net.rubricabe.model.persona.request.RemovePersonaRequest;
import com.softatnet.net.rubricabe.model.persona.request.SearchPersonaRequest;
import com.softatnet.net.rubricabe.model.persona.response.*;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class PersonaBusinessLogic {

    private PersonaValidationService personaValidationService;

    private PersonaService personaService;


    public PersonaBusinessLogic(PersonaValidationService personaValidationService, PersonaService personaService) {
        this.personaValidationService = personaValidationService;
        this.personaService = personaService;
    }

    // Add Persona

    public AddPersonaResponse addPersona(AddPersonaRequest request) {
        if (personaValidationService.validateRequest(request.getPersona())) {
            if (personaService.isPersonaPresent(request.getPersona().getCodiceFiscale())) {
                AddPersonaResponse response = new AddPersonaResponse();
                response.setError(true);
                response.setMessage("Persona duplicata");
                response.setPersona(response.getPersona());
                return response;
            } else {
                PersonaDTO personaDTO = personaService.savePersona(request.getPersona());
                AddPersonaResponse response = new AddPersonaResponse();
                response.setError(false);
                response.setMessage("Persona inserita");
                response.setPersona(personaDTO);
                return response;
            }
        } else {
            AddPersonaResponse response = new AddPersonaResponse();
            response.setError(true);
            response.setMessage("Persona non valida");
            return response;
        }
    }

    //remove Persona

    public RemovePersonaResponse removePersona(RemovePersonaRequest request) {
        if (personaValidationService.validateRequest(request.getPersona())) {
            if (personaService.isPersonaPresent(request.getPersona().getCodiceFiscale())) {
                PersonaDTO personaDTO = personaService.removePersona(request.getPersona());
                RemovePersonaResponse response = new RemovePersonaResponse();
                response.setError(false);
                response.setMessage("Persona rimossa");
                response.setPersona(personaDTO);
                return response;
            } else {
                RemovePersonaResponse response = new RemovePersonaResponse();
                response.setError(true);
                response.setMessage("Persona non presente");
                response.setPersona(response.getPersona());
                return response;
            }
        } else {
            RemovePersonaResponse response = new RemovePersonaResponse();
            response.setError(true);
            response.setMessage("Persona non valida");
            return response;
        }
    }

    //search persona by codiceFiscale

    public SearchPersonaResponse searchPersonaByCodiceFiscale(SearchPersonaRequest request) {
        if (personaValidationService.validateRequestCf(request.getPersona().getCodiceFiscale())) {
            if (personaService.isPersonaPresent(request.getPersona().getCodiceFiscale())) {
                PersonaDTO personaDTO = personaService.getPersonaByCodiceFiscale(request.getPersona().getCodiceFiscale());
                SearchPersonaResponse response = new SearchPersonaResponse();
                response.setError(false);
                response.setMessage("Persona trovata");
                response.setPersona(personaDTO);
                return response;
            } else {
                SearchPersonaResponse response = new SearchPersonaResponse();
                response.setError(true);
                response.setMessage("Persona non presente");
                response.setPersona(response.getPersona());
                return response;
            }
        } else {
            SearchPersonaResponse response = new SearchPersonaResponse();
            response.setError(true);
            response.setMessage("Persona non valida");
            return response;
        }
    }

    public EditPersonaResponse editPersona(EditPersonaRequest request) {
        if (personaValidationService.validateRequest(request.getPersona())) {
            if (personaService.isPersonaPresent(request.getPersona().getCodiceFiscale())) {
                PersonaDTO personaDTO = personaService.savePersona(request.getPersona());
                EditPersonaResponse response = new EditPersonaResponse();
                response.setError(false);
                response.setMessage("Persona modificata");
                response.setPersona(personaDTO);
                return response;
            } else {
                EditPersonaResponse response = new EditPersonaResponse();
                response.setError(true);
                response.setMessage("Persona non presente");
                response.setPersona(response.getPersona());
                return response;
            }
        } else {
            EditPersonaResponse response = new EditPersonaResponse();
            response.setError(true);
            response.setMessage("Persona non valida");
            return response;
        }
    }


    //get all persons
    public ListaPersoneResponse getAllPersonas() {
        ListaPersoneResponse response = new ListaPersoneResponse();
        List<PersonaDTO> persone = personaService.findAllPersonas();
        response.setPersone(persone);
        response.setError(false);
        response.setMessage("Tutte le persone sono state trovate");
        return response;
    }

    public ListaPersoneResponse getPersonaByName (SearchPersonaRequest request) {
        ListaPersoneResponse response = new ListaPersoneResponse();
        List<PersonaDTO> persone = personaService.getPersonaByName(request.getPersona().getNome());
        response.setPersone(persone);
        response.setError(false);
        response.setMessage("Tutte le persone sono state trovate");
        return response;
    }



}
