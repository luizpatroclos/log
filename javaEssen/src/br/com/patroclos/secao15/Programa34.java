package br.com.patroclos.secao15;

/*
 * Atributos estáticos
 * 
 * São atributos onde os valores são compartilhados
 * entre as instâncias da classe.
 * 
 * 
 * */
public class Programa34 {
	
	
	public static void main(String[] args) {
	
		Conta c1 = new Conta("Rafaela");
		
		System.out.println(c1.getNemero());
		System.out.println(c1.getCliente());
	
		
		System.out.println("#####################  Cliente #############################");
		
		
		Conta c2 = new Conta("Creide");
		
		System.out.println(c2.getNemero());
		System.out.println(c2.getCliente());

		
		System.out.println("#####################  Cliente #############################");
		
		
		Conta c3 = new Conta("Joyce");
		
		System.out.println(c3.getNemero());
		System.out.println(c3.getCliente());
		
		
	}

}
