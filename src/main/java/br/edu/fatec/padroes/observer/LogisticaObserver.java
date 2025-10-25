package br.edu.fatec.padroes.observer;

public class LogisticaObserver implements PedidoObserver {

	@Override
	public void processarPedido(Pedido pedido) {
		System.out.println("Logistica: recebendo pedido");
		System.out.println(pedido.getCodigo());
		System.out.println("Logistica: pedido integrado, separando");
		
		
		
	}
}
