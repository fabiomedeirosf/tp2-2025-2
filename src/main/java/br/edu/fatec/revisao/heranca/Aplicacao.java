package br.edu.fatec.revisao.heranca;

import java.util.List;

public abstract class Aplicacao {

	public abstract List<Double> calcularAplicacao(Double capital, Integer tempo, Double taxa);
		
	public Double calcularPercentual(Double valor, Double percentual) {
		
		return (valor * percentual) / 100;
	}
}
