package br.edu.fatec.padroes.decorator;

public class Capuccino extends BebidaComposta {
	
	private Bebida bebida;
	
	public Capuccino(Bebida bebida) {
		this.bebida = bebida;
		super.descricao = "Capuccino com sabor amor";
	}
	
	@Override
	public String getDescricao() {
		return super.descricao;
	}
	
	@Override
	public Double getPreco() {
		Double preco = this.bebida.getPreco() + 7.5;
		return preco;
	}
}
