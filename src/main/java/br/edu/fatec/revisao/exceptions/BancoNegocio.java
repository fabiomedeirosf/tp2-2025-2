package br.edu.fatec.revisao.exceptions;

public class BancoNegocio {

	private static final Double LIMITE_SAQUE = 1000D;
	
	public void sacar(Double valor) throws RegraNegocioException, ValidacaoException {
		
		if(valor <= 0) {
			throw new ValidacaoException("Valor inválido: negativo ou 0: " + valor);
		}
		
		if(valor > LIMITE_SAQUE) {
			throw new RegraNegocioException("Limite saque excedido");
		}
	}
}
