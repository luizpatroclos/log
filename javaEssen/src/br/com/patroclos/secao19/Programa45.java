package br.com.patroclos.secao19;

import java.util.ArrayList;
import java.util.Collections;

//Listas

/* Arrays (Vetores/Matrizes)
 * 
 * - Um array tem tamanho fixo. Ou seja, se criarmos um array com 5 elementos ele terá sempre no máximo 5 elementos.
 * 
 * - Um array tem tipo de dado fixo. Ou seja, se criarmos um array de inteiros
 * ele só poderá ter inteiros.
 * 
 * - É difícil encontrar um determinado elemento em um array. Precisamos para isso varrer todo o array através do seu índice,
 * caso não façamos busca pelo índice.
 * 
 * 
 *Collections ( Coleções )
 *
 *- Java possui diversas classes/interfaces que facilitam muito o trabalho quando se trata de coleções de dados.
 *Essas classes/interfaces são chamadas de Collections (coleções).
 *  
 * 
 * Listas
 * 
 * - Aceitam repetição de valores;
 * - Possuem tamanho "infinito" (Depende da memória);
 * 
 * - podemos adicionar valores de qualquer tipo, desde que não especificamos um tipo na declaração
 * 
 * 
 * */
public class Programa45 {
	
	
	public static void main(String[] args) {
		
		//Sem definir um tipo de dado, podemos colocar qualquer tipo.
		//ArrayList nomes = new ArrayList();
		
		//Definimos aqui o tipo String
		ArrayList<String> nomes = new ArrayList<String>();
		
		nomes.add("Márcio");
		nomes.add("Carlos");
		nomes.add("Marcos");
		nomes.add("Paulo");
		nomes.add("Roger");
		nomes.add("Fernando");
		nomes.add("Sher");
		nomes.add("Roger");
		nomes.add("Mauro"); // String
		
		//nomes.add(true); // boolean
		//nomes.add(44);   // int
		//nomes.add(12.55); // double
		//nomes.add('e');  // char
		
		System.out.println(" O tamanho do meu Array é -> " +nomes.size());
		
		System.out.println("############### Segue o Jogo ##########################");
											
		System.out.println("");
		System.out.println("############### Sem ordenar ##########################");
		for(int i = 0; i < nomes.size(); i++) {
			
			System.out.println("Nome do Cidadão = " +nomes.get(i));
			
			
		}
		
		
		System.out.println("");
		System.out.println("############### Aplicando foreach  ##########################");
		
		Collections.sort(nomes);
		
		System.out.println("");
		System.out.println("############### Ordenado ##########################");
		
		for(String nome : nomes) {
			
			System.out.println(" Nome do Cidadão : " +nome);

		}
		
		
		
		/*Scanner teclado = new Scanner(System.in);
		
			
			System.out.println("Escreva Algo: ");
			
			
			
		
	
		teclado.close();*/
		
		
	}
	
	
}
