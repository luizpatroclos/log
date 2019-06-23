package br.com.patroclos.secao21;

//Listas Ligadas ( LinkedList )

/*
 *  
 Em um vetor os elementos estão um do lado do outro, enquanto em uma lista
 ligada, eles estão em lugares diferentes, porém um apon ta para o outro indicando o próximo
 elemento.
 
  [0][2][4][1][3]
 * 
 * */


public class Programa57 {
	
	public static void main(String[] args) {
		
		
	ListaLigada lista = new ListaLigada();
		
	System.out.println(lista);
	
	lista.adiciona("Jorge");
	
	System.out.println(lista);
	
	lista.adiciona("Luiz");
	
	System.out.println(lista);
	
	lista.removeDoComeco();
	
	System.out.println(lista);
	

	}
}
