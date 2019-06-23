package br.com.patroclos.secao11;


public class Programa25 {

	public static void main(String[] args) {
		
		
		Cliente joao = new Cliente(25,"Patroclos da Silva", "Est. Rodrigues Caldas");
		
		Cliente maria = new Cliente(28, "Maria da Silva","Est. Rodrigues Caldas");
		
		Conta conta_joao = new Conta(1, 100.00f, 700.0f, joao);
		Conta conta_maria = new Conta(2, 300.00f, 500.0f, maria);
		
		
		System.out.println("saldo do João: " + conta_joao.getSaldo());
		System.out.println("saldo da Maria: " + conta_maria.getSaldo());
		
		
		conta_joao.sacar(900);
		
		System.out.println("saldo do João: " + conta_joao.getSaldo());
	}

}
