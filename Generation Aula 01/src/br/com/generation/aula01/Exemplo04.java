package br.com.generation.aula01;

import java.util.Scanner;

public class Exemplo04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int a, b, resultado;
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextInt();
		System.out.println("Digite o valor de B: ");
		b = leia.nextInt();
		
		resultado = a + b;
		System.out.println("Resultado da soma: " + resultado);
		
		resultado = a - b;
		System.out.println("Resultado da subtra��o: " + resultado);
		
		resultado = a * b;
		System.out.println("Resultado da multiplica��o: " + resultado);
		
		resultado = a / b;
		System.out.println("Resultado da divis�o: " + resultado);
		
		leia.close();
	}

}
