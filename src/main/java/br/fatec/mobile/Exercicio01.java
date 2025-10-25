package br.fatec.mobile;

import java.util.ArrayList;
import java.util.List;

public class Exercicio01 {

	public static void main(String...strings) {
		
		List<Integer> lista = new ArrayList<Integer>();
		
		//preencher
		for(int i = 0; i < 1000; i++) {
			int numero = (int) (Math.random() * 1000);
			lista.add(numero);
			//System.out.println(lista.get(i));
		}
		
		int contImpares = 0;
		int soma = 0;
		int somaPares = 0;
		int somaImpares = 0;
	
		for(Integer n : lista) {
			//impar
			if( n % 2 != 0) {
				contImpares++;
				somaImpares += n;
			} else {
				somaPares += n;
			}
			
			soma += n;
		}
		Double media = (double) soma / lista.size();

		//calcular a variancia
		double variancia = 0;
		
		for(Integer n : lista) {
			variancia += Math.pow((n - media), 2);
		}
		
		variancia = variancia / (lista.size() - 1);
		variancia = Math.sqrt(variancia);
		
		System.out.println("Total de ímpares: " + contImpares);
		System.out.println("Soma: " + soma);
		System.out.println("Diferenca somas: "+ (somaPares - somaImpares));
		System.out.println("Media: " + media);
		System.out.println("variancia: " + variancia);
		/**
		 * Otavio carvalho
		 * Brun
		 * Victor
		 * Matheus
		 * Doido
		 * Vitoria
		 * Menotti
		 * isabela
		 * Eric
		 * Jonahtan
		 * Cassio
		 * Adria
		 * Amanda
		 * Felipe 
		 * Cezar
		 * Otavio procopio
		 * Walter
		 * Felipe
		 * Wellington
		 * Adalton
		 * 
		 */
	}
}
