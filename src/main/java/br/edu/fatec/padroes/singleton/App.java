package br.edu.fatec.padroes.singleton;

public class App {

	public static void main(String...strings) {
		
		//GerenciadorLogsSingleton log = new GerenciadorLogsSingleton();
		
		GerenciadorLogsSingleton.getInstance().logError("Deu errado!");
		GerenciadorLogsSingleton.getInstance().logInfo("Cliente alterado");
		
	}
	
	public static void alterarSalario(Double valor) {
		
		//GerenciadorLogsSingleton log = new GerenciadorLogsSingleton();
		
	}
}
