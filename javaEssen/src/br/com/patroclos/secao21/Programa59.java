package br.com.patroclos.secao21;

//Listas duplamente Ligadas

/*
 *  
 * 
 * */


public class Programa59 {
	
	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		
		System.out.println(lista);
		lista.adiciona("Jorge");
		System.out.println(lista);
		lista.adiciona("Luiz");
		System.out.println(lista);	
		lista.adiciona("Erick");
		
		System.out.println(lista);
		
		lista.remove(8);
		
		System.out.println(lista);
	
	

	}
}
