package com.bootcampCognizantJavaDeveloper.EntendendoMetodosJava;

public class ClasseMain {

	public static void main(String[] args) {
		
		//POSSO ACESSAR O M�TODO DIRETAMENTE DA CLASSE, PQ O M�TODO � STATIC
		//QUANDO O M�TODO � STATIC, ELE PERTENCE A CLASSE E N�O AO OBJETO
		
		System.out.println("Exerc�cio Calculadora");		
		Calculadora.somar(6.5, 7.4);
		Calculadora.subtratir(8.5, 4.2);
		Calculadora.multiplicar(8.8, 2);
		Calculadora.divisao(6.2, 2);
		
		System.out.println();
		
		System.out.println("Exerc�cio Mensagem Hora");
		Mensagem.obterMensagem(9);
		Mensagem.obterMensagem(13);
		Mensagem.obterMensagem(19);
		
		System.out.println();
		Emprestimo.calcular(1000, 2);
		Emprestimo.calcular(1000, 3);
		Emprestimo.calcular(5000, Emprestimo.getDuasParcelas());

	}

}
