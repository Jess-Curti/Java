package br.com.generationexerc�cios;

import java.util.Scanner;

public class Exerc�cio06 {

	/*Escrever um programa que receba v�rios n�meros inteiros no teclado.
	E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)*/
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double num, media = 0, soma = 0, contMedia = 0;
		
		do {
			System.out.println("Digite um n�mero: ");
			num = input.nextDouble();
			if(num % 3 == 0 && num != 0) {
				soma += num;
				contMedia++;
			}
		}
		
		while(num != 0);
		
		media = soma / contMedia;
				
		System.out.println("\nA soma dos n�meros m�ltiplos de 3 �: " + soma);
		System.out.println("A m�dia dos n�meros m�ltiplos de 3 �: " + media);

	input.close();
	
	}
}
