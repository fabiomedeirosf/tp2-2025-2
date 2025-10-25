package br.edu.fatec.revisao.financeira;

public class FinanceiraAPP {

	public static void main(String...strings) {
		
		Conta conta1 = new Conta("Fabio", 123);
		
		Financeira marcTech = new MarcaoTech();
		
		marcTech.depositar(conta1, 100.1);
		marcTech.depositar(conta1, 55.00);
		
		marcTech.saque(conta1, 24.99);
		marcTech.saque(conta1, 400D);
		
		System.out.println("##### Fincaio");
		Financeira finCaio = new FinCaio();
		Conta conta2 = new Conta("Ana", 987);
		finCaio.depositar(conta2, 1000D);
		
	}
}
