package com.bootcampCognizantJavaDeveloper.excecoes;

import javax.swing.JOptionPane;

public class UncheckedException {

	public static void main(String[] args) {

		boolean continueLopping = true;
		
		//enquanto o continueLopping verdadeiro, ele vai ficar repetindo o código
		while(continueLopping) {
			String a = JOptionPane.showInputDialog("Numerador: ");
			String b = JOptionPane.showInputDialog("Denominador: ");
			
			try {
				int resultado = dividir(Integer.parseInt(a) , Integer.parseInt(b));
				System.out.println("Resultado " + resultado);	
				continueLopping = false; //caso consiga, o looping sera falso e vai parar o lopping
			}catch(ArithmeticException e){
				//e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Divisão não pode ser por ZERO!!" + e.getMessage());			
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Não pode ser texto, digite números" + e.getMessage());
			}			
		}			
		
	}

	public static int dividir(int a, int b) {
		return a /b;
	}
	
}
