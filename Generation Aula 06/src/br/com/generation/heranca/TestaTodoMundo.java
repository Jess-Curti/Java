package br.com.generation.heranca;

public class TestaTodoMundo {

	public static void main(String[] args) {

		Professor p1 = new Professor();
		p1.setNome("Cesar");
		p1.setIdade(30);
		p1.setEndereco("Rua: Diamantes, 145");
		p1.setSalario(20000.00);
		p1.setDisciplina("Geografia");
		
		System.out.println("Nome do professor: " + p1.getNome());
		System.out.println("Idade: " + p1.getIdade() + " anos.");
		System.out.println("Endereço: " + p1.getEndereco());
		System.out.println("Salário: " + p1.getSalario());
		System.out.println("Disciplina: " + p1.getDisciplina());
		
		//
		
		Aluno a1 = new Aluno();
		a1.setNome("Gustavo");
		a1.setIdade(20);
		a1.setEndereco("Rua: dos Estudantes, 192");
		a1.setSemestre("2º Semestre");
		a1.setCurso("Orientação à Objetos - Herança");
		
		System.out.println("\nNome do aluno: " + a1.getNome());
		System.out.println("Idade: " + a1.getIdade() + " anos.");
		System.out.println("Endereço: " + a1.getEndereco());
		System.out.println("Semestre: " + a1.getSemestre());
		System.out.println("Curso: " + a1.getCurso());
		
	}

}
