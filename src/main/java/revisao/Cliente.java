package revisao;

public class Cliente {

	private String nome;
	
	private Integer idade;
	
	private String cidade;
	

	
	/**
	 * Construtor sobrecarregado, overloading
	 * @param nome
	 */
	public Cliente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
}
