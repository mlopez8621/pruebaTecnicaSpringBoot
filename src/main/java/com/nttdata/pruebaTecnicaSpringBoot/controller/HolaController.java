package com.nttdata.pruebaTecnicaSpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class HolaController {
    @GetMapping("/hola")
    public Map<String, String> saludo() {
        Map<String, String> response = new HashMap<>();
        response.put("mensaje", "Hola, equipo nttdatateam!");
        return response;
    }
}
