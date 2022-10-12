package com.softatnet.net.rubricabe.controller;


import com.softatnet.net.rubricabe.entity.PersonaEntity;
import com.softatnet.net.rubricabe.model.*;
import com.softatnet.net.rubricabe.repository.PersonaRepository;
import com.softatnet.net.rubricabe.service.PersonaBusinessLogic;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    private PersonaBusinessLogic personaBusinessLogic;


    public PersonaController(PersonaBusinessLogic personaBusinessLogic) {
        this.personaBusinessLogic = personaBusinessLogic;
    }


    @GetMapping("nome/{name}")
    public String personaPath(@PathVariable String name) {
        return "Hello " + name;
    }

    @PostMapping("/add")
    public AddPersonaResponse addPersona(@RequestBody AddPersonaRequest request) {
        return personaBusinessLogic.addPersona(request);
    }

    @GetMapping("/get")
    public GetAllPersonasResponse getAllPersonas() {
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
        return personaBusinessLogic.searchPersona(request);
    }

    @PostMapping("/searchByName")
    public SearchPersonaByNameResponse searchPersonaByName(@RequestBody SearchPersonaByNameRequest request) {
        return personaBusinessLogic.searchPersonaByName(request);
    }

}



