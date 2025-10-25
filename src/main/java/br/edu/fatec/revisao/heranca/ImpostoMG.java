package br.edu.fatec.revisao.heranca;

public class ImpostoMG extends Imposto{

	@Override
	public Double calcularImposto(Double valor) {
		 
		if(valor < 1000.0) {
			return 0.0;
		} else {
			return (valor * 0.18);
		}
	}
}
