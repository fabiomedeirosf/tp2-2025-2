package br.edu.fatec.padroes.observer;

public interface Subject {

	public void assinar(PedidoObserver observer);
	
	public void cancelarAssinatura(PedidoObserver observer);
	
	public void notificarObservers();
}
