package br.com.generation.classes04;

import java.util.Scanner;

public class TestaCarro2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Carro2 c1 = new Carro2();
		Carro2 c2 = new Carro2();
		
		System.out.println("Digite os dados do carro: ");
		c1.setModelo(sc.nextLine());
		c1.setMarca(sc.nextLine());
		
		c2.setModelo("Civic");
		c2.setMarca("Honda");
		
		System.out.println("Modelo: " + c1.getModelo());
		System.out.println("Marca: " + c1.getMarca());
		
		System.out.println("Modelo: " + c2.getModelo());
		System.out.println("Marca: " + c2.getMarca());
	}

}
