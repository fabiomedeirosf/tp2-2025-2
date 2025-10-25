package br.edu.fatec.revisao;

public class App2 {

	static Double a;
	
	public static void main(String...strings) {
		
		final Double a = 10.9;
		Double b = null;
		
		if(a > 10) {
			b = a * 2;
		}
		
		System.out.println(b);
		
			
		Integer resultado = new App2().somar(2, 3);
		System.out.println(resultado);
		
		imprimir("kairo querendo fugir");
			
	}
	
	/**
	 * métodos: com retorno e sem retorno
	 * 
	 * com retorno
	 * 
	 * <<tipo>> nome([parametros]) {
	 * 		return <<tipo>>
	 * }
	 * 
	 * não retorno: tipo retorno void
	 */
	
	Integer somar(Integer a, Integer b) {
		Integer soma = a + b;
		return soma;
	}
	
	static void imprimir(String texto) {
		System.out.println("Imprimindo...");
		System.out.println(texto);
	}
}
