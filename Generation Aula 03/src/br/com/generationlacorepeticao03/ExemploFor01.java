package br.com.generationlacorepeticao03;

public class ExemploFor01 {

	public static void main(String[] args) throws InterruptedException{

		for(int i = 0; i <= 10; i++) {
			System.out.println("Repeti��o: " + i);
			Thread.sleep(500);
		}
				
	}

}
