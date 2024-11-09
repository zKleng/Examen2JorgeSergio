package com.example.examen2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class EncuentraTest {

    @Test
    public void testEncuentraElementoPresente() {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        int elemento = 3;

        boolean resultado = Calculadora.Encuentra(lista, elemento);

        assertTrue(resultado, "El elemento 3 debería estar presente en la lista");
    }

    @Test
    public void testEncuentraElementoNoPresente() {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        int elemento = 6;

        boolean resultado = Calculadora.Encuentra(lista, elemento);

        assertFalse(resultado, "El elemento 6 no debería estar presente en la lista");
    }
}
