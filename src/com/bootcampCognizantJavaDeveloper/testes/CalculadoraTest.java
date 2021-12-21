package com.bootcampCognizantJavaDeveloper.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {	

	@Test
	void testSomar2() {
		
		int valorA = 1;
		int valorB = 2;
		
		Calculadora calc =  new Calculadora();
		int somaDois = calc.somarDoisValores(valorA, valorB);
		assertEquals(3, somaDois); //resultado esperado 3
	}
	
	@Test
     void testSomar3() {
		
		int valorA = 1;
		int valorB = 2;
		int valorC = 5;
		
		Calculadora calc =  new Calculadora();
		int somaTres = calc.somarTresValores(valorA, valorB , valorC);
		assertEquals(8, somaTres); 
	}

}
