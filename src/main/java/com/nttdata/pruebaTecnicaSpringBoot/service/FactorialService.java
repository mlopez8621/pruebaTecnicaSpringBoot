package com.nttdata.pruebaTecnicaSpringBoot.service;

import org.springframework.stereotype.Service;

@Service
public class FactorialService {
    private ValidationService validationService;

    public FactorialService(ValidationService validationService) {
        this.validationService = validationService;
    }
    public long calcularFactorial(int numero) {
        if (!validationService.esValido(numero)) {
            throw new IllegalArgumentException("El número no es válido");
        }
        return (numero <= 1) ? 1 : numero * calcularFactorial(numero - 1);
    }
}
