package br.edu.fatec.revisao.financeira;

public class FinCaio extends FinanceiraPadrao {

	private static final Double LIMITE_DEPOSITO_INCENTIVADO = 10000D;
	
	@Override
	public void depositar(Conta conta, Double valor) {
		
		if(valor <= 0) {
			System.err.println("VAlor inválido");
			return;
		}
		
		if(valor <= LIMITE_DEPOSITO_INCENTIVADO) {
			valor = valor * 1.015;
		}
		
		System.out.println("Saldo Inicial: " + conta.getSaldo());
		conta.alterarSaldo(valor);
		System.out.println("Saldo Final: " + conta.getSaldo());
	}

	

}
