package com.bootcampCognizantJavaDeveloper.logicaCondicionalControleFluxo;

public class OperadoresLogicos {

	public static void main(String[] args) {
	
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = false;
		
		System.out.println("b1 && b2 " + (b1 && b2));
		System.out.println("b1 && b3 " + (b1 && b3));
		
		System.out.println("b2 || b3 " + (b2 || b3));
		System.out.println("b2 || b4 " + (b2 || b4));
		
		System.out.println("b1 ^ b3 " + (b2 ^ b3));
		System.out.println("b4 ^ b1 " + (b4 ^ b1));
		
		System.out.println(!b1);
		System.out.println(!b2);
		
		int i1 = 10;
		int i2 = 5;
		float f1 = 20F;
		float f2 = 50F;		
		System.out.println("((i1 + i2 < (f2 - f1)) && true " + (((i1 + i2) < (f2 - f1)) && true));
		System.out.println("((i1 > i2 || (f2 < f1)) " + ((i1 > i2) || (f2 < f1)));
		
		double salarioMensal = 11893.58D;
		double mediaSalario = 10500D;
		
		int quantidadeDependentes = 4;
		int mediaDependentes = 2;
		
		//POR BOAS PRATICAS, É ESPERADO QUE VC CRIE VARIAVEIS PARA ENCURTAR O CÓDIGO, FEITO NA LINHDA 46
		System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));
		
		boolean salarioBaixo = salarioMensal < mediaSalario;
		boolean muitoDependentes = quantidadeDependentes >= mediaDependentes;
		
		System.out.println((salarioBaixo) && (muitoDependentes));	
		
		//BOAS PRÁTICAS
		boolean recebeAuxilio = (salarioBaixo) && (muitoDependentes);
		System.out.println("recebeAuxilio " + recebeAuxilio);
		
		
		

	}

}
