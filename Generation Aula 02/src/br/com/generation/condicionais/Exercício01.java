package br.com.generation.condicionais;

import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Digite o primeiro número: ");
		num1 = leia.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = leia.nextInt();
		System.out.println("Digite o terceiro número: ");
		num3 = leia.nextInt();
				
		if((num1 > num2) && (num1 > num3)) {
			System.out.println("\nO maior número digitado é: " + num1);
		}
		else if((num2 > num1) && (num2 > num3)) {
			System.out.println("\nO maior número digitado é: " + num2);
		}
		else if((num3 > num1) && (num3 > num2)) {
			System.out.println("\nO maior número digitado é: " + num3);
		}
		else {
			System.out.println("\nOs números digitados são iguais!");
		}			
	}

}
