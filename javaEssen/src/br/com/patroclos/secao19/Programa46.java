package br.com.patroclos.secao19;

import java.util.ArrayList;
import java.util.Collections;

//Listas

/*
 * */
public class Programa46 {
	
	
	public static void main(String[] args) {
	
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(42);
		numeros.add(24);
		numeros.add(12);
		numeros.add(2);
		numeros.add(91);
		
		
		System.out.println(" O tamanho do meu Array é -> " +numeros.size());
		
		System.out.println("############### Segue o Jogo ##########################");
											
		System.out.println("");
		System.out.println("############### Sem ordenar ##########################");
		for(int i = 0; i < numeros.size(); i++) {
			
			System.out.println("Nome do Cidadão = " +numeros.get(i));
			
			
		}
		
		
		System.out.println("");
		System.out.println("############### Aplicando foreach  ##########################");
		
		Collections.sort(numeros);
		
		System.out.println("");
		System.out.println("############### Ordenado ##########################");
		
		for(Integer nome : numeros) {
			
			System.out.println(" Nome do Cidadão : " +nome);

		}
		
		
		
		/*Scanner teclado = new Scanner(System.in);
		
			
			System.out.println("Escreva Algo: ");
			
			
			
		
	
		teclado.close();*/
		
		
	}
	
	
}
