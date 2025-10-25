package revisao;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Revisao4 {

	public static void main(String...strings) {
		
		Map<Integer, Integer> numeros = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < 30; i++) {
			int numero = (int) (Math.random() * 10);
			
			Integer quantidade = numeros.getOrDefault(numero, 0);
			
			numeros.put(numero, quantidade + 1);
			
		}
		
		
		System.out.println("Numero | Quantidade");
		for(Entry<Integer, Integer> n : numeros.entrySet()) {
			System.out.println(n.getKey() + "\t\t" + n.getValue());
		}
	}
}
