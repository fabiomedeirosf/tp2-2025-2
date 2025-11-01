package br.edu.fatec.padroes.factorymethod;

public class App {

	public static void main(String...strings) {
		
		Imposto imposto = ImpostoFactory
				.factory(ImpostoEnum.SERVICO);
		
		System.out.println(imposto.calcularImposto(3999.4));
		
		imposto = ImpostoFactory.factory(ImpostoEnum.RENDA_FIXA);
		
		System.out.println(imposto.calcularImposto(5000.0));
	}
}
