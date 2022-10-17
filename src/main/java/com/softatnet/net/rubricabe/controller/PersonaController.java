package com.softatnet.net.rubricabe.controller;


import com.softatnet.net.rubricabe.model.persona.request.AddPersonaRequest;
import com.softatnet.net.rubricabe.model.persona.request.EditPersonaRequest;
import com.softatnet.net.rubricabe.model.persona.request.RemovePersonaRequest;
import com.softatnet.net.rubricabe.model.persona.request.SearchPersonaRequest;
import com.softatnet.net.rubricabe.model.persona.response.*;
import com.softatnet.net.rubricabe.service.PersonaBusinessLogic;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    private PersonaBusinessLogic personaBusinessLogic;


    public PersonaController(PersonaBusinessLogic personaBusinessLogic) {
        this.personaBusinessLogic = personaBusinessLogic;
    }


    @PostMapping("/add")
    public AddPersonaResponse addPersona(@RequestBody AddPersonaRequest request) {
        return personaBusinessLogic.addPersona(request);
    }

    @GetMapping("/getAll")
    public ListaPersoneResponse getAllPersonas() {
        return personaBusinessLogic.getAllPersonas();
    }

    @PostMapping("/remove")
    public RemovePersonaResponse removePersona(@RequestBody RemovePersonaRequest request) {
        return personaBusinessLogic.removePersona(request);
    }

    @PostMapping("/edit")
    public EditPersonaResponse editPersona(@RequestBody EditPersonaRequest request) {
        return personaBusinessLogic.editPersona(request);
    }


    @PostMapping("/search")
    public SearchPersonaResponse searchPersona(@RequestBody SearchPersonaRequest request) {
        return personaBusinessLogic.searchPersonaByCodiceFiscale(request);
    }


    @PostMapping("/searchByName")
    public ListaPersoneResponse searchPersonaByName(@RequestBody SearchPersonaRequest request) {
        return personaBusinessLogic.getPersonaByName(request);
    }



}



