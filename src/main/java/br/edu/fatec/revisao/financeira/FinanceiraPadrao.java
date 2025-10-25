package br.edu.fatec.revisao.financeira;

public abstract class FinanceiraPadrao implements Financeira {

	@Override
	public void saque(Conta conta, Double valor) {
		
		if(conta.getSaldo() < valor) {
			System.err.println("Saldo Insuficiente :( ");
			return;
		}
		
		System.out.println("Saldo Anterior: " + conta.getSaldo());
		conta.alterarSaldo(-valor);
		System.out.println("Novo saldo: " + conta.getSaldo());
		
	}
	
	@Override
	public void depositar(Conta conta, Double valor) {
		
		if(valor <= 0) {
			System.err.println("Valor inválido");
			return;
		}
		
		System.out.println("Saldo Anterior: " + conta.getSaldo());
		conta.alterarSaldo(valor);
		System.out.println("Novo saldo: " + conta.getSaldo());
		
	}
}
