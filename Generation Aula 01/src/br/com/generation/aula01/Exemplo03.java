package br.com.generation.aula01;

import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double galoes, litros;
		
		System.out.println("Digite a quantidade de galões: ");
		galoes = leia.nextInt();
		
		litros = galoes * 3.785;
		
		System.out.println("Quantidade de litros: " + litros);
		
		leia.close();
	}

}
