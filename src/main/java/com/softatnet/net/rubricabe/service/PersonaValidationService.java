package com.softatnet.net.rubricabe.service;

import com.softatnet.net.rubricabe.model.persona.PersonaDTO;
import org.springframework.stereotype.Component;

@Component public class PersonaValidationService {

        public boolean validateRequest(PersonaDTO request) {
            if (request.getNome() == null || request.getNome().isEmpty() || request.getCognome() == null || request.getCognome().isEmpty() || request.getCodiceFiscale() == null || request.getCodiceFiscale().isEmpty() || request.getTelefono() == null || request.getTelefono().isEmpty()) {
                return false;
            }
            return true;
        }

        public boolean validateRequestCf(String codiceFiscale) {
            return codiceFiscale != null || codiceFiscale.isEmpty();
        }

    public boolean validateRequestName(String nome) {
        return nome != null || nome.isEmpty();
    }
}
