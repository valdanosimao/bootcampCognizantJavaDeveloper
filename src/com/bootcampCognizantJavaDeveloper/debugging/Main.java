package com.bootcampCognizantJavaDeveloper.debugging;

public class Main {

	public static void main(String[] args) {

		System.out.println("Iniciou o programa do m�todo main");
		a();
		System.out.println("Finalizou o programa do m�todo main");
		
		

	}

	public static void a () {
		System.out.println("Entrou no m�todo A");
		b();
		System.out.println("Finalizou o m�todo A");
	}
	
	public static void b() {
		System.out.println("Entrou no m�todo B");
		for(int i = 0; i <= 4; i++)
			System.out.println(i);
		c();
		System.out.println("Finalizou o m�todo B");
	}
	
	public static void c() {
		System.out.println("Entrou no m�todo C");
		//Thread.dumpStack();
		System.out.println("Finalizou o m�todo C");
	}
	
}
