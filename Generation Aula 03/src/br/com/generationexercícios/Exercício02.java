package br.com.generationexercícios;

import java.util.Scanner;

public class Exercício02 {
	
	//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num = 0, contPar = 0, contImpar = 0;
		
			for(int cont = 1; cont <= 10; cont++) {
				System.out.println("Digite o " + cont + "º numero: ");
				num = input.nextInt();
				
				if(num % 2 == 0) {
					contPar++;
				}
				
				else {
					contImpar++;
				}
			}
		
			System.out.println("\nForam digitados " + contPar +  " números pares.");
			System.out.println("Foram digitados " + contImpar +  " números pares.");

		input.close();
	}

}
