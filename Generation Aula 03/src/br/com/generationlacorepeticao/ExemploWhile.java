package br.com.generationlacorepeticao;

public class ExemploWhile {

	public static void main(String[] args) throws InterruptedException {
		
		int contador = 0; //inicializando
		
		while(contador <= 10) { //condi��o
			
			System.out.println("Repeti��o: " + contador);
			
			contador++; //incremento
			Thread.sleep(1000); //determina o tempo de cada repeti��o; 1000 = 1 segundo	
		}
		
		System.out.println("Acabou a contagem");
	}

}
