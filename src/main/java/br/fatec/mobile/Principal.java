package br.fatec.mobile;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String... args) {
		
		System.out.println("oii");
		
		List<Integer> listaInteiros = new ArrayList<Integer>();
		
		//inserir
		listaInteiros.add(98);
		listaInteiros.add(44);
		listaInteiros.add(32);
		listaInteiros.add(-199);
		listaInteiros.add(44);
		
		//consultar
		System.out.println(listaInteiros.remove(3));
		
		for(int i = 0; i < listaInteiros.size(); i++) {
			System.out.println(listaInteiros.get(i));
		}
		
		System.out.println("for enhanced");
		for(Integer n : listaInteiros) {
			System.out.println(n);
		}
		
		
		System.out.println("foreach");
		listaInteiros.forEach(n -> {
			System.out.println(n);
		});
		//numerinho aleatorio
		int numero = (int) (Math.random() * 100);
		System.out.println(numero);
		
	}
	
	
}
