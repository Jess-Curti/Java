package br.com.generation.classes02;

//protótipo
public class Carro {
	
	//Atributos --> variaveis (espaço na memória)
	String modelo;
	String marca;
	int anoFabricacao;
	int velocidade;
	
	//Métodos --> verbos --> ações
	void acelerar(int aceleracao) {
		velocidade = velocidade + aceleracao;		
	}
	
	void freiar(int reduzir) {
		velocidade = velocidade - reduzir;
	}
}
