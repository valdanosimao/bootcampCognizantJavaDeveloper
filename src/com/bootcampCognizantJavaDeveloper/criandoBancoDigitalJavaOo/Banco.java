package com.bootcampCognizantJavaDeveloper.criandoBancoDigitalJavaOo;

import java.util.List;

public class Banco {
	
	//atributos
	private String nome;
	private Endereco endereco;
	private List<Cliente> clientes;
	private List<Conta> contas;

	public Banco(String nome, Endereco endereco, List<Cliente> clientes, List<Conta> contas) {		
		this.nome = nome;
		this.endereco = endereco;
		this.clientes = clientes;
		this.contas = contas;
	}

	public Banco() {
		
	}
	
	//métodos getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Banco(List<Cliente> cliente) {		
		this.setCliente(cliente);
	}


	public List<Cliente> getCliente() {
		return clientes;
	}

	public void setCliente(List<Cliente> cliente) {
		this.clientes = cliente;
	}

	public List<Conta> getConta() {
		return contas;
	}

	public void setConta(List<Conta> conta) {
		this.contas = conta;
	}

	
	
}
