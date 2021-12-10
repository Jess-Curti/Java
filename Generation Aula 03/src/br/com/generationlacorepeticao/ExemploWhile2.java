package br.com.generationlacorepeticao;

public class ExemploWhile2 {

	public static void main(String[] args) throws InterruptedException {
		
		int contador = 10; //inicializando
		
		while(contador >= 0) { //condição
			
			System.out.println("Repetição: " + contador);
			
			contador--; //incremento
			Thread.sleep(1000); //determina o tempo de cada repetição; 1000 = 1 segundo	
		}
		
		System.out.println("Acabou a contagem");
	}

}