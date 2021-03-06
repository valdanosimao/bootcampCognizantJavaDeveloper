package com.bootcampCognizantJavaDeveloper.variáveisTiposDeDadosOperadoresMatematicos;

public class OperadoresAritmeticos {

	public static void main(String[] args) {

		System.out.println("prePos");
		prePos();
		System.out.println("Aritmetico");
		aritmetico();
		System.out.println("Atribuicao");
		atribuicao();
		System.out.println("Precedencia");
		precedencia();

	}	
	
	//métodos
	private static void prePos() {
		
		int k = 10;
		
		int i = ++k;
		int j = k--;
		int x = k;
		
		System.out.println("i " + i);
		System.out.println("J " + j);
		System.out.println("x " + x);
	
	}	
	
	private static void aritmetico() {
		
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int e = 50;
		
		int r1 = a+b;
		int r2 = c-a;
		int r3 = d*b;
		int r4 = e/a;
		int r5 = c%b;
		
		System.out.println("a+b " + r1);
		System.out.println("c-a " + r2);
		System.out.println("d*b " + r3);
		System.out.println("e/a " + r4);
		System.out.println("c%b " + r5);
		
	}
	
	private static void atribuicao() {
		
		int i = 1500;
		short j = 15;
		long l = 500L;
		int k = 35;
		float f = 3.5F;
		double d = f;
		
		System.out.println("d " + d);
		
		i += 5; // i = i +5
		j -= 3; //j = j -3
		d /= 2.7D; //d = d / 2.7D
		l *= 3; // l = l * 3
		k %= 2; //k = k % 2
		
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		System.out.println("d: " + d);
		System.out.println("l: " + l);
		System.out.println("k: " + k);
		
		i = k = j;
		
		System.out.println("k:" + k);
		System.out.println("i:" + i);
	}

	public static void precedencia() {
		
		int i = 10;
		int j = 20;
		int k = 30;
		
		int a = i++ + --j * k; // 10 + 19 * 30 -> 10 + 570 -> 580
		
		System.out.println("i++ + --j * k " + a);
		
		System.out.println("i " + i); //11;
		
		int b = k / --i % 3 + 1; // 30 / 10 % 3 + 1 -> 1
		
		System.out.println("k / --i % 3 + 1 " + b );
		
		System.out.println("i " + i); // 10
		
		int c = 2;
		c *= i += 5; // c = 2 * i; i = i + 5 -> c = 2 * i; i = 10 * 5; -> c = 2 * 15; -> c = 2 * 15; c = 30
		System.out.println("c *= i += 5" + c);
	}
	
}

//CONCEITUAÇÃO
//SÃO SÍMBOLOS ESPECIAIS QUE SÃO CAPAZES DE REALIZAR AÇÕES ESPECÍFICAS EM UM, DOIS OU MAIS OPERANDOS
//E EM SEGUIDA RETORNA UM RESULTADO

//TIPOS
//PÓS-FIXADO: EXP++ OU EXP--
//PRÉ-FIXADO: ++EXP OU --EXP
//ARITIMÉTICO: + , - , * , / , %
//ATRIBUIÇÃO = , += , -= , *= M /= , %=

//ALGUNS EXEMPLOS
//INT I = ++K É A MESMA COISA QUE I = K + 1;
//I += 5 É A MESMA COIA QUE I = I + 5;

//**UTILIZAÇÃO , PRECEDÊNCIA, ORDEM DE EXECUÇÃO
// 1º PÓS-FIXADO: EXP++ OU EXP--
// 2º PRÉ-FIXADO: ++EXP OU --EXP
// 3º MULTIPLICATIVO 1º * , 2º / , 3º %
// 4º ADITIVO 1º + , 2º -
// 5º ATRIBUIÇÃO = , += , -= , *= , /= , %=

