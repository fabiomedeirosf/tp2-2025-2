package br.edu.fatec.revisao.exceptions;

public class RegraNegocioException extends Exception {

	public RegraNegocioException(String mensagem) {
		super(mensagem);
	}
	
	public RegraNegocioException(Throwable cause) {
		super(cause);
	}
	
	public RegraNegocioException(String mensagem, Throwable cause) {
		super(mensagem, cause);
	}
}
