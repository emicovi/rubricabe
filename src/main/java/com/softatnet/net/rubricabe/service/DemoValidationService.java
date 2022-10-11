package com.softatnet.net.rubricabe.service;

import com.softatnet.net.rubricabe.model.DemoRequest;
import org.springframework.stereotype.Service;

@Service
public class DemoValidationService {
    public Boolean validateRequest(DemoRequest request){
        if (request.getNome() == null || request.getNome().isEmpty() || request.getCognome() == null || request.getCognome().isEmpty() || request.getEmail() == null || request.getEmail().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}
