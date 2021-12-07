package com.bootcampCognizantJavaDeveloper.estruturaDeDados.principaisImplementacoes;

import java.util.Stack;

public class MainStack {

	public static void main(String[] args) {

    Stack<Carro> stackCarros = new Stack<>();
		
		stackCarros.push(new Carro("Ford"));
		stackCarros.push(new Carro("Chevrolet"));
		stackCarros.push(new Carro("Fiat"));
		
		System.out.println(stackCarros);
		System.out.println(stackCarros.pop());
		System.out.println(stackCarros);
		
		System.out.println(stackCarros.peek());//exibe mas n�o retira
		System.out.println(stackCarros);
		
		System.out.println(stackCarros.isEmpty());

	}

}
