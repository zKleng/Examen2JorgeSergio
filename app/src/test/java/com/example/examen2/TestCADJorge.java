package com.example.examen2;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCADJorge {

    @Test
    public void testConvertirADestinoBinario() {
        // Prueba para convertir un número decimal a binario
        int numeroDecimal = 10; // El número 10 en decimal
        int baseDestino = 0; // Base binaria

        String resultado = Calculadora.convertirADestino(numeroDecimal, baseDestino);

        assertEquals("1010", resultado, "El número 10 en decimal debería convertirse a 1010 en binario");
    }

    @Test
    public void testConvertirADestinoHexadecimal() {
        // Prueba para convertir un número decimal a hexadecimal
        int numeroDecimal = 255; // El número 255 en decimal
        int baseDestino = 3; // Base hexadecimal

        String resultado = Calculadora.convertirADestino(numeroDecimal, baseDestino);

        assertEquals("ff", resultado, "El número 255 en decimal debería convertirse a 'ff' en hexadecimal");
    }

    @Test
    public void testConvertirADestinoBaseNoSoportada() {
        // Prueba para una base no soportada
        int numeroDecimal = 10;
        int baseDestino = 4; // Base no soportada

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.convertirADestino(numeroDecimal, baseDestino);
        });

        assertEquals("Base de destino no soportada", exception.getMessage(), "Debería lanzar una excepción por base no soportada");
    }
    private Calculadora calculadoraTest;

    @Before
    public void setUp() {
        calculadoraTest = new Calculadora();
    }

    //Verificacion de operaciones
    @Test
    public void testCambiobase() {
        String numero = calculadoraTest.convertirADestino(8,1);// demical --> octal
        String numero2 = calculadoraTest.convertirADestino(5, 2);// decimal --> decimal

        assertEquals("10", numero);
        assertEquals("5", numero2);

    }

}
