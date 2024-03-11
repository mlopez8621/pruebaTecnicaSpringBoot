package com.nttdata.pruebaTecnicaSpringBoot.service;

import org.springframework.stereotype.Service;

@Service
public class ValidationServiceImpl implements ValidationService {

    @Override
    public boolean esValido(int numero) {
        return numero >= 0;
    }
}