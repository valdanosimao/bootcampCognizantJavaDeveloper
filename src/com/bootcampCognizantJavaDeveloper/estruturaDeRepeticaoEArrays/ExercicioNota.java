package com.bootcampCognizantJavaDeveloper.estruturaDeRepeticaoEArrays;

import java.util.Scanner;

public class ExercicioNota {	
	/*
	Fa�a um programa que pe�a uma nota, entre zero e dez.
	Mostre uma mensagem caso o valor seja inv�lido
	e continue pedindo
	at� que o usu�rio informe um valor v�lido.
	*/
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while(nota < 0 || nota > 10) {
            System.out.println("Nota Inv�lida! Digite novamente: ");
            nota = scan.nextInt();
     
        }

        scan.close();
	}
	

}
