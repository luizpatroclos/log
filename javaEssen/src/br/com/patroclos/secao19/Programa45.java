package br.com.patroclos.secao19;

import java.util.ArrayList;
import java.util.Collections;

//Listas

/* Arrays (Vetores/Matrizes)
 * 
 * - Um array tem tamanho fixo. Ou seja, se criarmos um array com 5 elementos ele ter� sempre no m�ximo 5 elementos.
 * 
 * - Um array tem tipo de dado fixo. Ou seja, se criarmos um array de inteiros
 * ele s� poder� ter inteiros.
 * 
 * - � dif�cil encontrar um determinado elemento em um array. Precisamos para isso varrer todo o array atrav�s do seu �ndice,
 * caso n�o fa�amos busca pelo �ndice.
 * 
 * 
 *Collections ( Cole��es )
 *
 *- Java possui diversas classes/interfaces que facilitam muito o trabalho quando se trata de cole��es de dados.
 *Essas classes/interfaces s�o chamadas de Collections (cole��es).
 *  
 * 
 * Listas
 * 
 * - Aceitam repeti��o de valores;
 * - Possuem tamanho "infinito" (Depende da mem�ria);
 * 
 * - podemos adicionar valores de qualquer tipo, desde que n�o especificamos um tipo na declara��o
 * 
 * 
 * */
public class Programa45 {
	
	
	public static void main(String[] args) {
		
		//Sem definir um tipo de dado, podemos colocar qualquer tipo.
		//ArrayList nomes = new ArrayList();
		
		//Definimos aqui o tipo String
		ArrayList<String> nomes = new ArrayList<String>();
		
		nomes.add("M�rcio");
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
		
		System.out.println(" O tamanho do meu Array � -> " +nomes.size());
		
		System.out.println("############### Segue o Jogo ##########################");
											
		System.out.println("");
		System.out.println("############### Sem ordenar ##########################");
		for(int i = 0; i < nomes.size(); i++) {
			
			System.out.println("Nome do Cidad�o = " +nomes.get(i));
			
			
		}
		
		
		System.out.println("");
		System.out.println("############### Aplicando foreach  ##########################");
		
		Collections.sort(nomes);
		
		System.out.println("");
		System.out.println("############### Ordenado ##########################");
		
		for(String nome : nomes) {
			
			System.out.println(" Nome do Cidad�o : " +nome);

		}
		
		
		
		/*Scanner teclado = new Scanner(System.in);
		
			
			System.out.println("Escreva Algo: ");
			
			
			
		
	
		teclado.close();*/
		
		
	}
	
	
}
