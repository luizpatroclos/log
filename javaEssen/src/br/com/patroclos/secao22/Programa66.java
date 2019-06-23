package br.com.patroclos.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Default Methods

//São métodos concretos implementados em Interface.
//Estes métodos, como são concretos, ou seja, já possuem implementação, não precisam ser implementados nas 
//classes que implementam esta interface.

/*
 
 Novidade implementada a partir da versão 8 do java
 
 Atualmente, estamos na versão 10 do java
 
 * */
public class Programa66 {
	
	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<String>();
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		
		palavras.add("Erick");
		palavras.add("Luiz");
		palavras.add("Lion");
		palavras.add("Mel");
		palavras.add("Tan");
		palavras.add("Dem");
		palavras.add("Pé");
		palavras.add("Gil");
		palavras.add("Gilclei");
		palavras.add("Gilvano");
		palavras.add("Gilcelho");
		palavras.add("Gilca");
		palavras.add("Gilvano");
		
		//Collections.sort(palavras, comparador);//Ordena de forma alfabética
		
		palavras.sort(comparador);
		
		/*for (int i = 0; i < palavras.size(); i++) {
			
			System.out.println("A palavra " + palavras.get(i) + " tem tamanho " + palavras.get(i).length());
			
		}*/
		
		System.out.println(palavras);
		
	}
}
