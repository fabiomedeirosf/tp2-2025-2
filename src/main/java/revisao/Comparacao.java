package revisao;

import br.edu.fatec.revisao.Aluno;

public class Comparacao {

	public static void main(String[] strings) {
		
		String nome = new String("Fatec");
		
		String texto = "Fatec";
		
		String a = "Fatec";
		
		
		System.out.println("Nome: " + nome);
		System.out.println("Texto: " + texto);
		
		if(nome == texto) {
			System.out.println("Iguais");
		} else {
			System.out.println("diferentes");
		}
		
		if(nome.equals(a)) {
			System.out.println("equals: igual");
		} else {
			System.out.println("equals: diferentes");
		}
		
		Aluno a1 = new Aluno("Joao");
		Aluno a2 = new Aluno("Joao");
		
		String x = "fatec";
		x = "abc";
		
		String sql = "select nome, idade, abc ";
		sql += "from aluno";
		sql += " where nome = ?";
		sql += " and idade = ?";
		
		StringBuilder sql2 = new StringBuilder();
		sql2.append("select nome, idade, abc ")
			.append("from aluno")
			.append("where nome = ?");
		
		
		
		
		
	}
}
