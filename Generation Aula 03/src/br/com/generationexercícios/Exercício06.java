package br.com.generationexercícios;

import java.util.Scanner;

public class Exercício06 {

	/*Escrever um programa que receba vários números inteiros no teclado.
	E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)*/
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double num, media = 0, soma = 0, contMedia = 0;
		
		do {
			System.out.println("Digite um número: ");
			num = input.nextDouble();
			if(num % 3 == 0 && num != 0) {
				soma += num;
				contMedia++;
			}
		}
		
		while(num != 0);
		
		media = soma / contMedia;
				
		System.out.println("\nA soma dos números múltiplos de 3 é: " + soma);
		System.out.println("A média dos números múltiplos de 3 é: " + media);

	input.close();
	
	}
}
