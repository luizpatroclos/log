package br.com.patroclos.secao21;

//Armazenamento Sequencial

/*
 *  int numeros[] = new in[5];
 *  
 * 
 * */

public class Programa55 {
	
	public static void main(String[] args) throws InterruptedException {
		
	Aluno a1 = new Aluno("Satangos");
	Aluno a2 = new Aluno("Chaves");	
		
		
	Vetor lista = new Vetor();
	
	System.out.println("Total de Alunos : " + lista.tamanho());
	
	lista.adiciona(a1);
	System.out.println("Total de Alunos : " + lista.tamanho());
	
	lista.adiciona(a2);
	System.out.println("Total de Alunos : " + lista.tamanho());
	
	System.out.println(lista);
	
	System.out.println(lista.contem(a1));
	
	
	try {
		System.out.println(lista.pega(100));
	} catch (IllegalArgumentException e) {
		e.getMessage();
	}
	
	
	Aluno a3 = new Aluno("Maria");
	
	try {
		lista.adiciona(1, a3);
	} catch (IllegalArgumentException e) {
		e.getMessage();
	}
	
	lista.remove(0);
	
	System.err.println(lista);
	}
	
}
