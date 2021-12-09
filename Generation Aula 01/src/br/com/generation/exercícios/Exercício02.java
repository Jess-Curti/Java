package br.com.generation.exercícios;

import java.util.Scanner;

public class Exercício02 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int idadeDias, conversaoAnos, restoDivisaoMeses, conversaoMeses, restanteDias;

		System.out.println("Digite Sua Idade em dias: ");
		idadeDias = (int)leia.nextDouble();

		conversaoAnos = idadeDias / 365;
		restoDivisaoMeses = idadeDias % 365;
		conversaoMeses = restoDivisaoMeses / 30;
		restanteDias = restoDivisaoMeses % 30;
	
		System.out.println("Anos: " + conversaoAnos);
		System.out.println("Meses: "+ conversaoMeses);
		System.out.println("Dias: "+ restanteDias);
		
		leia.close();
	}
}
