package com.softatnet.net.rubricabe.controller;

import com.softatnet.net.rubricabe.model.*;
import com.softatnet.net.rubricabe.service.IndirizzoBusinessLogic;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/indirizzo")
public class IndirizzoController {


    private IndirizzoBusinessLogic indirizzoBusinessLogic;

    public IndirizzoController(IndirizzoBusinessLogic indirizzoBusinessLogic) {
        this.indirizzoBusinessLogic = indirizzoBusinessLogic;
    }

    @GetMapping("/indirizzo/{name}")
    public String indirizzoPath(@PathVariable String name) {
        return "Hello " + name;
    }

    @PostMapping("/add")
    public AddIndirizzoResponse addIndirizzo(@RequestBody AddIndirizzoRequest request) {
        return indirizzoBusinessLogic.addIndirizzo(request);
    }

    @PostMapping("/remove")
    public RemoveIndirizzoResponse removeIndirizzo(@RequestBody RemoveIndirizzoRequest request) {
        return indirizzoBusinessLogic.removeIndirizzo(request);
    }

    @PostMapping("/edit")
    public EditIndirizzoResponse editIndirizzo(@RequestBody EditIndirizzoRequest request) {
        return indirizzoBusinessLogic.editIndirizzo(request);
    }

    @PostMapping("/search")
    public SearchIndirizzoResponse searchIndirizzo(@RequestBody SearchIndirizzoRequest request) {
        return indirizzoBusinessLogic.searchIndirizzo(request);
    }
}
