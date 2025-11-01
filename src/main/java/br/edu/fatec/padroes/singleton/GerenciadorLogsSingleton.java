package br.edu.fatec.padroes.singleton;

public class GerenciadorLogsSingleton {

	
	private static GerenciadorLogsSingleton instance;
	
	/**
	 * Construtor privado, garante que nenhum objeto da classe
	 * em questão será instanciado em qualquer parte da aplicação,
	 * exceto dentro da própria classe;
	 */
	private GerenciadorLogsSingleton() {
		
	}
	
	
	public synchronized static GerenciadorLogsSingleton getInstance() {
		
		if(instance == null) {
			instance = new GerenciadorLogsSingleton();
		}
		
		return instance;
	}
	
	
	public void logInfo(String mensagem) {
		System.out.println("INFO: " + mensagem);
	}
	
	public void logError(String mensagem) {
		System.err.println("Erro: " + mensagem);
	}
}
