package com.nttdata.pruebaTecnicaSpringBoot.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class FactorialServiceTest {

    @Mock
    private ValidationService validationService;

    @InjectMocks
    private FactorialService factorialService;

    @Test
    public void calcularFactorialConNumeroValido() {
        // Configurar el mock para devolver true cuando se llame con cualquier entero positivo
        when(validationService.esValido(anyInt())).thenReturn(true);

        // Prueba
        assertEquals(120, factorialService.calcularFactorial(5));

        // Verificar que el mock fue llamado
        verify(validationService).esValido(5);
    }

    @Test
    public void calcularFactorialConNumeroInvalidoLanzaExcepcion() {
        // Configurar el mock para devolver false para simular un número inválido
        when(validationService.esValido(anyInt())).thenReturn(false);

        // Verificar que se lanza la excepción esperada
        assertThrows(IllegalArgumentException.class, () -> factorialService.calcularFactorial(-1));

        // Verificar que el mock fue llamado
        verify(validationService).esValido(-1);
    }
}
