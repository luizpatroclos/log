package br.com.patroclos.secao21;

import java.util.HashSet;
import java.util.Set;

//Implementação de conjuntos do java
public class Programa65 {
	
	public static void main(String[] args) {
		
		Set<String> nomes = new HashSet<String>();
		
		nomes.add("Marcos");
		nomes.add("Juliano");
		nomes.add("Mauricio");
		nomes.add("Jorge");
		
		String nome1 = "Marcos";
		
		String nome2 = "Juliano";
		
		String nome3 = "Mauricio";
		
		System.out.println(nome1.hashCode());// Utiliza o hascode para verificar repetições na lista
		System.out.println(nome2.hashCode());
		System.out.println(nome3.hashCode());
		
		//System.out.println(nomes);
		
	}
}
