package com.bootcampCognizantJavaDeveloper.VariáveisTiposDeDadosOperadoresMatematicos;

public class ConversoesCasting {

	public static void main(String[] args) {		
		
	byte b1;
	short s1 = 1000;
	b1 = (byte) s1;
	System.out.println("downcast " + b1);
	
	long l1;
	int i1 = 10;
	l1 = i1;
	System.out.println("upcast " + l1);
	
	int i2;
	long l2 = 100000000000000000L;
	i2 = (int) l2;
	System.out.println("downcast" + i2);
	
	int i3;
	long l3 = 10000L;
	i3 = (int) l3;
	System.out.println("downcast " + i3);
	
	double d1;
	float f1 = 10.5F;
	d1 = f1;
	System.out.println("upcast" + d1);
	
	float f2;
	float f3;
	double d2 = 10000.58D;
	f2 = (float) d2;
	double d3 = 1000.5888888888888888888888888888888888888D;
	f3 = (int) d3;	
	System.out.println("downcast" + f2 + " | " + f3);
 
	int i4;
	float f4 = 11.5697F;
	i4 = (int) f4;
	System.out.println("" + i4);	
	
	b1 = (byte) d3;
	System.out.println("downcast" + b1);
	
	}

}

//CONCEITUAÇÃO
//É A TRANSFORMAÇÃO DE UMA DETERMINADA VARIÁVEL DE TIPO MENOS ESPECÍFICO PARA UM
//TIPO MAIS ESPECÍFICO OU VICE-VERSA

//TIPOS
//UPCAST(IMPLÍCITO)
//DOWNCAST(EXPLÍCITO)

//EXEMPLOS
//LONG I; INT I = 10; I = I;
//INT I; LONG I = 100; I =(INT)I;
//DOUBLE D; FLOAT F = 105F; D = F;
//FLOAT F; DOUBLE D = 10.5D; D =(FLOAT) D;
//INT I; FLOAT F = 10.5F; I = (INT) F;,

