package com.bootcampCognizantJavaDeveloper.desafiosBasicos;

import java.util.Scanner;

public class DesafioVisitaNaFeira {
	
	 public static void main(String[] args){
		    
		    Scanner scan = new Scanner(System.in);
		    
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    
		    int X = a + b;
				    System.out.println("X = " + X );
		    
				    
				    scan.close();
		  }

}

//Desafio
//Você está na feira com a sua sacola e parou em uma banca. O feirante lhe entregou
//pimentões amarelos e vermelhos. Agora iremos somar os pimetões amarelos e vermelhos 
//para descobrir o total de pimentões na sacola.  Você receberá 2 inteiros que devem
//er lidos e armazenados nas variáveis A (pimentões amarelos) e B (pimentões vermelhos).
//Faça a soma de A e B atribuindo o seu resultado na variável X (total de pimentões). 
//Apresente X como descrito na mensagem de exemplo abaixo. Não apresente outra mensagem 
//além da mensagem especificada.
//
//Entrada
//A entrada contém 2 valores inteiros, separados por um espaço.
//
//Saída
//Imprimir a mensagem "X = " (sendo a letra X maiúscula) seguido pelo valor da variável 
//X e pelo final de linha. Assegure que exista um espaço antes e depois do sinal de 
//igualdade.