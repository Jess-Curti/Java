package br.com.generation.exerc�cio02;

public class Preguica extends Animal implements Acoes{

	@Override
	public void acao() {
		System.out.println("A pregui�a est� abra�ando a �rvore.");
		
	}

	@Override
	public void som() {
		System.out.println("A pregui�a est� ZZZZZZZZZ...");
		
	}

}
