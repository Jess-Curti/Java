package br.com.generation.condicionais;

import java.util.Scanner;

public class Exerc�cio04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int num, divisao;
		double pot, raiz;
		
		System.out.println("Digite um n�mero: ");
		num = leia.nextInt();
		
		divisao = num % 2;
		
		if (divisao == 0) {
			System.out.println("O n�mero digitado � par");
			raiz = Math.sqrt(num);
			System.out.println("A raiz quadrada �: " + raiz);
		}
		else {
			System.out.println("O n�mero digitado � �mpar");
			pot = Math.pow(num, 2);
			System.out.println("O n�mero elevado ao quadrado �: " + pot);
			
		}
	}
}
