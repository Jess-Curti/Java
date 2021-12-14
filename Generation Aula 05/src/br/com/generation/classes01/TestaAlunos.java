package br.com.generation.classes01;

public class TestaAlunos {

	public static void main(String[] args) {
		
		//Classe nomeQueQuiser --> criar o objeto
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
		a1.nome = "Thayrine";
		a1.curso = "Bloco I - Java";
		a1.idade = 22;
		
		a2.nome = "Luiz";
		a2.curso = "Geografia";
		a2.idade = 20;
		
		System.out.println(a1.nome);
		System.out.println(a1.curso);
		System.out.println(a1.idade);
		a1.assistirAula();
		a1.escrever();
		
		System.out.println(a2.nome);
		System.out.println(a2.curso);
		System.out.println(a2.idade);
		a2.assistirAula();
		a2.escrever();
	}

}
