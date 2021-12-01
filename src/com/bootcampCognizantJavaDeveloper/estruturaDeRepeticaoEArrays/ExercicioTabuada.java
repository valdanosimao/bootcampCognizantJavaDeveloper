package com.bootcampCognizantJavaDeveloper.estruturaDeRepeticaoEArrays;

import java.util.Scanner;

public class ExercicioTabuada {
	
	/*
	Desenvolva um gerador de tabuada,
	capaz de gerar a tabuada de qualquer n�mero inteiro entre 1 a 10.
	O usu�rio deve informar de qual numero ele deseja ver a tabuada.
	A sa�da deve ser conforme o exemplo abaixo:
	Tabuada de 5:
	5 X 1 = 5
	5 X 2 = 10
	...
	5 X 10 = 50
	*/

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);
        for(int i = 1; i <= 10; i = i + 1) {
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        }
        
        scan.close();
	}

}
