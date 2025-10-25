package br.edu.fatec.revisao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class App3 {

	public static void main(String...strings) {
		
		int numeros[] = {2, 4, 5, 4, 2, 11, 2, 5, 66};
		
		somar(numeros);
		somar(1, 4, 6, 7, 4, 22);
		
		imprimirVetor(numeros);
		//collection array
		
		List<Integer> listaNumeros = new ArrayList<>();
		for(int i = 0; i < 100; i ++) {
			int numero = (int) (Math.random() * 100);
			listaNumeros.add(numero);
		}
		
		System.out.println("lista tipo array: for posicional");
		for(int i = 0; i < listaNumeros.size(); i++) {
			callPatyApi(listaNumeros.get(i));
		}
		
		System.out.println("lista tipo arrayÇ for enhanced");
		for(Integer v : listaNumeros) {
			callPatyApi(v);		
		}
		
		System.out.println("lista tipo array: foreach");
		listaNumeros.forEach(v -> {
			callPatyApi(v);
		});	
		
		//for paralelo
		System.out.println("for paralelo: ");
		listaNumeros.parallelStream().forEach(v -> {
			callPatyApi(v);
		});
	}
	
	public static void callPatyApi(Integer numero) {
		String thread = Thread.currentThread().getName();
		System.out.println("patyapi" + "["+ thread + "]" + numero);	
	}
	
	public static void imprimirVetor(int...valores) {
		
		System.out.println("#### Mostrar o vetor #####");
		
		for(int i = 0; i < valores.length; i++) {
			System.out.println(valores[i]);
		}
		
		System.out.println("for enhanced");
		//for enhanced
		for(Integer v : valores) {
			System.out.println(v);
		}
				
	}
	
	public static void somar(int... valores) {
		
		int soma = 0;
		
		for(int i = 0; i < valores.length; i++) {
			soma += valores[i];
		}
		
		System.out.println(soma);
	}
	
	
	
}
