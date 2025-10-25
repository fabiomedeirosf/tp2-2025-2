package br.edu.fatec.revisao.financeira;

public interface Financeira {

	public void depositar(Conta conta, Double valor);
	
	public void saque(Conta conta, Double valor);
	
}
