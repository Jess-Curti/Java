package br.com.generation.exercícios;

import java.util.Scanner;

public class Exercício03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int tempoTotalSegundos, tempoHoras, tempoMinutos, tempoSegundos, restoDivisaoHoras;

		System.out.println("Digite a Duração do evento em Segundos: ");
		tempoTotalSegundos = (int)leia.nextDouble();

		tempoHoras = tempoTotalSegundos / 3600;
		restoDivisaoHoras = tempoTotalSegundos % 3600;
		tempoMinutos = restoDivisaoHoras / 60;
		tempoSegundos = restoDivisaoHoras % 60;
	
		System.out.println("Horas: " + tempoHoras);
		System.out.println("Minutos: " + tempoMinutos);
		System.out.println("Segundos: " + tempoSegundos);
		
		leia.close();
	}

}
