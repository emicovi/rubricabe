package com.softatnet.net.rubricabe.controller;


import com.softatnet.net.rubricabe.model.DemoRequest;
import com.softatnet.net.rubricabe.model.DemoResponse;
import com.softatnet.net.rubricabe.service.DemoValidationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/demo")
public class DemoController {

    private DemoValidationService demoValidationService;

    public DemoController(DemoValidationService demoValidationService) {
        this.demoValidationService = demoValidationService;
    }

    @GetMapping
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(required = true) String name) {
        return "Hello " + name;
    }

    @GetMapping("/hello-path/{name}")
    public String helloPath(@PathVariable String name) {
        return "Hello " + name;
    }

    @PostMapping("/hello-post")
    public String helloPost(@RequestBody DemoRequest request) {
        return "Hello " + request.getNome() + " " + request.getCognome() + " " + request.getEmail();
    }




    @PostMapping("/hello-response")
    public DemoResponse helloResponse(@RequestBody DemoRequest request) {
        DemoResponse response = new DemoResponse();
        if (!demoValidationService.validateRequest(request)) {
            response.setError(true);
            response.setMessage("Errore");
        } else {
            response.setError(false);
            response.setMessage("Hello " + request.getNome() + " " + request.getCognome() + " " + request.getEmail());
            response.setId(1L);
        }

        return response;
    }
}

