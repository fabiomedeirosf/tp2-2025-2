package br.edu.fatec.padroes.decorator;

import java.util.ArrayList;
import java.util.List;

public class CappuTudo extends BebidaComposta {

	private List<Bebida> listaBebidas = new ArrayList<Bebida>();
	
	public CappuTudo(Bebida bebida) {
		super.descricao = "Capuccino com todo sabor!";
		this.listaBebidas.add(bebida);
	}
	
	public CappuTudo(List<Bebida> bebidas) {
		this.listaBebidas = bebidas;
		super.descricao = "Capuccino com todo sabor!";		
	}
	
	@Override
	public String getDescricao() {
		return super.descricao;
	}
	
	@Override
	public Double getPreco() {
		Double preco = 4.0;
		for(Bebida b : this.listaBebidas) {
			preco += b.getPreco();
		}
		return preco;
	}
}
