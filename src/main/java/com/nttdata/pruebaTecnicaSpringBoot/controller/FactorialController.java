package com.nttdata.pruebaTecnicaSpringBoot.controller;

import com.nttdata.pruebaTecnicaSpringBoot.service.FactorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api")
public class FactorialController {
    @Autowired
    private FactorialService factorialService;

    @GetMapping("/factorial/{numero}")
    public Map<String, Object> calcularFactorial(@PathVariable int numero) {
        Map<String, Object> response = new HashMap<>();
        response.put("factorial", factorialService.calcularFactorial(numero));
        return response;
    }
}
