package br.com.generation.classes02;

//prot�tipo
public class Carro {
	
	//Atributos --> variaveis (espa�o na mem�ria)
	String modelo;
	String marca;
	int anoFabricacao;
	int velocidade;
	
	//M�todos --> verbos --> a��es
	void acelerar(int aceleracao) {
		velocidade = velocidade + aceleracao;		
	}
	
	void freiar(int reduzir) {
		velocidade = velocidade - reduzir;
	}
}
