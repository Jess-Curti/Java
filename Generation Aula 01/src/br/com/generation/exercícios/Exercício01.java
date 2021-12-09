package br.com.generation.exercícios;

import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idadeAnos, idadeMeses, idadeDias, multiplicacaoAnos, multiplicacaoMeses, totalDias;
		
		System.out.println("Digite sua idade em anos: ");
		idadeAnos = (int)leia.nextDouble();
		System.out.println("Digite sua idade em meses: ");
		idadeMeses = (int) leia.nextDouble();
		System.out.println("Digite sua idade em dias: ");
		idadeDias = (int)leia.nextDouble();
		
		//Conversão em dias
		multiplicacaoAnos = idadeAnos * 365;
		multiplicacaoMeses = idadeMeses * 30;
		totalDias = multiplicacaoAnos + multiplicacaoMeses + idadeDias;
		
		System.out.println("Conversão de anos em dias: " + multiplicacaoAnos);
		System.out.println("Conversão de meses em dias: " + multiplicacaoMeses);
		System.out.println("Conversão de anos em dias: " + totalDias);

		leia.close();		
		
	}

}
