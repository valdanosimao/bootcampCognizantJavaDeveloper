package com.bootcampCognizantJavaDeveloper.entendendoMetodosJava;

public class QuadrilateroMain {

	public static void main(String[] args) {
		
		System.out.println("Exerc�cio Quadril�tero");
		Quadrilatero.area(3);
		Quadrilatero.area(5D, 5D);
		Quadrilatero.area(7, 8, 9);
		Quadrilatero.area(7F, 7F);
		
		System.out.println();
		
		System.out.println("Exerc�cio Quadril�tero com Return");
		double areaQuadrado = Quadrilatero2.area(3);
		System.out.println("�rea do quadrado � " + areaQuadrado);
		
		double areaRetangulo = Quadrilatero2.area(5D, 5D);
		System.out.println("�rea do retangulo � " + areaRetangulo);
		
		double areaTrapezio = Quadrilatero2.area(7, 8, 9);
		System.out.println("�rea do trap�zio � " + areaTrapezio);		

	}

}
