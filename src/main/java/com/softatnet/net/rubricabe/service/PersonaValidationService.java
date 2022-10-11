package com.softatnet.net.rubricabe.service;

import com.softatnet.net.rubricabe.model.AddPersonaRequest;
import com.softatnet.net.rubricabe.model.PersonaRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component public class PersonaValidationService {

        public boolean validateRequest(PersonaRequest request) {
            return request.getNome() != null && request.getCognome() != null && request.getEmail() != null && request.getTelefono() != null && request.getCodiceFiscale() != null;
        }

        public boolean validateRequestCf(String codiceFiscale) {
            return codiceFiscale != null || codiceFiscale.isEmpty();
        }
}
