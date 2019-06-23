package br.com.patroclos.secao21;

import java.util.LinkedList;
import java.util.Queue;

//Fila -> Implementação do java


public class Programa63 {
	
	public static void main(String[] args) {
		
		
		Queue<String> fila = new LinkedList<String>();
		
		
		System.out.println(fila);
		
		
		fila.add("Angelina");
		fila.add("Felicity");
		fila.add("Maria");
		
		System.out.println(fila);
		
		String ret = fila.poll(); // Remover
		System.out.println(ret);
		
		System.out.println(fila);
		
					
	}
}
