package com.generation.f20220601.pruebasunitarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	// JUnit nos sirve para probar los metodos
	// assert nos sirve para validar los metodos
	// assertEquals(valorEsperado,Resultado);

	@Test
	public void testSuma() {
		Calculadora calc = new Calculadora();
		int resultado = calc.suma(12, 42);// resultado deberia ser 54

		assertEquals(54, resultado);

	}

	@Test
	public void testResta() {
		Calculadora calc = new Calculadora();
		int resultado = calc.resta(10, 5);// deberia dar 5

		assertEquals(5, resultado);
	}

	@Test
	public void testMulti() {
		Calculadora calc = new Calculadora();
		int resultado = calc.multiplicacion(3, 4); // deberia dar 12

		assertEquals(12, resultado);
	}

	@Test
	public void testDiv() {
		Calculadora calc = new Calculadora();
		String resultado = calc.division(0, 0);// deberia dar 5

		assertNotNull(resultado);

	}

	@Test
	public void testPar() {
		Calculadora calc = new Calculadora();
		String resultado = calc.numPares(0);
		
		assertEquals("Tu numero es par", resultado);
		
	}
	@Test
	public void testImpar() {
		Calculadora calc = new Calculadora ();
		String resultado = calc.numImpar(1);
		
		assertEquals("Tu numero es impar", resultado);
		
	}
}
