package com.example.examen2;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConversionTest {

    // CONVERSIÓN DE BINARIO
    @Test
    public void convertir_binarioADecimal() {
        int resultado = Calculadora.convertirNumero("1010", 0);
        assertEquals(10, resultado);
    }

    @Test
    public void convertir_decimalABinario() {
        String resultado = Calculadora.convertirADestino(10, 0);
        assertEquals("1010", resultado);
    }

    // CONVERSIÓN DE OCTAL
    @Test
    public void convertir_octalADecimal() {
        int resultado = Calculadora.convertirNumero("12", 1);
        assertEquals(10, resultado);
    }

    @Test
    public void convertir_decimalAOctal() {
        String resultado = Calculadora.convertirADestino(10, 1);
        assertEquals("12", resultado);
    }

    // CONVERSIÓN DE HEXADECIMAL
    @Test
    public void convertir_hexadecimalADecimal() {
        int resultado = Calculadora.convertirNumero("a", 2);
        assertEquals(10, resultado);
    }

    @Test
    public void convertir_decimalAHexadecimal() {
        String resultado = Calculadora.convertirADestino(10, 3);
        assertEquals("a", resultado);
    }

    // CONVERSIÓN DECIMAL
    @Test
    public void convertir_decimalADecimal() {
        int resultado = Calculadora.convertirNumero("10", 2);
        assertEquals(10, resultado);
    }

    @Test
    public void convertir_numeroInvalido_retornaMenosUno() {
        int resultado = Calculadora.convertirNumero("xyz", 2);
        assertEquals(-1, resultado);
    }
}
