package br.com.patroclos.secao19;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Conjuntos

/*
 * 
 * Os conjuntos s�o implementados com a interface Set, e uma das classes que implementam essa interface
 * � a HashSet
 * 
 * A maioria das cole��es possuem os mesmos m�todos j� conhecidos
 * e utilizados com as listas, mas o comportamento desses objetos � um pouco diferente.
 * 
 * 
 * A performance tamb�m � melhor em conjuntos do que em listas.
 * 
 * Caracter�sticas dos conjuntos:
 * 
 * - N�o aceitam valores repetidos;
 * - A ordem de inser��o n�o � respeitada (Realiza uma semi-ordena��o)
 * - N�o aceita ordena��o;
 * - N�o possui �ndice.
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
				System.out.println("Nome j� na Lista, Escolha outro :");
				i--;
			}

		}
		
		teclado.close();
		
		System.out.println("");
		System.out.println("############### Semi-Ordenado ##########################");
		
		for(String nome : nomes) {
			
			System.out.println(" Nome do Cidad�o : " +nome);

		}
		
		
	/*	nomes.add("M�rcio");
		nomes.add("Carlos");
		nomes.add("Marcos");
		nomes.add("Paulo");
		nomes.add("Roger");
		nomes.add("Fernando");
		nomes.add("Sher");
		nomes.add("Roger");
		nomes.add("M�rcio");// Conjunto n�o aceitam repeti��o de valores 
		
		*/
		
		
	
		
	
		
		
	}
	
	
}
