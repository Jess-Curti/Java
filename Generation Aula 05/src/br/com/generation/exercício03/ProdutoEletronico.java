package br.com.generation.exerc�cio03;

/*Crie uma classe produto eletr�nico e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto produto eletr�nico,
defina as instancias deste objeto e apresente as informa��es deste objeto
no console.*/

public class ProdutoEletronico {

	//Atributos --> variaveis (espa�o na mem�ria)
	String nomeProduto;
	String marcaModelo;
	double precoInicial;
	double precoFinal;
	
	//M�todos --> verbos --> a��es
	void precificar(int taxa) {
		precoFinal = precoInicial + taxa;
	}

	
	
	
	
	
}
