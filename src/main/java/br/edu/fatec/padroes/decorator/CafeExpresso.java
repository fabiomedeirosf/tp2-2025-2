package br.edu.fatec.padroes.decorator;

public class CafeExpresso extends Bebida {

	public CafeExpresso() {
		super.descricao = "Cafe Expresso mais gostoso e cremoso";
	}
	
	@Override
	public String getDescricao() {
		return super.descricao;
	}
	
	@Override
	public Double getPreco() {
		
		return 5.0;
	}
}
