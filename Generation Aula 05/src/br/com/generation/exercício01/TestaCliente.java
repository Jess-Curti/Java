package br.com.generation.exercício01;

public class TestaCliente {

	public static void main(String[] args) {
		
		//Classe nomeQueQuiser --> criar o objeto
		Cliente c1 = new Cliente();
		
		c1.nome = "Jeff";
		c1.idade = 37;
		c1.altura = 1.75;
		
		System.out.println(c1.nome);
		System.out.println(c1.idade);
		System.out.println(c1.altura);
		c1.comprar();
		c1.consultarPreco();
		
	}
}
