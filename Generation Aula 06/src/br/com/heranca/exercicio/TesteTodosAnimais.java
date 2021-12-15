package br.com.heranca.exercicio;

public class TesteTodosAnimais {

	public static void main(String[] args) {

		Cachorro cr = new Cachorro();
		
		cr.setNome("Teddy Bear");
		cr.setIdade(5);
		
		System.out.println("Nome do cachorro: " + cr.getNome());
		System.out.println("Idade do cachorro: " + cr.getIdade() + " anos\n");
		
		cr.emitirSom();
		cr.correr();
		
	}

}
