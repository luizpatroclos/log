package br.com.patroclos.secao21;

//Pilhas

/*
 * S�o estruturas de dados onde o elemento que st� visivel/dispon�vel � o que est� 
 * sempre no topo.
 * 
 *  Os elementos ao serem adicionados em uma pilha, s�o adicionados sempre no topo.
 *  
 *  para remover os elementos de uma pilha, s� podemos remover o topo.
 * 
 * O primeiro elemento a entrar � o �ltimo a sair. FIFO - first in first out.
 * 
 * */


public class Programa60 {
	
	public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
	
	System.out.println(pilha);
	
	pilha.insere("Crayson");
	
	pilha.insere("Jackson");
		
	System.out.println(pilha);
	
	
	String ret = pilha.pegaTopo();
	System.out.println(ret);
	
	
	String r1 = pilha.remove();
	System.out.println(r1);
	
	System.out.println(pilha);
	
	System.out.println(!pilha.vazia());
	
	
	}
}
