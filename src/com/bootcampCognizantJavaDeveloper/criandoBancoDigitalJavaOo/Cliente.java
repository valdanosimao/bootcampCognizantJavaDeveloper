package com.bootcampCognizantJavaDeveloper.criandoBancoDigitalJavaOo;

public class Cliente {
	
	//atributos
	private String nome;
	private Conta conta;
	private Endereco endereco;
	
	
	//métodos implementáveis
	public void imprimirImformacoesCliente() {
		System.out.println("==== Informações do Cliente ====");
		System.out.println(String.format("Nome" + nome));
		System.out.println(String.format("Conta" + conta));
		System.out.println(String.format("Endereço" + endereco));
	}
	
	//métodos getters and setters
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
