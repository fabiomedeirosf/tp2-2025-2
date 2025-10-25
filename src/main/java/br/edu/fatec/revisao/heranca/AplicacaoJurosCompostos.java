package br.edu.fatec.revisao.heranca;

import java.util.ArrayList;
import java.util.List;

public class AplicacaoJurosCompostos extends Aplicacao {

	@Override
	public List<Double> calcularAplicacao(Double capital, Integer tempo, Double taxa) {
		
		List<Double> listaJuros = new ArrayList<Double>();
		
		Double juro = 0D;
		Double capitalAcumulado = capital;
		for(int t = 0; t < tempo; t++) {
			
			juro = capitalAcumulado * taxa;
			
			capitalAcumulado += juro;
			listaJuros.add(juro);
		}
		
		
		return listaJuros;
	}

}
