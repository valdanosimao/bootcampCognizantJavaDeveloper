package com.bootcampCognizantJavaDeveloper.logicaCondicionalControleFluxo;

public class ControleDeFluxo {

	public static void main(String[] args) {
	
		ifFlecha();
		ifSemFlecha();
		ifFerias();
		ifMenor();
		
		switchSemana();
		switchNumero();
		switchFerias();

	}

	private static void ifFlecha() {
		
		int mes = 5;
		if(mes == 1) {
			System.out.println("Janeiro");
		} else {
			if(mes == 2) {
				System.out.println("Fevereiro");
			} else {
				if(mes == 3) {
					System.out.println("mar�o");
				} if(mes == 4) { //N�O USAR O ELSE PARA COMPORTAMENTO PADR�O, ELE SERVE PARA ALGUMA EXCE��O, ALGUM VALOR N�O ENCONTRADO
						System.out.println("Abril");
					} else {
						System.out.println("Valor inv�lido");
					}
				
			}
		}
		
  }
	
	 
	private static void ifSemFlecha() {
		int mes = 3;
		if(mes == 1) {
			System.out.println("Janeiro");
		} else if(mes == 2) {
			System.out.println("Fevereiro");
		} else if(mes == 3) {
			System.out.println("Mar�o");
		} else if(mes == 4) {
			System.out.println("Abril");
		} if(mes == 5) { //N�O USAR O ELSE PRIMEIRO, POIS VAI SER UM ERRO DE PROGRAMA��O
			System.out.println("Maio");
		}else {
			System.out.println("N�mero inv�lido");
		}
	}
	
	//USANDO A MESMA VARI�VEL(MES), ENT�O O MELHOR CASO SERIA O SWITCH
	private static void ifFerias() {
		String mes = "Julho";
		if(mes == "Julho" || mes == "Dezembro" || mes == "Janeiro") {
			System.out.println("F�rias");
		}
	}
	
	private static void ifMenor() {
		double salarioMensal = 11893.58D;
		double mediaSalario = 10500D;
		
		int quantidadeDependentes = 4;
		int mediaDenpentes = 2;
		
		//MUITO GRANDE, USAR VARI�VEIS INTERMEDI�RIAS
		if((salarioMensal < mediaSalario) && (quantidadeDependentes > mediaDenpentes)) {
			System.out.println("Funcion�rio deve receber aux�lio");
		}		
		
		//VARI�VEIS INTERMEDI�RIAS
		boolean salarioBaixo = salarioMensal < mediaSalario;
		boolean muitosDependentes = quantidadeDependentes >= mediaDenpentes;
		
		//FORMA PADR�OZINHA
		if((salarioBaixo) && (muitosDependentes)) {
			System.out.println("Funcion�rio deve receber aux�lio");
		}
		
		//FORMA PADR�O
		boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
		if(recebeAuxilio) {
			System.out.println("Funcion�rio deve receber aux�lio");
		} else {
			System.out.println("Funcion�rio n�o recebe aux�lio");
		}
		
	}
	
	
	private static void switchSemana() {
		String dia = "Ter�a";
		switch (dia) {
		
		case "segunda":
			System.out.println(2);
			break;
		case "ter�a":
			System.out.println(3);
			break;
		case "quarta":		
			System.out.println(4);
			break;
		case "quinta":
			System.out.println(5);
			break;
		case "sexta":
			System.out.println(6);
		case "s�bado":
			System.out.println(7);
			break;
		case "domingo":
			System.out.println(1);
			break;
		default: //N�O USAR O DEFAULT PARA COMPORTAMENTO PADR�O, ELE SERVE PARA ALGUMA EXCE��O, ALGUM VALOR N�O ENCONTRADO
			System.out.println("Op��o inv�lida");
			break;
		}
	}
	
	private static void switchNumero(){
		int numero = 4;
		switch(numero){		
		
		case 1:
		case 2:
		case 3:
			System.out.println("Certo");
			break;
		case 4:
			System.out.println("Errado");
			break;
		case 5:
			System.out.println("Talvez");
			break;
		default:
			System.out.println("Valor indefinido");
			break;
		}
	}
	
	private static void switchFerias() {
		String mes = "Dezembro";
		switch(mes) {
		
		case "Dezembro":
		case "Julho":
		case "Janeiro":
			System.out.println("F�rias");
			break;
		default:
			System.out.println("M�s indefinico");
			break;		
		}
	}
	
	
}
