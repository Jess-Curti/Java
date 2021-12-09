package br.com.generation.condicionais;

import java.util.Scanner;

public class Exercício04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int num, divisao;
		double pot, raiz;
		
		System.out.println("Digite um número: ");
		num = leia.nextInt();
		
		divisao = num % 2;
		
		if (divisao == 0) {
			System.out.println("O número digitado é par");
			raiz = Math.sqrt(num);
			System.out.println("A raiz quadrada é: " + raiz);
		}
		else {
			System.out.println("O número digitado é ímpar");
			pot = Math.pow(num, 2);
			System.out.println("O número elevado ao quadrado é: " + pot);
			
		}
	}
}
