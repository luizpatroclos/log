package br.com.patroclos.secao22;

import java.util.ArrayList;
import java.util.List;

//Revis�o

/*

- Classes An�nimas
- Lambdas
- Method References
 
 * */
public class Programa75 {
	
	public static void main(String[] args) {
		
		
		List<Curso> cursos = new ArrayList<Curso>();
		
		cursos.add(new Curso("Matem�tica",10));
		cursos.add(new Curso("Potugues",100));
		cursos.add(new Curso("Geografia",20));
		cursos.add(new Curso("Quimica",22));
		cursos.add(new Curso("F�sica",0));
		cursos.add(new Curso("Hist�ria",0));
		cursos.add(new Curso("Ingles",70));
		
		
		//cursos.sort(Comparator.comparing(c -> c.getAluno())); //Lambda
		
		//cursos.sort(Comparator.comparing(Curso :: getAluno)); // Method Reference
		
		//cursos.forEach(c -> System.out.println(c.getNome())); //Lambda
		
		//cursos.forEach(System.out :: println); // Method References
		
		System.out.println(cursos);
		
	
		
	
	}
}
