package com.softatnet.net.rubricabe.service;

import com.softatnet.net.rubricabe.model.IndirizzoRequest;
import org.springframework.stereotype.Component;

@Component public class IndirizzoValidationService {

    public boolean validateRequest(IndirizzoRequest request) {
        return request.getIndirizzo() != null && request.getCap() != null && request.getCitta() != null && request.getTelefono() != null;
    }
}
