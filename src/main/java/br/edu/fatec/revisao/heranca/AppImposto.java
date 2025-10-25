package br.edu.fatec.revisao.heranca;

public class AppImposto {

	public static void main(String...strings) {
		
		Imposto imposto = new Imposto();
		
		System.out.println(imposto.calcularImposto(200.0));
	
		//imposto para mg
		
		imposto = new ImpostoMG();
		System.out.println("MG");
		System.out.println(imposto.calcularImposto(200.0));
		System.out.println(imposto.calcularImposto(2000D));
		
		//rJ
		imposto = new ImpostoRJ();
		System.out.println("RJ");
		
		System.out.println(imposto.calcularImposto(200.0));
		System.out.println(imposto.calcularImposto(6000D));
		System.out.println(imposto.calcularImposto(200000D));
		
		
	}
}
