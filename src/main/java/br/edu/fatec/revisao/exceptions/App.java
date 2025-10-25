package br.edu.fatec.revisao.exceptions;

public class App {

	public static void main(String... args) {
		
		BancoNegocio banco = new BancoNegocio();
		
		try {
			banco.sacar(1500D);
		} catch (RegraNegocioException | ValidacaoException e) {
			GerenciadorException.tratarException(e);
		}
	}
}
