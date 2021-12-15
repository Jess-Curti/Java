package br.com.generation.construtor;

import java.util.Scanner;

public class TestaConstrutor {
	
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Digite seu nome: ");
	String nome = sc.nextLine();
	
	System.out.print("Digite sua idade: ");
	int idade = sc.nextInt();
	
	Pessoa objeto = new Pessoa(nome, idade);
	
	System.out.println("\nNome: " + objeto.nome);
	System.out.println("Idade: " + objeto.idade);
	}
}
