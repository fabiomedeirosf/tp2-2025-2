package br.edu.fatec.revisao.heranca;

import java.util.List;

public class AplicacaoIncentiva extends AplicacaoJurosCompostos {

	private static final Double INCENTIVADO_ATE_1000 = 0.01;
	private static final Double INCENTIVADO_ATE_5000 = 0.02;
	private static final Double INCENTIVADO_PLUS = 0.005;
	
	@Override
	public List<Double> calcularAplicacao(Double capital, Integer tempo, Double taxa) {
		
		//reuso o componente de juros compostos
		List<Double> listaJuros = super.calcularAplicacao(capital, tempo, taxa);
		
		//aplico o icentivo dado o rendimento
		for(int i = 0; i < listaJuros.size(); i++) {
			
			Double rendimento = listaJuros.get(i);
			if(rendimento <= 1000) {
				rendimento += rendimento * INCENTIVADO_ATE_1000;
			} else if (rendimento > 1000 && rendimento <5000) {
				rendimento += rendimento * INCENTIVADO_ATE_5000;
			} else if (rendimento > 10000) {
				rendimento += rendimento * INCENTIVADO_PLUS;
			}
						
			
			listaJuros.set(i, rendimento);
		}
		
		return listaJuros;
	}

}
