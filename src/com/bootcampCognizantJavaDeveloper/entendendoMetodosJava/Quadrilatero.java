package com.bootcampCognizantJavaDeveloper.entendendoMetodosJava;

public class Quadrilatero {

	public static void area(double lado) {
		
		System.out.println("Area do quadrado " + lado * lado);
	}
	
	public static void area(double lado1 , double lado2) {
		
		System.out.println("Area do retangulo " + lado1 * lado2);
	}
	
	public static void area(double baseMaior, double baseMenor, double altura) {
		
		System.out.println("Area do trap?zio " + ((baseMaior+baseMenor)*altura) / 2);
	}
	
	public static void area(float diagonal1, float diagonal2) {
		
		System.out.println("?rea do losango " + (diagonal1 * diagonal2) / 2);
	}
}
