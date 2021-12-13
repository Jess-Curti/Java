package br.com.generationvetores;

public class ExemploVetor01 {

	public static void main(String[] args) {

		int[] arrayVetor = new int[10]; //--> vetor de 10 posições
		
		//na posição 1 atribui o valor de 700;
		arrayVetor[1] = 700;
		
		//na posição 5 atribui o valor de 800;
		arrayVetor[5] = 800;
		
		for(int i = 0; i <=9; i++) {
			System.out.println(i + " - " + arrayVetor[i]);
		}
		
		//Valor na posição 1
		System.out.println(arrayVetor[1]);
		
	}

}
