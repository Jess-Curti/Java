package br.com.generation.exercício02;

/*Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class Aviao {
	
	//Atributos --> variaveis (espaço na memória)
		String nomeFabricante;
		String modelo;
		int numAssentos;
		int velocidade;
			
			
	//Métodos --> verbos --> ações
	void acelerar(int aceleracao) {
		velocidade = velocidade + aceleracao;		
	}
		
	void freiar(int reduzir) {
		velocidade = velocidade - reduzir;
	}
	
}
