package br.edu.fatec.padroes.decorator;

public class App {

	public static void main(String...strings) {
		
		Bebida cafe = new CafeExpresso();
		
		System.out.println(cafe.getDescricao());
		System.out.println(cafe.getPreco());
		
		Bebida leite = new Leitinho();
		System.out.println(leite.getDescricao());
		System.out.println(leite.getPreco());
		
		Bebida capuccino = new Capuccino(cafe);
		System.out.println(capuccino.getDescricao());
		System.out.println(capuccino.getPreco());
	}
}
