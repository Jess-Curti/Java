package br.com.generation.construtor;

public class Pessoa {

	String nome;
	int idade;
	
	//Construtor da classe pessoa
	
	/*Pessoa(){
		System.out.println("Inicializando a classe Pessoa!");
		nome = "Isabel";
		idade = 22;
	}*/
	
	Pessoa(String n, int i){
		nome  = n;
		idade = i;
	}
}
