package br.edu.fatec.padroes.decorator;

public class Leitinho extends Bebida {

	public Leitinho() {
		super.descricao = "Leitinho cremoso e quentinho delicioso";
	}
	@Override
	public String getDescricao() {
		return super.descricao;
	}
	
	@Override
	public Double getPreco() {
		return 7.0;
	}
}
