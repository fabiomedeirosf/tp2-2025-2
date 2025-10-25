package revisao;

import br.edu.fatec.revisao.Aluno;

public class ComparacaoObjetos {

	public static void main(String...strings) {
		
		Aluno a1 = new Aluno("joao da silva");
		a1.setCurso("ADS");
		a1.setIdadade(22);
		
		Aluno a2 = new Aluno("joao da silva");
		a2.setCurso("ADS");
		a1.setIdadade(22);
		
		
		if(a1 == a2) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}
		
		if(a1.getNome().equals(a2.getNome())
				&& a1.getCurso().equals(a2.getCurso())) {
			System.out.println("mesmo alunos");
		} else {
			System.out.println("alunos diferentes");
		}
		
		if(a1.equals(a2)) {
			System.out.println("mesmo aluno");
		} else {
			System.out.println("aluno diferente");
		}
		
		System.out.println(a1);
		System.out.println(new Aluno("x"));
	}	
}
