package br.com.patroclos.secao19;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Conjuntos

/*
 * 
 * Os conjuntos são implementados com a interface Set, e uma das classes que implementam essa interface
 * é a HashSet
 * 
 * A maioria das coleções possuem os mesmos métodos já conhecidos
 * e utilizados com as listas, mas o comportamento desses objetos é um pouco diferente.
 * 
 * 
 * A performance também é melhor em conjuntos do que em listas.
 * 
 * Características dos conjuntos:
 * 
 * - Não aceitam valores repetidos;
 * - A ordem de inserção não é respeitada (Realiza uma semi-ordenação)
 * - Não aceita ordenação;
 * - Não possui índice.
 * 
 * 
 * */
public class Programa48 {
	
	public static void main(String[] args) {
		
		String row = null;
		boolean ind = false;

		Scanner teclado = new Scanner(System.in);

		Set<String> nomes = new HashSet<String>();

		for (int i = 0; i < 5; i++) {

			System.out.println("Informe o " + (i + 1) + "/5 nome: ");
			row = teclado.nextLine();

			ind = nomes.add(row);

			if (!ind) {
				System.out.println("Nome já na Lista, Escolha outro :");
				i--;
			}

		}
		
		teclado.close();
		
		System.out.println("");
		System.out.println("############### Semi-Ordenado ##########################");
		
		for(String nome : nomes) {
			
			System.out.println(" Nome do Cidadão : " +nome);

		}
		
		
	/*	nomes.add("Márcio");
		nomes.add("Carlos");
		nomes.add("Marcos");
		nomes.add("Paulo");
		nomes.add("Roger");
		nomes.add("Fernando");
		nomes.add("Sher");
		nomes.add("Roger");
		nomes.add("Márcio");// Conjunto não aceitam repetição de valores 
		
		*/
		
		
	
		
	
		
		
	}
	
	
}
