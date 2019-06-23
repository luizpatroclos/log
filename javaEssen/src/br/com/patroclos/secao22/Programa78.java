package br.com.patroclos.secao22;

import java.util.ArrayList;
import java.util.List;

//Streams

/*





 
 * */
public class Programa78 {
	
	public static void main(String[] args) {
		
		
		List<Curso> cursos = new ArrayList<Curso>();
		
		cursos.add(new Curso("Matem�tica",10));
		cursos.add(new Curso("Potugues",100));
		cursos.add(new Curso("Geografia",200));
		cursos.add(new Curso("Quimica",22));
		cursos.add(new Curso("F�sica",0));
		cursos.add(new Curso("Hist�ria",0));
		cursos.add(new Curso("Ingles",70));
		
		
	
		
	int soma = cursos.stream()
				.filter(c -> c.getAluno() >= 100)//Lambda
				.mapToInt(Curso :: getAluno) // Permite que possamos efetuar c�lculos com o resultado
				.sum();
			
	
	System.out.println("A soma dos alunos � " + soma);

		//System.out.println(cursos);
		
	
		
	
	}
}
