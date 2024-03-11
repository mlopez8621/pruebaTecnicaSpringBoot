package com.nttdata.pruebaTecnicaSpringBoot.service;

import org.springframework.stereotype.Service;

@Service
public class FactorialService {
    public long calcularFactorial(int numero) {
        if (numero >= 0) {
            return (numero <= 1) ? 1 : numero * calcularFactorial(numero - 1);
        } else {
            throw new IllegalArgumentException("El número debe ser mayor o igual a 0");
        }
    }
}
