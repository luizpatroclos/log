package br.com.patroclos.secao11;
/*
 * privado a própria classe
 * 
 * */
public class Programa27 {
	
	
	public static void main(String[] args) {
	
		Cliente cli1 = new Cliente(35,"Luiz", "Rodrigues Caldas 700");
		
		System.out.println("Nome: " + cli1.getNome());
		System.out.println("Endereço: " + cli1.getEndereco());
		
		Cliente cli2 = new Cliente(33,"Margarete", "Rodrigues Caldas 700");
		
		
		System.out.println("Nome: " + cli2.getNome());
		System.out.println("Endereço: " + cli2.getEndereco());
		
		//private
		//cli2.dizer_oi();
	}
	
	


	

}
