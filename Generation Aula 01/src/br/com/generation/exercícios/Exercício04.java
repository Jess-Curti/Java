package br.com.generation.exercícios;

import java.util.Scanner;

public class Exercício04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int A, B, C, D, R, S;

		System.out.println("Digite um valor para A maior que zero: ");
		A = (int)leia.nextDouble();

		System.out.println("Digite um valor para B maior que zero: ");
		B = (int)leia.nextDouble();

		System.out.println("Digite um valor para C maior que zero: ");
		C = (int)leia.nextDouble();

		R = (A + B) * (A + B);
		S = (B + C) * (B + C);
		D = (R + S) / 2;
				
		System.out.println("Valor de R é: " + R);
		System.out.println("Valor de S é: " + S);
		System.out.println("Valor de D é: " + D);
		
		leia.close();		
	}
}
