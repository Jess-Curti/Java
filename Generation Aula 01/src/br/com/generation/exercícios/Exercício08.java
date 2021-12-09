package br.com.generation.exercícios;

import java.util.Scanner;

public class Exercício08 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double CustoFabrica, CustoConsumidor, SomaPorcentagens, ValorImpostos;

		System.out.println("Custo de Fábrica: ");
		CustoFabrica = (double)leia.nextDouble();

		SomaPorcentagens = 28 + 45;
		ValorImpostos = CustoFabrica * (SomaPorcentagens / 100);
		CustoConsumidor = CustoFabrica + ValorImpostos;

		System.out.println("\nValor dos impostos: " + ValorImpostos);
		System.out.println("Custo do carro para o consumidor: " + CustoConsumidor);	
		
		leia.close();	
		
	}

}
