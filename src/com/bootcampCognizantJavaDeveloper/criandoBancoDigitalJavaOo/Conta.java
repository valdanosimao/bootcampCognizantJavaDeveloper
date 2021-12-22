package com.bootcampCognizantJavaDeveloper.criandoBancoDigitalJavaOo;

public class Conta {
	
	//atributos
	private String agencia;
	private int numero;
	private double saldo = 0.0;
	private TipoConta tipoConta;
	private Cliente cliente;
	private Banco banco;
	

	//métodos implementáveis
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void transferir(double valor, Conta contaDestino) {		
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public void aplicarNaPoupanca(double valor, Conta contaPoupanca) {	
		if(tipoConta == TipoConta.CONTA_CORRENTE) {
			this.sacar(valor);		
			contaPoupanca.depositar(valor);				
		}
		
	}
	
	public void imprimirExtrato() {
		System.out.println("=== Extrato ===");
		//System.out.println(String.format("Titular: " +  cliente.getNome()));
		System.out.println(String.format("Tipo de conta: "+ tipoConta));
		System.out.println(String.format("Agencia: "+ agencia));
		System.out.println(String.format("Número: %d", numero));
		System.out.println(String.format("Saldo: %.2f", saldo));
	}	

	//métodos getters and settters
	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public TipoConta getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(TipoConta tipoConta) {
		this.tipoConta = tipoConta;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Número = " + numero + "\nTipoConta = " + tipoConta;
	}

		
	
}
