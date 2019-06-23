package br.com.patroclos.secao21;

import java.util.Stack;

//Pilhas - Implementação do java
public class Programa61 {
	
	public static void main(String[] args) {
		
		Stack<String> nomes = new Stack<String>();
	
		System.out.println(nomes);
		nomes.push("Marcos");//Insere
		nomes.push("Dem");
		System.out.println(nomes);
		
		
		String ret = nomes.peek(); //Retorna o elemento do topo
		System.out.println(ret);
		System.out.println(nomes);
		
		String r1 = nomes.pop(); //Remove
		System.out.println(r1);
		System.out.println(nomes);
		
	}
}
