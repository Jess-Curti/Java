package br.com.generation.exercícios;

import java.util.Scanner;

public class Exercício05 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double Nota1, NotaPond1, Nota2, NotaPond2, Nota3, NotaPond3, media;

		System.out.println("Primeira nota: ");
		Nota1 = (double)leia.nextDouble();
		System.out.println("Segunda nota: ");
		Nota2 = (double)leia.nextDouble();
		System.out.println("Terceira nota: ");
		Nota3 = (double)leia.nextDouble();

		NotaPond1 = Nota1 * 2;
		NotaPond2 = Nota2 * 3;
		NotaPond3 = Nota3 * 5;

		media = (NotaPond1 + NotaPond2 + NotaPond3) / 10;

		System.out.println("\nMédia = " + media);
		
		leia.close();
		
	}

}
