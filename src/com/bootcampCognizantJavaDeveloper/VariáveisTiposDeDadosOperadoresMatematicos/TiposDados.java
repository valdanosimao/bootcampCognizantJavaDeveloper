package com.bootcampCognizantJavaDeveloper.VariáveisTiposDeDadosOperadoresMatematicos;

public class TiposDados {

	public static void main(String[] args) {
		
		byte numeroByte1 = 5;
		byte numeroByte2 = 15;
		
		short numeroShort1 = 25;
		short numeroShort2 = 35;
		
		int numeroInt1 = 50;
		int numeroInt2 = 100;
		
		long numeroLong1 = 50000000000L;
		long numeroLong2 = 90000889999L;
		
		float numeroFloat1 = 4.5F;
		float numeroFloat2 = 50.7F;
		
		double numeroDouble1 = 26.7;
		double numeroDouble2 = 4.5;
		
		char caracter1 = 'a'; //char só aceita 1 caracter
		char caracter2 = 'b';
		
		boolean verdadeiroOufalso1 = true;
		boolean verdadeiroOuFalso2 = false;
		
		String nome = "Valdano";
		String curso = "Java";
		
		System.out.println("bytes " + numeroByte1 + " | " + numeroByte2 + "\n");
		System.out.println("short " + numeroShort1 + " | " + numeroShort2 + "\n");
		System.out.println("int " + numeroInt1 + " | " + numeroInt2 + "\n");
		System.out.println("long " + numeroLong1 + " | " + numeroLong2 + "\n");
		System.out.println("float " + numeroFloat1 + " | " + numeroFloat2 + "\n");
		System.out.println("double " + numeroDouble1 + " | " + numeroDouble2 + "\n");
		System.out.println("char " + caracter1 + " | " + caracter2 + "\n");
		System.out.println("boolean " + verdadeiroOufalso1 + " | " + verdadeiroOuFalso2 + "\n");
		
		System.out.println("String " + nome + " | " + curso);
	}

}

//CONCEITUAÇÃO
//SÃO VALORES E CONSEQUENTEMENTE OPERAÇÕES QUE AS VARIÁVEIS PODEM ASSUMIR E SOFRER, RESPECTIVAMENTE

//TIPIFICAÇÃO
//ESTÁTICA(FORTE) VS DINÂMICA(FRACO)
//PRIMITIVO VS COMPOSTO

//OPÇÕES DE TIPOS
//TEXTUAL: STRING(STRING É OBJETO, UMA CLASSE), 'CHAR'
//NUMERAL: BYTE, SHORT, INT, LONG, FLOAT(TEM QUE COLOCAR O F), DOUBLE
//LÓGICO: BOOLEAN
//OBJETO

//**VALORES DEFAULT
//BYTE: 0
//SHORT:0
//INT 0
//LONG OL
//FLOAT 0.0F
//DOUBLE O.0D
//CHAR '\u0000'
//STRING E OBJETOS NULL
//BOOLEAN FALSE

//BOAS PRATICAS
//USAR DE FORMA ADEQUADA CADA TIPO DE DADOS PARA CADA INFORMAÇÃO




