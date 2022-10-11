package com.softatnet.net.rubricabe.service;

import com.softatnet.net.rubricabe.model.*;
import org.springframework.stereotype.Component;

@Component public class IndirizzoBusinessLogic {

    private IndirizzoValidationService indirizzoValidationService;

    public IndirizzoBusinessLogic(IndirizzoValidationService indirizzoValidationService) {
        this.indirizzoValidationService = indirizzoValidationService;
    }

    public AddIndirizzoResponse addIndirizzo(AddIndirizzoRequest request) {
        AddIndirizzoResponse response = new AddIndirizzoResponse();
        if (!indirizzoValidationService.validateRequest(request)) {
            response.setError(true);
            response.setMessage("Errore");
        } else {
            response.setError(false);
            response.setMessage("Ciao " + request.getIndirizzo() + " " + request.getCap() + " " + request.getCitta() + " " + request.getTelefono());
        }

        return response;
    }
    
    public EditIndirizzoResponse editIndirizzo(EditIndirizzoRequest request) {
        EditIndirizzoResponse response = new EditIndirizzoResponse();
        if (!indirizzoValidationService.validateRequest(request)) {
            response.setError(true);
            response.setMessage("Errore");
        } else {
            response.setError(false);
            response.setMessage("Ciao " + request.getIndirizzo() + " " + request.getCap() + " " + request.getCitta() + " " + request.getTelefono());
        }

        return response;
    }

    public RemoveIndirizzoResponse removeIndirizzo(RemoveIndirizzoRequest request) {
        RemoveIndirizzoResponse response = new RemoveIndirizzoResponse();
        if (!indirizzoValidationService.validateRequest(request)) {
            response.setError(true);
            response.setMessage("Errore");
        } else {
            response.setError(false);
            response.setMessage("Ciao " + request.getIndirizzo() + " " + request.getCap() + " " + request.getCitta() + " " + request.getTelefono());
        }

        return response;
    }

    public SearchIndirizzoResponse searchIndirizzo(SearchIndirizzoRequest request) {
        SearchIndirizzoResponse response = new SearchIndirizzoResponse();
        if (!indirizzoValidationService.validateRequest(request)) {
            response.setError(true);
            response.setMessage("Errore");
        } else {
            response.setError(false);
            response.setMessage("Ciao " + request.getIndirizzo() + " " + request.getCap() + " " + request.getCitta() + " " + request.getTelefono());
        }

        return response;
    }
}
