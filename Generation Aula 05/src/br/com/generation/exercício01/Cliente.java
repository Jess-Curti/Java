package br.com.generation.exercício01;

/*Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class Cliente {
	
	//Atributos --> variaveis (espaço na memória)
		String nome;
		int idade;
		double altura;
		
		
	//Métodos --> verbos
		void comprar() {
			System.out.println("\nCliente está comprando.");
		}
		
		void consultarPreco() {
			System.out.println("Cliente está consultando preço.\n");
		}
		
}
