package br.edu.fatec.revisao.heranca;

public class ImpostoRJ extends Imposto {

	@Override
	public Double calcularImposto(Double valor) {
		
		if(valor < 5000.0) {
			
			//valor do imposto padrao
			return super.calcularImposto(valor);
			
		} else if(valor >= 5000.0 && valor <= 100000.0) {
			return (valor * 0.215);
		} else {
			return (valor * 0.1);
		}
	}
}
