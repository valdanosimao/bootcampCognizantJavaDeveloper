package com.bootcampCognizantJavaDeveloper.desafiosBasicos;

import java.io.IOException;
import java.util.Scanner;

public class DesafioAnaliseDeNumeros {
	
	public static void main(String[] args) throws IOException {				  
	     
		System.out.println("");
        Scanner leitor = new Scanner(System.in);
        leitor.nextInt();
//declare suas variaveis corretamente
        int pos = 0;
        int neg = 0;
        int par = 0;
        int impar= 0;
        int x;

//continue a solu��o
        for (int i = 0; i < 4; i++) {
        	
        	x = leitor.nextInt();
        	
        	if(x % 2 != 0) {
        		impar++;
        	}else {
        		par++;
        	}
        	
        	if(x > 0) pos++;
        	
        	if(x < 0)neg++;
        	
        }
//insira suas variaveis corretamente
        System.out.println(par + " par(es)");
        System.out.println(impar + " impar(es)");
        System.out.println(pos + " positivo(s)");
        System.out.println(neg+ " negativo(s)");
    }
	

}


//Desafio
//Voc� deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados s�o pares, quantos valores 
//informados s�o �mpares, quantos valores informados s�o positivos e quantos valores informados s�o negativos. Considere que 
//o n�mero zero � positivo, mas n�o pode ser considerado como positivo ou negativo.
//
//Entrada
//Voc� receber� 5 valores inteiros.
//
//Sa�da
//Exiba a mensagem conforme o exemplo de sa�da abaixo, sendo uma mensagem por linha e n�o esquecendo o final de linha ap�s cada uma.
//
// 
//Exemplo de Entrada	Exemplo de Sa�da
//-5
//0
//-3
//-4
//12
//
//3 par(es)
//2 impar(es)
//1 positivo(s)
//3 negativo(s)