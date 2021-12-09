package com.bootcampCognizantJavaDeveloper.debugging;

public class Main {

	public static void main(String[] args) {

		System.out.println("Iniciou o programa do método main");
		a();
		System.out.println("Finalizou o programa do método main");
		
		

	}

	public static void a () {
		System.out.println("Entrou no método A");
		b();
		System.out.println("Finalizou o método A");
	}
	
	public static void b() {
		System.out.println("Entrou no método B");
		for(int i = 0; i <= 4; i++)
			System.out.println(i);
		c();
		System.out.println("Finalizou o método B");
	}
	
	public static void c() {
		System.out.println("Entrou no método C");
		//Thread.dumpStack();
		System.out.println("Finalizou o método C");
	}
	
}
