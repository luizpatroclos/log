package br.com.patroclos.secao22;

import java.util.ArrayList;
import java.util.List;

//Streams

/*

S�o fluxos de dados, ou fluxo de objetos.
Utilizados para que possamos trabalahar com esses dados de forma mais criteriosa.

- Quando trabalhamos com strem, os m�todos aplicados a esse strem n�o afetam a cole��o original.




 
 * */
public class Programa76 {
	
	public static void main(String[] args) {
		
		
		List<Curso> cursos = new ArrayList<Curso>();
		
		cursos.add(new Curso("Matem�tica",10));
		cursos.add(new Curso("Potugues",100));
		cursos.add(new Curso("Geografia",200));
		cursos.add(new Curso("Quimica",22));
		cursos.add(new Curso("F�sica",0));
		cursos.add(new Curso("Hist�ria",0));
		cursos.add(new Curso("Ingles",70));
		
		
		//Como fazer para imprimir somente os cursos com mais de 100 Alunos
		
		//cursos.stream().filter(c -> c.getAluno() >= 100).forEach(c -> System.out.println(c.getAluno())); // Lambda
		
		
		cursos.stream().filter(c -> c.getAluno() >= 100).forEach(System.out::println); // Method Reference

		System.out.println(cursos);
		
	
		
	
	}
}
