package br.com.generation.classes02;

//Estanciando(criando) o objeto
public class TestaCarro {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		
		c1.modelo = "Fusca";
		c1.marca = "Volks";
		c1.anoFabricacao = 1991;
		c1.velocidade = 0;

		System.out.println("Modelo: " + c1.modelo);
		System.out.println("Velocidade: " + c1.velocidade);
		
		c1.acelerar(200);
		System.out.println("Velocidade: " + c1.velocidade);
		
		c1.freiar(50);
		System.out.println("Velocidade: " + c1.velocidade);	

	}

}
