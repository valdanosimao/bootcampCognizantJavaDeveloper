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
//Voc� est� na feira com a sua sacola e parou em uma banca. O feirante lhe entregou
//piment�es amarelos e vermelhos. Agora iremos somar os pimet�es amarelos e vermelhos 
//para descobrir o total de piment�es na sacola.  Voc� receber� 2 inteiros que devem
//er lidos e armazenados nas vari�veis A (piment�es amarelos) e B (piment�es vermelhos).
//Fa�a a soma de A e B atribuindo o seu resultado na vari�vel X (total de piment�es). 
//Apresente X como descrito na mensagem de exemplo abaixo. N�o apresente outra mensagem 
//al�m da mensagem especificada.
//
//Entrada
//A entrada cont�m 2 valores inteiros, separados por um espa�o.
//
//Sa�da
//Imprimir a mensagem "X = " (sendo a letra X mai�scula) seguido pelo valor da vari�vel 
//X e pelo final de linha. Assegure que exista um espa�o antes e depois do sinal de 
//igualdade.