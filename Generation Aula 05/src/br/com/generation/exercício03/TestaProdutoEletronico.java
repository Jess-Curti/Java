package br.com.generation.exerc�cio03;

public class TestaProdutoEletronico {

	public static void main(String[] args) {
		
		ProdutoEletronico pc = new ProdutoEletronico();
		
		pc.nomeProduto = "Notebook";
		pc.marcaModelo = "Dell XPS";
		pc.precoInicial = 10149;
		
		System.out.println("Produto: " + pc.nomeProduto);
		System.out.println("Marca e modelo: " + pc.marcaModelo);
		System.out.println("Pre�o inicial: " + "R$" + pc.precoInicial);

		pc.precificar(2200);
		System.out.println("\nO pre�o do " + pc.nomeProduto + " " + pc.marcaModelo + " para o consumidor (com taxa) � de: R$" + pc.precoFinal + ".");
		
		
	}

}
