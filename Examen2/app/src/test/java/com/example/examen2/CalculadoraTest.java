package com.example.examen2;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

    private Calculadora calculadora;

    @Before
    public void setup() {
        calculadora = new Calculadora();
    }

    // SUMAR
    @Test
    public void sumar_dosNumerosPositivos() {
        int resultado = Calculadora.realizarOperacion(2, 3, "+");
        assertEquals(5, resultado);
    }

    @Test
    public void sumar_conCero() {
        int resultado = Calculadora.realizarOperacion(5, 0, "+");
        assertEquals(5, resultado);
    }

    // RESTAR
    @Test
    public void restar_dosNumeros() {
        int resultado = Calculadora.realizarOperacion(5, 3, "-");
        assertEquals(2, resultado);
    }

    @Test
    public void restar_resultadoNegativo() {
        int resultado = Calculadora.realizarOperacion(3, 5, "-");
        assertEquals(-2, resultado);
    }

    // MULTIPLICAR
    @Test
    public void multiplicar_dosNumeros() {
        int resultado = Calculadora.realizarOperacion(4, 3, "*");
        assertEquals(12, resultado);
    }

    @Test
    public void multiplicar_porCero() {
        int resultado = Calculadora.realizarOperacion(4, 0, "*");
        assertEquals(0, resultado);
    }

    // DIVIDIR
    @Test
    public void dividir_dosNumeros() {
        int resultado = Calculadora.realizarOperacion(10, 2, "/");
        assertEquals(5, resultado);
    }

    @Test(expected = ArithmeticException.class)
    public void dividir_porCero_lanzaExcepcion() {
        Calculadora.realizarOperacion(10, 0, "/");
    }
}
