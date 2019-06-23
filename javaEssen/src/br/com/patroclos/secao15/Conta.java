package br.com.patroclos.secao15;

public class Conta {
	
	private int numero;
	private String cliente;
	public static int contador = 1;
	
	public Conta(String cliente) {
		this.numero = contador++;
		this.cliente = cliente;
		
	}
	
	public String getCliente() {
		return this.cliente;
	}

	public int getNemero() {
		return this.numero;
	}
	
	public static int proximaConta() {
		return Conta.contador;
	}
	

}
