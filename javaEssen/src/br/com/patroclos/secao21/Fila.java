package br.com.patroclos.secao21;

import java.util.LinkedList;
import java.util.List;

public class Fila {

	
	private List<String> nomes = new LinkedList<String>();

	public void adiciona(String nome) {
		this.nomes.add(nome);
	}
	
	public String remove() {
		
		try {
			return nomes.remove(0);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("A fila já está fazia");
			return "";
		}
		
	}
	
	public boolean vazia() {
		
		boolean valor = false;
		
		try {
			valor = this.nomes.size() == 0;
		} catch (IndexOutOfBoundsException e) {
			System.out.println("A fila já está fazia");
		}
		return valor;
	}
	
	
	@Override
	public String toString() {
		return this.nomes.toString();
	}
}
