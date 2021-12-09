package br.com.generation.condicionais;

import java.util.Scanner;

public class Exercício02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double num1, num2, num3;
		
		System.out.println("Digite trÊs números: ");
		num1 = leia.nextDouble();
		num2 = leia.nextDouble();
		num3 = leia.nextDouble();
		
		//num1 < num2 < num3
		if((num1 <= num2) && (num2 <= num3)) {
			System.out.println("\nA ordem crescente é: " + num1 + ", " + num2 + ", " + num3);

		}
		
		//num1 < num3 < num2
		else if((num1 <= num3) && (num3 <= num2)) {
			System.out.println("\nA ordem crescente é: " + num1 + ", " + num3 + ", " + num2);

		}
		
		//num2 < num1 < num3
		else if((num2 <= num1) && (num1 <= num3)) {
			System.out.println("\nA ordem crescente é: " + num2 + ", " + num1 + ", " + num3);

		}
		
		//num2 < num3 < num1
		else if((num2 <= num3) && (num3 <= num1)) {
			System.out.println("\nA ordem crescente é: " + num2 + ", " + num3 + ", " + num1);

		}
		
		//num3 < num1 < num2
		else if((num3 <= num1) && (num1 <= num2)) {
			System.out.println("\nA ordem crescente é: " + num3 + ", " + num1 + ", " + num2);

		}
		
		//num3 < num2 < num1
		else if((num3 <= num2) && (num2 <= num1)) {
			System.out.println("\nA ordem crescente é: " + num3 + ", " + num2 + ", " + num1);

		}
		
	}

}
