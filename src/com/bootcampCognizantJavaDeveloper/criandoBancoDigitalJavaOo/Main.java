package com.bootcampCognizantJavaDeveloper.criandoBancoDigitalJavaOo;

public class Main {

	public static void main(String[] args) {
		
		Conta contaCorrente = new Conta();	
		Conta contaPoupanca = new Conta();
		
		Cliente cliente = new Cliente();
		
		Endereco end = new Endereco();
		end.setCep(51030225);
		end.setLogradouro("Rua Java");
		end.setNumero(7);
		end.setBairro("Boa Viagem");
		end.setCidade("Recife");
		end.setEstado("PE");
		end.setComplemento("Casa");
		
		cliente.setConta(contaPoupanca);
		cliente.setNome("Valdano Simão da Silva");
		cliente.imprimirImformacoesCliente();
		
		
		contaPoupanca.setTipoConta(TipoConta.CONTA_POUPANCA);
		contaPoupanca.setNumero(5);		
		contaPoupanca.setSaldo(25);
		
		contaCorrente.setTipoConta(TipoConta.CONTA_CORRENTE);
		contaCorrente.setNumero(6);
		contaCorrente.setAgencia("Banco do Brasil");
		contaCorrente.depositar(50);	
		contaCorrente.sacar(14.78);				
		contaCorrente.aplicarNaPoupanca(31.58, contaPoupanca);
		
		contaCorrente.setCliente(cliente);
		contaCorrente.imprimirExtrato();		
		
	}

}
