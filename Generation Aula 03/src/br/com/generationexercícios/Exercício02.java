package br.com.generationexerc�cios;

import java.util.Scanner;

public class Exerc�cio02 {
	
	//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num = 0, contPar = 0, contImpar = 0;
		
			for(int cont = 1; cont <= 10; cont++) {
				System.out.println("Digite o " + cont + "� numero: ");
				num = input.nextInt();
				
				if(num % 2 == 0) {
					contPar++;
				}
				
				else {
					contImpar++;
				}
			}
		
			System.out.println("\nForam digitados " + contPar +  " n�meros pares.");
			System.out.println("Foram digitados " + contImpar +  " n�meros pares.");

		input.close();
	}

}
