package com.bootcampCognizantJavaDeveloper.desafiosBasicos;

import java.io.IOException;
import java.util.Scanner;

public class DesafioTempoDoDobby {

	public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	int A = leitor.nextInt() + leitor.nextInt();
        //TODO: Complete o If com a condi??o que soluciona o problema.
    	if (A > N)
    		System.out.println("Deixa para amanha!");
    	else
    		System.out.println("Farei hoje!");
    	
    	
    	leitor.close();
    }
	
}

//Desafio
//Para dar conta de toda a fabrica??o dos presentes de Natal, por v?rias vezes os 
//elfos precisam ficar at? tarde trabalhando para que tudo possa ser terminado a tempo.
//
//Para melhor gerenciar seus cronogramas, os elfos estipularam quantos minutos 
//s?o necess?rios para fabricar cada presente.
//
//J? est? quase no final do expediente, e um dos elfos pediu sua ajuda.
//
//Faltam N minutos para a hora de ir embora, e restam dois presentes para o elfo
//Dobby fabricar. Ajude-o a descobrir se ele conseguir? fabricar os dois ainda hoje, 
//ou se deve deixar o trabalho para amanh?.
//
//Entrada
//Cada caso de teste inicia com um inteiro N, indicando quantos minutos faltam para 
//o final do expediente (2 <= N <= 100).
//
//Em seguida haver? dois inteiros A e B, indicando quantos minutos s?o necess?rios 
//para fabricar os dois presentes que Dobby precisa fabricar (1 <= A, B <= 100).
//
//Sa?da
//Imprima uma linha, contendo a frase "Farei hoje!" caso seja poss?vel fabricar os 
//dois presentes antes do final do expediente, ou "Deixa para amanha!" caso contr?rio.

