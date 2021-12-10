package br.com.generationfuncoes;

public class FuncaoSystemOut {

	public static void main(String[] args) {

		System.out.println("Insere uma linha, deixando o marcador "
				+ "posicionado na linha de baixo");
		
		System.out.print("\nMantem o cursor na mesma linha");
		
		System.out.print("\nJosé");
		System.out.print(" Da Silva");
		
		/*
		%d --> numeros inteiros
		%f --> numeros de ponto flutuante (floats)
		%2f --> doubles
		%.2f --> número de casas decimais
		%b --> booleanos
		%c --> caracter (char)
		%s --> cadeia de caracteres (string)
		 */
		
		double num1 = 10, num2 = 20; //%f --> numero de ponto flutuante (floats)
		System.out.printf("\nSoma das variáveis num1 e num2: %2f" ,(num1 + num2));
		
		int num3 = 10, num4 = 20; //%d --> numero inteiro 
		System.out.printf("\nSoma das variáveis num3 e num4: %d" ,(num3 + num4));
		
		System.out.printf("\n%s \n%s\n" , "Marcela", "Nogueira");
	}

}
