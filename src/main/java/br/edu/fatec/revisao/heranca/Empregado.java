package br.edu.fatec.revisao.heranca;

public class Empregado extends Pessoa {

	protected Double salario;
	
	
	@Override
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Salarinho: " + salario);
	}
}
