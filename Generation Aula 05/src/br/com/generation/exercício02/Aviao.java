package br.com.generation.exerc�cio02;

/*Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/

public class Aviao {
	
	//Atributos --> variaveis (espa�o na mem�ria)
		String nomeFabricante;
		String modelo;
		int numAssentos;
		int velocidade;
			
			
	//M�todos --> verbos --> a��es
	void acelerar(int aceleracao) {
		velocidade = velocidade + aceleracao;		
	}
		
	void freiar(int reduzir) {
		velocidade = velocidade - reduzir;
	}
	
}
