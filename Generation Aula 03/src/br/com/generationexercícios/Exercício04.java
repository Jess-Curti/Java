package br.com.generationexercícios;

import java.util.Scanner;

public class Exercício04 {

/*Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma
  região. Para tanto, a cada uma das pessoas era perguntado: idade, sexo
 (1-feminino / 2-masculino / 3-Outros), e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa
 e 3, se a pessoa era agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas,
 calcule e mostre: (WHILE)
- o número de pessoas calmas; 
- o número de mulheres nervosas; 
- o número de homens agressivos; 
- o número de outros calmos;
- o número de pessoas nervosas com mais de 40 anos; 
- o número de pessoas calmas com menos de 18 anos.
*/
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
int idade, sexo, opcoes, cont=0, cont2=0, cont3=0, cont4=0, cont5=0, cont6=0, cont7=0;
		
		while(cont!=1) {
			System.out.print("Digite sua idade: ");
			idade = input.nextInt();
			
			System.out.print("Escolha seu sexo (1: feminino / 2: masculino / 3: outros): ");
			sexo = input.nextInt();
			
			System.out.print("Escolha sua caracteristica psicologica (1: calma / 2: nervosa / 3: agressiva): ");
			
			opcoes = input.nextInt();
			
			if(opcoes == 1) {
				cont2++;
			}
			
			if(sexo == 1 && opcoes == 2){
				cont3++;
			}
			
			if(sexo == 2 && opcoes == 3) {
				cont4++;
			}
			
			if(sexo == 3 && opcoes == 1) {
				cont5++;
			}
			
			if(idade > 40 && opcoes == 2) {
				cont6++;
			}
			
			if(idade < 18 && opcoes == 1) {
				cont7++;
			}
			
			cont++;
		}
		System.out.println("\nNúmero de pessoas calmas: "+cont2+""
				+"\nNúmero de mulheres nervosas: "+cont3
				+"\nNúmero de homens agressivos: "+cont4
				+"\nNúmero de outros calmos: "+cont5
				+"\nNúmero de pessoas nervosas com mais de 40 anos: "+cont6
				+"\nNúmero de pessoas calmas com menos de 18 anos: "+cont7);
		
		input.close();
	}
}