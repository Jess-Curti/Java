package br.com.generation.exercício02;

import br.com.generation.classes02.Carro;

public class TestaAviao {

	public static void main(String[] args) {
		
		Aviao a1 = new Aviao();
		
		a1.nomeFabricante = "Boeing";
		a1.modelo = "737-800";
		a1.numAssentos = 147;
		a1.velocidade = 0;

		System.out.println("Fabricante: " + a1.nomeFabricante);
		System.out.println("Modelo: " + a1.modelo);
		System.out.println("Quantidade de assentos: " + a1.numAssentos);

		a1.acelerar(836);
		System.out.println("\nVelocidade Aceleração: " + a1.velocidade + " Km/h");
		
		a1.freiar(273);
		System.out.println("Velocidade Frenagem: " + a1.velocidade + " Km/h");	

	}

}
