package br.com.generation.exercício03;

public class TestaProdutoEletronico {

	public static void main(String[] args) {
		
		ProdutoEletronico pc = new ProdutoEletronico();
		
		pc.nomeProduto = "Notebook";
		pc.marcaModelo = "Dell XPS";
		pc.precoInicial = 10149;
		
		System.out.println("Produto: " + pc.nomeProduto);
		System.out.println("Marca e modelo: " + pc.marcaModelo);
		System.out.println("Preço inicial: " + "R$" + pc.precoInicial);

		pc.precificar(2200);
		System.out.println("\nO preço do " + pc.nomeProduto + " " + pc.marcaModelo + " para o consumidor (com taxa) é de: R$" + pc.precoFinal + ".");
		
		
	}

}
