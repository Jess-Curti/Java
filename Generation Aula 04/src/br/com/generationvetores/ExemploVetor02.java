package br.com.generationvetores;

public class ExemploVetor02 {

	public static void main(String[] args) {

		double[] temp = new double[30];
		
		temp[0] = 30.8;
		temp[1] = 32; // double ja coloca 32.0
		temp[2] = 33.7;
		temp[3] = 34;
		temp[4] = 29.6;
		
		//System.out.println("O valor da temperatura do dia 3 é: " + temp[2]);
		
		//Para saber o tamanho do vetor usamos lenght
		//System.out.println("O tamanho do Array: " + temp.length);
		
		System.out.println("Os valores do Array: \n");
		
		for(int i = 0; i <= temp.length; i++) {
			System.out.println("O valor da temperatura do dia " + (i+1) + " é: " + temp[i]);
		}
	}

}
