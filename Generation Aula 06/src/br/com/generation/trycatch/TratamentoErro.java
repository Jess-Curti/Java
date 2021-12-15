package br.com.generation.trycatch;

public class TratamentoErro {

	public static void main(String[] args) {

		int[] vetor = new int[4]; //[0][1][2][3]
		System.out.println("Antes da Exception...(erro)");
		
		try {
		vetor[4] = 1;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Após o erro!!");
			metodo();
		}
	}
	
	public static void metodo() {
		System.out.println("Metodo");
	}

}
