package br.edu.fatec.padroes.observer;

public class EmailObserver implements PedidoObserver {

	@Override
	public void processarPedido(Pedido pedido) {
		
		System.out.println("Email: enviando email...");
		System.out.println(pedido.getCliente());
		System.out.println("Email enviado =)");
		
	}
}
