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
					System.out.println("março");
				} if(mes == 4) { //NÃO USAR O ELSE PARA COMPORTAMENTO PADRÃO, ELE SERVE PARA ALGUMA EXCEÇÃO, ALGUM VALOR NÃO ENCONTRADO
						System.out.println("Abril");
					} else {
						System.out.println("Valor inválido");
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
			System.out.println("Março");
		} else if(mes == 4) {
			System.out.println("Abril");
		} if(mes == 5) { //NÃO USAR O ELSE PRIMEIRO, POIS VAI SER UM ERRO DE PROGRAMAÇÃO
			System.out.println("Maio");
		}else {
			System.out.println("Número inválido");
		}
	}
	
	//USANDO A MESMA VARIÁVEL(MES), ENTÃO O MELHOR CASO SERIA O SWITCH
	private static void ifFerias() {
		String mes = "Julho";
		if(mes == "Julho" || mes == "Dezembro" || mes == "Janeiro") {
			System.out.println("Férias");
		}
	}
	
	private static void ifMenor() {
		double salarioMensal = 11893.58D;
		double mediaSalario = 10500D;
		
		int quantidadeDependentes = 4;
		int mediaDenpentes = 2;
		
		//MUITO GRANDE, USAR VARIÁVEIS INTERMEDIÁRIAS
		if((salarioMensal < mediaSalario) && (quantidadeDependentes > mediaDenpentes)) {
			System.out.println("Funcionário deve receber auxílio");
		}		
		
		//VARIÁVEIS INTERMEDIÁRIAS
		boolean salarioBaixo = salarioMensal < mediaSalario;
		boolean muitosDependentes = quantidadeDependentes >= mediaDenpentes;
		
		//FORMA PADRÃOZINHA
		if((salarioBaixo) && (muitosDependentes)) {
			System.out.println("Funcionário deve receber auxílio");
		}
		
		//FORMA PADRÃO
		boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
		if(recebeAuxilio) {
			System.out.println("Funcionário deve receber auxílio");
		} else {
			System.out.println("Funcionário não recebe auxílio");
		}
		
	}
	
	
	private static void switchSemana() {
		String dia = "Terça";
		switch (dia) {
		
		case "segunda":
			System.out.println(2);
			break;
		case "terça":
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
		case "sábado":
			System.out.println(7);
			break;
		case "domingo":
			System.out.println(1);
			break;
		default: //NÃO USAR O DEFAULT PARA COMPORTAMENTO PADRÃO, ELE SERVE PARA ALGUMA EXCEÇÃO, ALGUM VALOR NÃO ENCONTRADO
			System.out.println("Opção inválida");
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
			System.out.println("Férias");
			break;
		default:
			System.out.println("Mês indefinico");
			break;		
		}
	}
	
	
}
