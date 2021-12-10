package br.com.generationexercícios;

import java.util.Scanner;

public class Exercício05 {
	
/*Crie um programa que leia um número do teclado até que encontre um número igual a zero.
 No final, mostre a soma dos números digitados.(DO...WHILE)*/
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num, soma = 0;
		
		do {
			System.out.println("Digite um número: ");
			num = input.nextInt();
			soma += num;
		}
		while (num != 0);
		
		System.out.println("\nA soma dos números digitados é: " + soma);
		
		input.close();
	}
}
