package revisao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Revisao5 {

	public static void main(String...strings) {
		
		List<Integer> listaNUmeros = new ArrayList<Integer>();
		
		for(int i = 0; i < 30; i++) {
			int numero = (int) (Math.random() * 100);
			listaNUmeros.add(numero);
		}
		
		System.out.println(listaNUmeros);
		
		Set<Integer> unicos = new HashSet<Integer>();
		
		for(Integer n : listaNUmeros) {
			unicos.add(n);
		}
		
		System.out.println(unicos);
	}
}
