package cl.desafiolatam;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {
    @Test
    public void testSumar() {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.sumar(2, 3);
        assertEquals(5, result, 0.01);
    }

    @Test
    public void testRestar() {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.restar(5, 2);
        assertEquals(3, result, 0.01);
    }

    @Test
    public void testMultiplicar() {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.multiplicar(4, 5);
        assertEquals(20, result, 0.01);
    }

    @Test
    public void testDividir() {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.dividir(10, 2);
        assertEquals(5, result, 0.01);
    }
}