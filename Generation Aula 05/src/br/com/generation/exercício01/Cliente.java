package br.com.generation.exerc�cio01;

/*Crie uma classe cliente e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/

public class Cliente {
	
	//Atributos --> variaveis (espa�o na mem�ria)
		String nome;
		int idade;
		double altura;
		
		
	//M�todos --> verbos
		void comprar() {
			System.out.println("\nCliente est� comprando.");
		}
		
		void consultarPreco() {
			System.out.println("Cliente est� consultando pre�o.\n");
		}
		
}
