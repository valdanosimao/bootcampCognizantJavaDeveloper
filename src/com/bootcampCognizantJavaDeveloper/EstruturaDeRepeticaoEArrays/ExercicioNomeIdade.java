package com.bootcampCognizantJavaDeveloper.EstruturaDeRepeticaoEArrays;

import java.util.Scanner;

public class ExercicioNomeIdade {

	public static void main(String[] args) {
		
		/*
		Faça um programa que leia conjuntos de dois valores,
		o primeiro representando o nome do aluno e o segundo representando a sua idade.
		(Pare o programa inserindo o valor 0 no campo nome)
		*/		
		  Scanner scan = new Scanner(System.in);

		        String nome;
		        @SuppressWarnings("unused")
				int idade;

		        while(true) {
		            System.out.println("Nome: ");
		            nome = scan.next();
		            if (nome.equals("0")) break;

		            System.out.println("Idade: " );
		            idade = scan.nextInt();
		        }

		        System.out.println("Continua aqui...");

		        
		        scan.close();
	}

}
