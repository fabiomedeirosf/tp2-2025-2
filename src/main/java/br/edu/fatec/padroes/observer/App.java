package br.edu.fatec.padroes.observer;

public class App {

	public static void main(String...strings) {
		
		PedidoSubject pedidoSubject = new PedidoSubject();
		
		PedidoObserver emailObserver = new EmailObserver();
		PedidoObserver logisticaObserver = new LogisticaObserver();
		
		pedidoSubject.assinar(logisticaObserver);
		pedidoSubject.assinar(emailObserver);
		
		Pedido pedido1 = new Pedido();
		pedido1.setCliente("joao da silva");
		pedido1.setCodigo(23433);
		pedido1.setValor(2599.98);
		
		pedidoSubject.atualizacaoPedido(pedido1);
		
		pedidoSubject.cancelarAssinatura(logisticaObserver);
		
		pedidoSubject.atualizacaoPedido(pedido1);
	}
}
