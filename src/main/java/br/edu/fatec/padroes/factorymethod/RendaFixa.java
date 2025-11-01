package br.edu.fatec.padroes.factorymethod;

public class RendaFixa extends Imposto{

	@Override
	public Double calcularImposto(Double valor) {
		System.out.println("Imposto Renda Fixa");
		return (valor * 0.15);
	}
}
