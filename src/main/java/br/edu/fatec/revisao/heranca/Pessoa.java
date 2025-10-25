package br.edu.fatec.revisao.heranca;

public class Pessoa {

	protected String nome;
	
	protected Integer idade;
	
	protected String endereco;
	
	
	public void mostrarDados() {
		System.out.println("Nominho: " + this.nome
				+ "\nIdadezinha: " + this.idade
				+ "\nEnderecinho: " + this.endereco);
	}
	
	
}
