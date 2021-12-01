package com.bootcampCognizantJavaDeveloper.estruturaDeDados.filas;

public class Main {

	public static void main(String[] args) {

		Fila minhaFila = new Fila();
		
		minhaFila.enqueue("Primeiro ");
		minhaFila.enqueue("Segundo ");
		minhaFila.enqueue("Terceiro ");
		minhaFila.enqueue(1);
		
		System.out.println(minhaFila);
		
		System.out.println(minhaFila.dequeue());

		minhaFila.enqueue("Ultimo ");
		
		System.out.println(minhaFila);
		System.out.println(minhaFila.first());
		
		
		
	}

}
