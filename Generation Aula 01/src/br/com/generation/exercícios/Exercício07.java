package br.com.generation.exercícios;

import java.util.Scanner;

public class Exercício07 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		double A, B, C, D, E, F, X, Y, arredX, arredY;

		System.out.println("Qual o valor de A? ");
		A = (double)leia.nextDouble();
		
		System.out.println("Qual o valor de B? ");
		B = (double)leia.nextDouble();
		
		System.out.println("Qual o valor de C? ");
		C = (double)leia.nextDouble();

		System.out.println("Qual o valor de D? ");
		D = (double)leia.nextDouble(); 

		System.out.println("Qual o valor de E? ");
		E = (double)leia.nextDouble(); 

		System.out.println("Qual o valor de F? ");
		F = (double)leia.nextDouble();

		X = ((C*E)-(B*F))/((A*E)-(B*D));
		Y = ((A*F)-(C*D))/((A*E)-(B*D));

		arredX = Math.round(X);
		arredY = Math.round(Y);

		System.out.println("\nO valor de X é: " + arredX);
		System.out.println("O valor de Y é: " + arredY);
		
		leia.close();
		
	}

}
