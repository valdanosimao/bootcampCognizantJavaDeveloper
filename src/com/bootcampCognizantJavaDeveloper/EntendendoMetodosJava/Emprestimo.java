package com.bootcampCognizantJavaDeveloper.EntendendoMetodosJava;

public class Emprestimo {
	
	public static int getDuasParcelas() {
		return 2;
	}
	
	public static int getTresParcelas() {
		return 3;
	}
	
	public static double getTaxaDuasParcelas() {
		return 0.3;
	}
	
	public static double getTaxaTressParcelas() {
		return 0.45;
	}
	
	
	public static void calcular(double valor, int parcelas) {
		if (parcelas == 2) {			
			double valorFinal = valor + (valor * getTaxaDuasParcelas());			
			System.out.println("Valor final do emprestimo, sendo pagamento em duas parcelas � " + valorFinal);
			
		}else if (parcelas == 3) {
			double valorFinal = valor + (valor * getTaxaTressParcelas());
			System.out.println("Valor final do emprestimo, sendo pagamento em tres parcelas � " + valorFinal);
			
		}else {
			System.out.println("Valor da parcela n�o aceita");
		}
	}
	
}
