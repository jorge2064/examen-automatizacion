package com.ejemplo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    @Test
    void testSuma(){
        Calculadora calc= new Calculadora();
        int resultado=calc.sumar(2,3);
        assertEquals(5,resultado,"La suma debe ser 5");
    }
    @Test
    void testResta(){
        Calculadora calc= new Calculadora();
        int resultado= calc.restar(5,2);
        assertEquals(3,resultado,"La resta debe ser 3");
    }
}
