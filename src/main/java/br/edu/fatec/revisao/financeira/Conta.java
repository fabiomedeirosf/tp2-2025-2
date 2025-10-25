package br.edu.fatec.revisao.financeira;

public class Conta {

	private String cliente;
	
	private Integer numero;
	
	private Double saldo;
	
	private Double financiamento;
	
	/**
	 * Construtor sobrecarregado que determina serem
	 * requeridos o cliente e o numero da conta
	 * @param cliente
	 * @param numero
	 */
	public Conta(String cliente, Integer numero) {
		this.cliente = cliente;
		this.numero = numero;
		this.saldo = 0D;
	}
	
	/**
	 * Método que altera o saldo
	 * @param valor positivo para somar e negativo para debitar
	 * @return saldo atualizado
	 */
	public Double alterarSaldo(Double valor) {
		this.saldo += valor;
		return this.saldo;
	}
	
	public Integer getConta() {
		return this.numero;
	}
	
	public void setNome(String cliente) {
		this.cliente = cliente;
	}
	
	public String getNome() {
		return this.cliente;
	}
	
	public Double getSaldo() {
		return this.saldo;
	}
	
	public void setFinanciamento(Double financiamento) {
		this.financiamento = financiamento;
	}
	
	public Double getFinanciamento() {
		return financiamento;
	}
}
