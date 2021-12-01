package com.bootcampCognizantJavaDeveloper.estruturaDeDados.filas;

public class NoGenerics<T> {
	
	private T object;
	private NoGenerics<T> refNo;
	
	public NoGenerics(T object) {
		this.refNo = null;
		this.object = object;
	}

	public NoGenerics() {
	
	}

	public Object getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}

	@SuppressWarnings("rawtypes")
	public NoGenerics getRefNo() {
		return refNo;
	}

	@SuppressWarnings("unchecked")
	public void setRefNo(@SuppressWarnings("rawtypes") NoGenerics refNo) {
		this.refNo = refNo;
	}

	@Override
	public String toString() {
		return "Object = " + object;
	}	
	
	
	
	
	
	
}
