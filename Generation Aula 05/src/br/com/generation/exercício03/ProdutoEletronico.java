package br.com.generation.exercício03;

/*Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.*/

public class ProdutoEletronico {

	//Atributos --> variaveis (espaço na memória)
	String nomeProduto;
	String marcaModelo;
	double precoInicial;
	double precoFinal;
	
	//Métodos --> verbos --> ações
	void precificar(int taxa) {
		precoFinal = precoInicial + taxa;
	}

	
	
	
	
	
}
