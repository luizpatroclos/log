package br.com.patroclos.secao21;

import java.util.Stack;

//Filas

/*
Todo elemento entrar no final da fila.

 P primeiro elemento a entrar também o primeiro a sair.
 
 <- [0][1][2][3][4][5][6][7][8]
 
 
 
 * 
 * */
public class Programa62 {
	
	public static void main(String[] args) {
		
		Fila fila = new Fila();
		
		
		fila.adiciona("Angelina");
		fila.adiciona("Felicity");
		fila.adiciona("Maria");
		
		
		System.out.println(fila);
		
		String ret = fila.remove();
		System.out.println(ret);
		
		
		System.out.println(fila);
		
		fila.remove();
		fila.remove();
		fila.remove();
		
		System.out.println(fila);
		
		
	/*	Stack<String> nomes = new Stack<String>();
	
		System.out.println(nomes);
		nomes.push("Marcos");//Insere
		nomes.push("Dem");
		System.out.println(nomes);
		
		
		String ret = nomes.peek(); //Retorna o elemento do topo
		System.out.println(ret);
		System.out.println(nomes);
		
		String r1 = nomes.pop(); //Remove
		System.out.println(r1);
		System.out.println(nomes);*/
		
	}
}
