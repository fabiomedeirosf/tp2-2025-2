package br.edu.fatec.revisao.heranca;

public class App {

	public static void main(String... strings) {
		
		Empregado emp = new Empregado();
		emp.nome = "joao";
		emp.idade = 22;
		emp.endereco = "franca city";
		
		emp.mostrarDados();
		
		Gerente g = new Gerente();
		g.nome = "maria";
		
		g.mostrarDados();
		
	}
	
	public static void aumentinho(Empregado empregado, Gerente gerente) {
		

	}
}
