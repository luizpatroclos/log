package br.com.patroclos.secao21;

import java.util.LinkedList;

//Conjuntos


/*
 Uma das caracteristicas dos conjuntos é a não aceitação de elementos repetidos. 
 
 
 Fera performance.
 
 A = ["Angelina", "Angela", "Anderson"...];
 B = ["Bruno", "Bianca", "Belgan"...];
 C = ["Carlos", "Claudson", "Creidon"...];
 D = ["Denilson", "Dem", "Dennis"...];
 E = ["Echo", "Elias", "Elivelton"...];
 F = ["Francisco", "Franciele", "Fatima"...];
 
 
 
 8 / 2 -> 4
 4 / 2 -> 2
 2 / 2 -> 0
 
 * */

public class Programa64 {
	
	public static void main(String[] args) {
		
		Conjunto conjunto = new Conjunto();
		
		System.out.println(conjunto);
		
		
		conjunto.adiciona("Luiz");
		conjunto.adiciona("Lauro");
		conjunto.adiciona("Marina");
		conjunto.adiciona("Márcio");
		conjunto.adiciona("Andrea");
		conjunto.adiciona("Anderson");
		
		System.out.println(conjunto);
		
		conjunto.remove("Marina");
		
		System.out.println(conjunto);
		
		/*String nome = "Angelina";
		int num = 112;
		
		//nome.toLowerCase().charAt(0) % 26;
		System.out.println(nome.toLowerCase().charAt(0) % 26);
		*/
		
		//System.out.println( num % 26);// qual é o resto da divisão de 8 por 2
		
		/*for (int i = 97; i < 123; i++) {
			
			System.out.println((char)i);
			
		}*/
		
				
					
	}
}
