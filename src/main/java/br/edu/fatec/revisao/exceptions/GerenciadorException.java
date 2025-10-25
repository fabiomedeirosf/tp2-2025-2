package br.edu.fatec.revisao.exceptions;

public class GerenciadorException {

	public static void tratarException(Exception e) {
		
		if(e instanceof RegraNegocioException) {
			System.out.println("######### REGRA DE NEGÓCIO #############");
			System.out.println("Atenção para os procedimentos!");
			System.out.println(e.getMessage());
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		} else if(e instanceof ValidacaoException) {
			System.err.println("----- [Dado inválido - Atenção!] -------");
			System.out.println("Algum campo foi preenchido incorrentamente");
			System.out.println("Detalhes: " + e.getMessage());
			System.out.println("--------------------------------------------");
		}
	}
}
