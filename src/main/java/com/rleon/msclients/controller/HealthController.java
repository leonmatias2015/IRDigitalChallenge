package com.rleon.msclients.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping(value = "/")
    public String healthCheck() {
        return "OK";
    }

}
