package br.edu.fatec.padroes.observer;

import java.util.ArrayList;
import java.util.List;

public class PedidoSubject implements Subject {

	private List<PedidoObserver> listaAssinantes = new ArrayList<PedidoObserver>();
	
	private Pedido pedido;
	
	@Override
	public void assinar(PedidoObserver observer) {
		this.listaAssinantes.add(observer);
		
	}

	@Override
	public void cancelarAssinatura(PedidoObserver observer) {
		this.listaAssinantes.remove(observer);
		
	}

	@Override
	public void notificarObservers() {
		for(PedidoObserver o : this.listaAssinantes) {
			o.processarPedido(pedido);
		}
		
	}
	
	public void atualizacaoPedido(Pedido pedido) {
		this.pedido = pedido;
		this.notificarObservers();
	}

}
