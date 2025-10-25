package revisao;

import java.util.ArrayList;
import java.util.List;

public class Revisao2 {

	public static void main(String... args) {
		
		List<Integer> listaNumeros = new ArrayList<Integer>();
		List<Integer> listaMultiplos = new ArrayList<Integer>();
		
		//preencher
		for(int i = 0; i < 100; i++) {
			
			int numero = (int) (Math.random() * 1000);
			listaNumeros.add(numero);
		}
		
		//encontra os multiplos de 6
		for(Integer n : listaNumeros) {
			if(n % 6 == 0) {
				listaMultiplos.add(n);
			}
		}
		
		listaMultiplos.forEach(n -> {
			listaNumeros.remove(n);
		});
		
		System.out.println("Lista NUmeros: " + listaNumeros.size());
		System.out.println("Lista multiplos: " + listaMultiplos.size());
		

		
	}
}
