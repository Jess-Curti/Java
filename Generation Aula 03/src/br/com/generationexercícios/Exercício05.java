package br.com.generationexerc�cios;

import java.util.Scanner;

public class Exerc�cio05 {
	
/*Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
 No final, mostre a soma dos n�meros digitados.(DO...WHILE)*/
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num, soma = 0;
		
		do {
			System.out.println("Digite um n�mero: ");
			num = input.nextInt();
			soma += num;
		}
		while (num != 0);
		
		System.out.println("\nA soma dos n�meros digitados �: " + soma);
		
		input.close();
	}
}
