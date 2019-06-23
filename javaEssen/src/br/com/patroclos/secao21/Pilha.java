package br.com.patroclos.secao21;

import java.util.LinkedList;
import java.util.List;

public class Pilha {

	
	private List<String> nomes = new LinkedList<String>();
	
	/**
	 * Em uma pilha, inserimos elementos sempre no topo.
	 * 
	 * Na implementação do java para Pilhas (Stack) referente ao método 'push'
	 * 
	 * @param nome
	 */
	public void insere(String nome) {
		this.nomes.add(nome);
		
	}
	
	/**
	 * Em uma pilha, removemos sempre o elemento que está no topo.
	 * 
	 * Na implementação do java para Pilhas (Stack) referente ao método 'pop'
	 * 
	 * @return
	 */
	public String remove() {
		return nomes.remove(nomes.size() - 1);
	}
	
	public boolean vazia() {
		return nomes.size() == 0;
	}
	
	public String pegaTopo() {
		return nomes.get(nomes.size() - 1);
	}
	
	

	
	@Override
	public String toString() {
		
		return this.nomes.toString();
	}
	
}
