package revisao;

import java.util.ArrayList;
import java.util.List;

public class Revisao1 {

	public static void main(String... args) {
		
		List<String> lista = new ArrayList<String>();
		lista.add("televisao");
		lista.add("geladeira");
		lista.add("ps5");
		lista.add("notebook");
		lista.add("celular");
		
		String termo = "geladeira";
		
		for(String s : lista) {
			if(s.equals(termo)) {
				System.out.println("Contem geladeira");
			}
		}
		
		System.out.println(lista.contains(termo));
		
		String resultado = lista.stream()
				.filter(s -> s.equals("piscina do menotti"))
				.findAny()
				.orElse("nao achou");
		
		System.out.println(resultado);
		
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		
		Cliente c1 = new Cliente("Fabio");
		Cliente c2 = new Cliente("Ana");
		Cliente c3 = new Cliente("Maria");
		
		listaClientes.add(c1);
		listaClientes.add(c2);
		listaClientes.add(c3);
		
		listaClientes.forEach(c -> {
			System.out.println(c.getNome());
		});
		
		/*
		 * Crie uma lista de inteiros, preencha-a com 100 elementos
		 * 
		 * Crie uma segunda lista contendo apenas os numeros que são
		 * múltiplos de 6, remova o número da lista inicial;
		 * 
		 * Mostre o tamanho e o conteúdo de cada lista
		 * 
		 * Calcule a soma dos elementos de cada.
		 */
		
		
		
	}
}
