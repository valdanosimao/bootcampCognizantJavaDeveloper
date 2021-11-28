package com.bootcampCognizantJavaDeveloper.EstruturaDeRepeticaoEArrays;

import java.util.Scanner;

public class ExercicioFatorial {
	
	/*
	Fa�a um programa que calcule o fatorial de um n�mero inteiro fornecido pelo usu�rio.
	Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
	*/

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.print(fatorial +"! = ");
        for(int i = fatorial ; i >= 1 ; i --) {
            multiplicacao = multiplicacao * i;
        }

        System.out.println(multiplicacao);
        
        scan.close();

	}

}
