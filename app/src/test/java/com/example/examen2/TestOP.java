package com.example.examen2;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestOP {

    @Test
    public void testRealizarOperacionSuma() {
        // Prueba para la suma de dos números
        int num1 = 5;
        int num2 = 3;
        String operador = "+";

        int resultado = Calculadora.realizarOperacion(num1, num2, operador);

        assertEquals(8, resultado, "La suma de 5 y 3 debería ser 8");
    }
    @Test
    public void testRealizarOperacionDivision() {
        // Prueba para la división de dos números
        int num1 = 10;
        int num2 = 2;
        String operador = "/";

        int resultado = Calculadora.realizarOperacion(num1, num2, operador);

        assertEquals(5, resultado, "La división de 10 entre 2 debería ser 5");
    }

    @Test
    public void testRealizarOperacionDivisionPorCero() {
        // Prueba para la división por cero
        int num1 = 10;
        int num2 = 0;
        String operador = "/";

        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            Calculadora.realizarOperacion(num1, num2, operador);
        });

        assertEquals("División por 0", exception.getMessage(), "Debería lanzar una excepción de división por cero");
    }

    @Test
    public void testRealizarOperacionOperadorInvalido() {
        // Prueba para un operador no soportado
        int num1 = 10;
        int num2 = 5;
        String operador = "%"; // Operador no soportado

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.realizarOperacion(num1, num2, operador);
        });

        assertEquals("Operador no soportado", exception.getMessage(), "Debería lanzar una excepción de operador no soportado");
    }
    private Calculadora calculadoraTest;

    @Before
    public void setUp() {
        calculadoraTest = new Calculadora();
    }

    //Verificacion de operaciones
    @Test
    public void testOperacionRestar() {
        int numero = calculadoraTest.realizarOperacion(5,5, "-");// valor 0
        int numero2 = calculadoraTest.realizarOperacion(5, 10, "-");// valor negativo

        assertEquals(0, numero);
        assertEquals(-5, numero2);

    }

    // verificaiion de un input invalido
    @Test
    public void testOperacionMultiplicar() {

        int numero = calculadoraTest.realizarOperacion(-5,-5, "*");// verificacion multiplicaion negativos
        int numero2 = calculadoraTest.realizarOperacion(5, -10, "*");// multiplicacion con resultado negativo

        assertEquals(25, numero);
        assertEquals(-50, numero2);
    }
}

