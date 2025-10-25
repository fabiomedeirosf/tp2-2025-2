package br.edu.fatec.revisao;

import java.util.Objects;

public class Aluno {

	private String nome;
	
	private Integer idade;
	
	protected String curso;
	
	String email;
	
	public static String observacao;
		
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public Aluno(String nome, String curso) {
		this.nome = nome;
		this.curso = curso;
	}
	
	public void setIdadade(Integer idade) {
		if(idade < 0) {
			this.idade = 0;
		} else {
			this.idade = idade;
		}
	}
	
	public Integer getIdade() {
		return this.idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(curso, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(curso, other.curso) && Objects.equals(nome, other.nome);
	}
	
	
}
