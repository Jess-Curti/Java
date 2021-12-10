package br.com.generationexerc�cios;

import java.util.Scanner;

public class Exerc�cio03 {
	
	/*Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com menos de 21 anos.
	Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)*/
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int idade = 0, menos21 = 0, mais50 = 0;
		
		while(idade != -99) {
			System.out.print("Digite uma idade: ");
			idade = input.nextInt();
			
			if(idade < 0 && idade != -99) {
				System.out.println("Idade inv�lida!");
			}
			
			if(idade < 21 && idade > 0) {
				menos21++;
			}
			
			if(idade > 50) {
				mais50++;
			}
		}

		System.out.println("\nO n�mero de pessoas com menos de 21 anos foi de " + menos21 + " pessoa(s)");
		System.out.println("O n�mero de pessoas com mais de 50 anos foi de " + mais50 + " pessoa(s)");
		
		input.close();
	}
}
