package br.edu.fatec.revisao;

public class App {

	public static final Double PI = 3.14;
	
	public static void main(String... args) {
		
		Aluno a1 = new Aluno("ana", "DSM");
		
		Aluno a2 = new Aluno("maria");
		
		System.out.println("a1: " + a1.observacao);
		System.out.println("a2: " + a2.observacao);
		
		a1.observacao = "pendente de trazer bolo";
		a2.observacao = "nao conhecemos";
		
		System.out.println("a1: " + Aluno.observacao);
		System.out.println("a2: " + Aluno.observacao);
		
		//App.PI = 49494D;
		System.out.println("pi: " + App.PI);
		
		
		
	}
}
