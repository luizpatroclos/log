package br.com.patroclos.secao21;

//Armazenamento Sequencial

/*
 *  
 *  
 * 
 * */

public class Programa56 {
	
	public static void main(String[] args) {
	Vetor lista = new Vetor();
		
	for(int i = 0; i < 300; i++) {
		Aluno a = new Aluno("Satangos " + i);
		
		lista.adiciona(a);
	}
	
	System.out.println(lista);
	System.out.println(lista.tamanho());
	

	}
}
