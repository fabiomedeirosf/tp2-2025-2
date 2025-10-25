package br.edu.fatec.revisao.heranca;

import java.util.List;

public class AplicacaoAPP {

	public static void main(String...strings) {
		
		
		Aplicacao 	aplicacao = new AplicacaoSimples();
		
		Aplicacao aplicacaoJC = new AplicacaoJurosCompostos();
		
		Aplicacao aplicacaoIncentivada = new AplicacaoIncentiva();
		Double capital = 10000D;
		
		List<Double> rendimentos = 
				aplicacaoIncentivada.calcularAplicacao(capital, 10, 0.01);
		
		Double total = capital;
		
		for(Double d : rendimentos) {
			System.out.println("Rendimento: " + d);
			total += d;
		}
		
		
		System.out.println("Rendimento aplicacao: " + total);
		
	}
}
