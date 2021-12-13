package br.com.generationexercicios;

import java.util.Scanner;

public class Exercicio01 {

	/*Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma atividade e o escreva em seguida.
	 Encontre ap�s a maior pontua��o e a apresente.*/

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] pontuacao = new int[5];
		int maior = 0;
		
		for(int c = 0; c < 5; c++) {
			System.out.print("Digite o " + (c+1) + "� valor: ");
			pontuacao[c] = input.nextInt();
			
			if(pontuacao[c] > maior) {
				maior = pontuacao[c];
			}
		}
		
		System.out.println("\nO maior valor digitado foi: " + maior);
		
		input.close();
		
	}
}

		