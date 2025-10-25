package revisao;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Revisao3 {

	public static void main(String... args) {
		
		
		Map<Integer, String> mapa = new HashMap<Integer, String>();
		
		mapa.put(11, "notebook");
		mapa.put(22, "Televisão");
		mapa.put(33, "microondas");
		
		System.out.println(mapa.get(11));
		System.out.println(mapa.get(99));
		
		mapa.put(11, "ferro de passar");
		
		System.out.println(mapa.get(11));
		
		System.out.println("remover: " + mapa.remove(22));
		System.out.println(mapa.get(22));
		
		//iterar o map
		for(Entry<Integer, String> e : mapa.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}
}

