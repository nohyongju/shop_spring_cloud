package org.example.mocha.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tickets")
public class TicketController {

    @Value("${attic.version}")
    private String version;

    @GetMapping
    public String findAll() {
        return "ok";
    }

    @GetMapping("version")
    public String findVersion() {
        return version;
    }
}
