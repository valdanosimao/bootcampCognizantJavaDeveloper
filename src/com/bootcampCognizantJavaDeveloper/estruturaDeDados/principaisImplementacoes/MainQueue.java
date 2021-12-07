package com.bootcampCognizantJavaDeveloper.estruturaDeDados.principaisImplementacoes;

import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {

	public static void main(String[] args) {
		
		//fila
		Queue<Carro> queueCarro = new LinkedList<>();
		
		queueCarro.add(new Carro("Ford"));
		queueCarro.add(new Carro("Chevrolet"));
		queueCarro.add(new Carro("Fiat"));

		System.out.println(queueCarro.add(new Carro("Pegout")));
		System.out.println(queueCarro);
		
		System.out.println(queueCarro.offer(new Carro("Renaut")));//retorna false se n�o conseguir exacutar
		System.out.println(queueCarro);
		
		System.out.println(queueCarro.peek());//n�o remove
		System.out.println(queueCarro);
		
		System.out.println(queueCarro.poll());
		System.out.println(queueCarro);
		
		System.out.println(queueCarro.isEmpty());
		
		System.out.println(queueCarro.size());
		
	}

}
