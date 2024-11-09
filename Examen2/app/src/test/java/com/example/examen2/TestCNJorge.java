package com.example.examen2;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCNJorge {

    @Test
    public void testConvertirNumeroBinario() {
        String input = "1010";
        int base = 0;
        int resultado = Calculadora.convertirNumero(input, base);

        assertEquals(10, resultado, "El número binario 1010 debería convertirse a 10 en decimal");
    }

    @Test
    public void testConvertirNumeroHexadecimal() {
        String input = "1F";
        int base = 3;

        int resultado = Calculadora.convertirNumero(input, base);

        assertEquals(31, resultado, "El número hexadecimal 1F debería convertirse a 31 en decimal");
    }

    @Test
    public void testConvertirNumeroErrorFormato() {
        String input = "123";
        int base = 0;
        int resultado = Calculadora.convertirNumero(input, base);

        assertEquals(-1, resultado, "La conversión de '123' en base binaria debería devolver -1 por error de formato");
    }
    private Calculadora calculadoraTest;

    @Before
    public void setUp() {
        calculadoraTest = new Calculadora();
    }

    //Verificacion de conversion de bases a decimal
    @Test
    public void testConvertirNumero() {
        int numero = calculadoraTest.convertirNumero("100", 0);//binario
        int numero2 = calculadoraTest.convertirNumero("11", 1);//octal
        int numero3 = calculadoraTest.convertirNumero("100", 2);//decimal
        int numero4 = calculadoraTest.convertirNumero("11", 3);//hexadecimal

        assertEquals(4, numero);
        assertEquals(9, numero2);
        assertEquals(100, numero3);
        assertEquals(17, numero4);
    }

    // verificaiion de un input invalido
    @Test
    public void testConvertirNumeroInvalido() {

        int numero = calculadoraTest.convertirNumero("2", 0);
        assertEquals(-1, numero);

        int numero2 = calculadoraTest.convertirNumero("2", 4);
        assertEquals(-1, numero2 );
    }
}
