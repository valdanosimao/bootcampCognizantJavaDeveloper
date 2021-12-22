package com.bootcampCognizantJavaDeveloper.criandoBancoDigitalJavaOo;

public class Cliente {
	
	//atributos
	private String nome;
	private Conta conta;
	private Endereco endereco;
	
	
	//m�todos implement�veis
	public void imprimirImformacoesCliente() {
		System.out.println("==== Informa��es do Cliente ====");
		System.out.println(String.format("Nome" + nome));
		System.out.println(String.format("Conta" + conta));
		System.out.println(String.format("Endere�o" + endereco));
	}
	
	//m�todos getters and setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", conta=" + conta + ", endereco=" + endereco + "]";
	}

}
