package br.com.patroclos.secao18;

//Trabalhando com Strings

/*
 * 
 * Em Java String s�o imut�veis. - Ou seja, n�o mudam.
 *  
 * 
 * 
 * */
public class Programa41 {
	
	
	public static void main(String[] args) {
		
		String curso = "Java Essencial";
		
		//curso.replace("Java", "Python"); imut�vel
		
		//String nova = curso.replace("Java", "Python"); // somente atribuindo a nova String
		
		//curso = curso.replace("Java", "Python");//podemos atribuir a mesma vari�vel
		
		//System.out.println(nova);
		
		//System.out.println(curso);
		
		/*for(int i = 0; i < curso.length(); i++) {
			System.out.print(curso.charAt(i));
		}*/
		
		for(int i = (curso.length() - 1); i >= 0; i--) {
			
			System.out.print(curso.charAt(i));
		}
		
	}
	
	
}
