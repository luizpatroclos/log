package br.com.patroclos.secao22;

import java.util.ArrayList;
import java.util.List;

//Streams

/*





 
 * */
public class Programa77 {
	
	public static void main(String[] args) {
		
		
		List<Curso> cursos = new ArrayList<Curso>();
		
		cursos.add(new Curso("Matem�tica",10));
		cursos.add(new Curso("Potugues",100));
		cursos.add(new Curso("Geografia",200));
		cursos.add(new Curso("Quimica",22));
		cursos.add(new Curso("F�sica",0));
		cursos.add(new Curso("Hist�ria",0));
		cursos.add(new Curso("Ingles",70));
		
		
	
		
		cursos.stream()
			.filter(c -> c.getAluno() >= 100)
			.map(Curso :: getAluno)//ele mapeia um tipo de dado para o outro
			.forEach(System.out :: println);
		
		
	

		//System.out.println(cursos);
		
	
		
	
	}
}
