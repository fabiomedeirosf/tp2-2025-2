package br.edu.fatec.padroes.factorymethod;

public class ImpostoFactory {

	
	/**
	 * Factory responsável por criar uma nova
	 * instância do tipo de imposto desejado
	 * @return
	 */
	public static Imposto factory(ImpostoEnum tipoImposto) {
		
		Imposto imposto = null;
		
		if(tipoImposto.equals(ImpostoEnum.RENDA_FIXA)) {
			imposto = new RendaFixa();
		} else if (tipoImposto.equals(ImpostoEnum.SERVICO)) {
			imposto = new Servico();
		}
		
		return imposto;
	}
}
