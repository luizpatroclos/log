package br.com.patroclos.secao01;

import br.com.patroclos.secao11.Cliente;

public class Programa26 {

	public static void main(String[] args) {
		
		
		Cliente cli = new Cliente(32,"Patroclos da Silva", "Est. Rodrigues Caldas");
		
	
		System.out.println("Nome : " + cli.getNome() );
		
		System.out.println("Endereço : " + cli.getEndereco() );
		
	}

}
