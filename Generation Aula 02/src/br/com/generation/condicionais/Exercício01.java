package br.com.generation.condicionais;

import java.util.Scanner;

public class Exerc�cio01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Digite o primeiro n�mero: ");
		num1 = leia.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		num2 = leia.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		num3 = leia.nextInt();
				
		if((num1 > num2) && (num1 > num3)) {
			System.out.println("\nO maior n�mero digitado �: " + num1);
		}
		else if((num2 > num1) && (num2 > num3)) {
			System.out.println("\nO maior n�mero digitado �: " + num2);
		}
		else if((num3 > num1) && (num3 > num2)) {
			System.out.println("\nO maior n�mero digitado �: " + num3);
		}
		else {
			System.out.println("\nOs n�meros digitados s�o iguais!");
		}			
	}

}
