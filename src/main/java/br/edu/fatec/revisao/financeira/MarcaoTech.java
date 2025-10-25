package br.edu.fatec.revisao.financeira;

public class MarcaoTech extends FinanceiraPadrao implements Financiamento {

	private static final Double INDICE_FINANCIAMENTO = 4D;
	
	@Override
	public void financiar(Conta conta, Double valor) {
		
		Double limiteFinanciar = conta.getSaldo() * INDICE_FINANCIAMENTO;
		
		if(valor > limiteFinanciar) {
			System.err.println("Limite financiamento exedido, limite: " +
				limiteFinanciar);
			return;
		}
		
		conta.setFinanciamento(valor);
		System.out.println("Financiamento aprovado!!! =) ");
	}
}
