package br.com.patroclos.secao22;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Streams

/*

 
 * */
public class Programa80 {
	
	public static void main(String[] args) {
		
		
		List<Curso> cursos = new ArrayList<Curso>();
		
		cursos.add(new Curso("Matemática",10));
		cursos.add(new Curso("Portugues",100));
		cursos.add(new Curso("Geografia",200));
		cursos.add(new Curso("Quimica",22));
		cursos.add(new Curso("Física",0));
		cursos.add(new Curso("História",0));
		cursos.add(new Curso("Ingles",70));
		
		
		List<Curso> result = cursos.stream()
				.filter(c -> c.getAluno() >= 71)
				.collect(Collectors.toList());
		
		result.forEach(System.out :: println);
		
		
		cursos.stream()
		.filter(c -> c.getAluno() >= 71)
		.collect(Collectors.toMap(
				c -> c.getNome(),
				c -> c.getAluno()))
		.forEach((nome, aluno) -> System.out.println(nome + " tem " + aluno + " alunos"));
		
		
	/*	cursos.stream()
			.filter(c -> c.getAluno() >= 71) //1000
			.findAny() //pega qualquer um de acordo com o filtro
			.ifPresent(System.out :: println); //se encontrar algum curso, imprime
		*/
		
	
		
		
	
		
	
	}
}
