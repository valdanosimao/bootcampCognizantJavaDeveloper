package com.bootcampCognizantJavaDeveloper.estruturaDeDados.principaisImplementacoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MainHashCode {

	public static void main(String[] args) {		
	
		//MELHORAR A BUSCA DE OBJETOS, TESTA SE UM OBJETO É IGUAL AO OUTRO
		//DEVEM SER IMPLEMENTADOS JUNTOS

		List<Carro> listaCarro = new ArrayList<>();
		
		listaCarro.add(new Carro("Ford"));
		listaCarro.add(new Carro("Chevrolet"));
		listaCarro.add(new Carro("Volkswagem"));				
		
		System.out.println(listaCarro.contains(new Carro("Ford")));		

		Carro carro1 = new Carro("Gol");
		Carro carro2 = new Carro("Fiat");
		
		System.out.println(carro1.equals(carro2));		
		
		
	}

}
