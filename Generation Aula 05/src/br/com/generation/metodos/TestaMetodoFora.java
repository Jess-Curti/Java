package br.com.generation.metodos;

public class TestaMetodoFora {

		static String metodo8(double i, double f) {
			String numeroString = "";
			
			for(double c = i; c <= f; c++) {
				numeroString += c + " | ";
			}
			
			return numeroString;		
	}

}
