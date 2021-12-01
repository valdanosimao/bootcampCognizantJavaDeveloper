package com.bootcampCognizantJavaDeveloper.estruturaDeDados.filas;

public class Fila {
	
	private No refNoEntradaFila;
	
	public Fila() {
		this.refNoEntradaFila = null;
	}

	//refatoração
	public void enqueue(Object obj) {
		No novoNo = new No(obj);
		novoNo.setRefNo(refNoEntradaFila);
		refNoEntradaFila = novoNo;
	}
	
	public Object first() {
		if(!this.isEmpyt()) {
			No primeiroNo = refNoEntradaFila;
			while(true) {
				if(primeiroNo.getRefNo() != null) {
					primeiroNo = primeiroNo.getRefNo();
				} else {
					break;
				}
			}
			return primeiroNo.getObject();
		}
		return null;
	}
	
	public Object dequeue() {
		if(!this.isEmpyt()) {
			No primeiroNo = refNoEntradaFila;
			No noAuxiliar = refNoEntradaFila;
			while(true) {
				if(primeiroNo.getRefNo() != null) {
					noAuxiliar = primeiroNo;
					primeiroNo = primeiroNo.getRefNo();
				} else {
					noAuxiliar.setRefNo(null);
					break;
				}
			}
			return primeiroNo.getObject();
		}
		return null;
	}
	
	public boolean isEmpyt() {
		return refNoEntradaFila == null ? true : false; 
	}

	@Override
	public String toString() {
		String stringRetorno = "";
		No noAuxiliar = refNoEntradaFila;
		
		if(refNoEntradaFila != null) {
			while(true) {
				stringRetorno += " Objeto = " + noAuxiliar.getObject();
				if(noAuxiliar.getRefNo() != null) {
					noAuxiliar = noAuxiliar.getRefNo();					
				}else {
					stringRetorno += "null ";
					break;
				}
			}
			
		}else {
			
			stringRetorno = "null ";
		}
		
		return stringRetorno;
	}	
}

//FIFO
	//FIST IN, FIST OUT
	//O PRIMEIRO ELEMENTO QUE ENTRA É O PRIMEIRO A SAIR
	//MÉTODOS
	//ENQUEUE() ENFILEIRAR
	//DEQUEUE() DESINFILEIRAR
	//ISEMPTY TESTAR SE ESTÁ VAZIO
	