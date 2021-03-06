package br.com.patroclos.secao22;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Streams + Thread (Paralelisto)

/*


Util qunado estamos trabalhando com milh�es/Bilh�es de dados.

N�o � recomendado para quantidade pequena de dados.
 
 * */
public class Programa81 {
	
	public static void main(String[] args) {
		
		
		List<Curso> cursos = new ArrayList<Curso>();
		
		cursos.add(new Curso("Matem�tica",10));
		cursos.add(new Curso("Portugues",100));
		cursos.add(new Curso("Geografia",200));
		cursos.add(new Curso("Quimica",22));
		cursos.add(new Curso("F�sica",0));
		cursos.add(new Curso("Hist�ria",0));
		cursos.add(new Curso("Ingles",70));
		
		
		List<Curso> result = cursos.stream()
				.filter(c -> c.getAluno() >= 71)
				.collect(Collectors.toList());
		
		result.forEach(System.out :: println);
		
		
		//Utilizando ParallelStream
		cursos.parallelStream()
		.filter(c -> c.getAluno() >= 71)
		.collect(Collectors.toMap(
				c -> c.getNome(),
				c -> c.getAluno()))
		.forEach((nome, aluno) -> System.out.println(nome + " tem " + aluno + " alunos"));
	
	}
}
