package br.com.patroclos.secao13;

import br.com.patroclos.secao12.Aluno;

/*
 * Classes Abstratas
 * 
 * Recurso que proporciona um bloqueio na criação de objetos.
 * Não conseguimos instanciar objetos de uma classe abstrata.
 * */
public class Programa31 {
	
	
	public static void main(String[] args) {
	
	
		//Pessoa p1 = new Pessoa();
		
		Aluno a1 = new Aluno("Erick", 2005, "1145552", "erick.patroclos@gmail.com");
		
		System.out.println(a1);
	}

}
