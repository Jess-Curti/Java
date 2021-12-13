package br.com.generationvetores;

import java.util.Scanner;

public class ExemploVetor03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double[] notas = new double[4];
		double soma = 0.0, media = 0.0;
		
		int i;
		
		System.out.println("Digite as 4 notas do Aluno: ");
		for(i = 0; i < notas.length; i++) {
			notas[i] = entrada.nextDouble();
			soma = soma + notas[i];
			media = soma /4;
		}

		System.out.println("\nA soma das notas: " + soma);
		System.out.println("A média das notas: " + media);
		
		entrada.close();
		
		
	}

}
