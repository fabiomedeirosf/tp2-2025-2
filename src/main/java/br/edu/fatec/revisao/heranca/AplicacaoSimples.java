package br.edu.fatec.revisao.heranca;

import java.util.ArrayList;
import java.util.List;

public class AplicacaoSimples extends Aplicacao {

	@Override
	public List<Double> calcularAplicacao(Double capital, Integer tempo, Double taxa) {
		
		List<Double> listaJuros = new ArrayList<Double>();
		
		//iterando os meses
		for(int i = 0; i < tempo; i++) {
			Double juro = (capital * taxa);
			listaJuros.add(juro);
		}
		
		return listaJuros;
	}
}
