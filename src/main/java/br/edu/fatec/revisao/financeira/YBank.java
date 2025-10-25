package br.edu.fatec.revisao.financeira;

public class YBank extends FinanceiraPadrao {

	private static final Double LIMITE_SAQUE = 1000D;
	
	@Override
	public void saque(Conta conta, Double valor) {
		
		Double saldoDisponivel = conta.getSaldo() + LIMITE_SAQUE;
		
		System.out.println("Saldo Disponível: " + saldoDisponivel);
		
		if(valor <= saldoDisponivel) {
			conta.alterarSaldo(-valor);
			System.out.println("Saldo atual: " + conta.getSaldo());
		} else {
			System.out.printf("Saldo %f, insuficiente para saque %f", 
					saldoDisponivel,
					valor);
		}
	}
}
