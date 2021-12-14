package br.com.generation.classes04;

public class Carro2 {
	
	//Atributos --> encapsulados
	private String modelo;
	private String marca;
	private int numPassageiros;
	private double capacidadeCombustivel;
	
	//Métodos/Serviços de acesso e modificação dos atributos
	public String getModelo() { //--> recuperar os dados que está no atributo modelo
		return modelo;
	}
	public void setModelo(String modelo) { //--> modificar os dados que está no atributo modelo
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getNumPassageiros() {
		return numPassageiros;
	}
	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}
	public double getCapacidadeCombustivel() {
		return capacidadeCombustivel;
	}
	public void setCapacidadeCombustivel(double capacidadeCombustivel) {
		this.capacidadeCombustivel = capacidadeCombustivel;
	}

	
}
