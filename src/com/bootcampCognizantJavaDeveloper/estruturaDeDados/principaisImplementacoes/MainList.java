package com.bootcampCognizantJavaDeveloper.estruturaDeDados.principaisImplementacoes;

import java.util.ArrayList;
import java.util.List;

public class MainList {

	public static void main(String[] args) {
	
		List<Carro> listaCarros = new ArrayList<>();
		
		listaCarros.add(new Carro("Ford"));
		listaCarros.add(new Carro("Chevrolet"));
		listaCarros.add(new Carro("Fiat"));
		listaCarros.add(new Carro("Pegout"));
		
		System.out.println(listaCarros.contains(new Carro("Ford")));
		
		System.out.println(listaCarros.get(2));//índice 2
		
		System.out.println(listaCarros.indexOf(new Carro("Fiat")));
		
		System.out.println(listaCarros.remove(1));
		System.out.println(listaCarros);
	}

}
