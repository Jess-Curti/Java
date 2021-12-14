package br.com.generation.metodos;

import java.util.Scanner;

public class TestaMetodos {
	
	//variaveis globais para utilizar em todos os m�todos
	static int num3 = 200;
	static int num4 = 600;
	static int sum;
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double valor9, valor10;
		
		System.out.println("Entre com dois valores: ");;
		valor9 = entrada.nextDouble();
		valor10 = entrada.nextDouble();
		
		metodo1();
		metodo2();
		metodo3();
		metodo4();
		metodo5(55, 99);
		metodo6(num3, num4);
		metodo7(valor9, valor10);
		
		System.out.println("\nContando... " + TestaMetodoFora.metodo8(num3, num4));
	}
	
	public static void metodo1() {
		System.out.println("Ol�, eu sou o primeiro m�todo/fun��o!");
	}
	
	public static void metodo2() {
		//variaveis locais, apenas do m�todo2
		double soma, numero1 = 10, numero2 = 20;
		soma = numero1 + numero2;
		System.out.println("A soma do m�todo 2 �: " + soma);
	}

	public static void metodo3() {
		sum = num3 + num4;
	}
	
	public static void metodo4() {
		System.out.println("A soma das vari�veis globais �: " + sum);
	}
	
	public static void metodo5(int n5, int n6) {
		int soma2 = n5 + n6;
		System.out.println("A soma no m�todo 5 �: " + soma2);
	}
	
	public static void metodo6(int num7, int num8) {
		int mult = num7 * num8;
		System.out.println("A multiplica��o no m�todo 6 �: " + mult);
	}
	
	public static void metodo7(double num9, double num10) {
		double div = num9 / num10;
		System.out.println("A divis�o no m�todo 7 �: " + div);
	}
}
