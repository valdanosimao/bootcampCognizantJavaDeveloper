package com.bootcampCognizantJavaDeveloper.estruturaDeDados.listasCirculares;

public class Main {

	public static void main(String[] args) {
		
		ListaCircular<String> minhaListaCircula =  new ListaCircular<>();

		minhaListaCircula.add("c0");
		System.out.println(minhaListaCircula);
		
		minhaListaCircula.remove(0);
		System.out.println(minhaListaCircula);
		
		minhaListaCircula.add("c1");
		System.out.println(minhaListaCircula);
		
		minhaListaCircula.add("c2");
		minhaListaCircula.add("c3");
		System.out.println(minhaListaCircula);
		
//		System.out.println(minhaListaCircula.get(0));
//		System.out.println(minhaListaCircula.get(1));
//		System.out.println(minhaListaCircula.get(2));
//		System.out.println(minhaListaCircula.get(3));
		
		for(int i = 0; i < 20; i++) {
			System.out.println(minhaListaCircula.get(i));
			
		}
		
	}

}
