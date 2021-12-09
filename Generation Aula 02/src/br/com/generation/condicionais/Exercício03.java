package br.com.generation.condicionais;

import java.util.Scanner;

public class Exercício03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();

		
		if((idade >= 10) && (idade <= 14)) {
			System.out.println("\nVocê pertence a categoria infantil");
		}
		
		else if((idade >= 15) && (idade <= 17)) {
			System.out.println("\nVocê pertence a categoria juvenil");
		}
		else if ((idade >= 18) && (idade <= 25)){
			System.out.println("\nVocê pertence a categoria adulto");
		}
				

		
		
		
		
	}

}
