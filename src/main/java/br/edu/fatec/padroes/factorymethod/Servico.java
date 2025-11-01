package br.edu.fatec.padroes.factorymethod;

public class Servico extends Imposto {

	@Override
	public Double calcularImposto(Double valor) {
		System.out.println("imposto servico");
		
		return (valor * 0.09);
	}
}
