package br.com.patroclos.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Lambdas

/*

 
  
 * */
public class Programa72 {
	
	public static void main(String[] args) {
		
		
		List<String> palavras = new ArrayList<String>();
		
		palavras.add("Erick");
		palavras.add("Luiz");
		palavras.add("Lion");
		palavras.add("Mel");
		palavras.add("Tan");
		palavras.add("Dem");
		palavras.add("Pé");
		
		
		//sort recebe um Campare(String 1, String 2), substituído por lambda
		//Forma 1
//		palavras.sort((s1, s2) -> {
//			if (s1.length() < s2.length()) {
//				return -1;
//			}
//			if (s1.length() > s2.length()) {
//				return 1;
//			}
//			return 0;
//		});
		
				
		//Forma 2
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		
		
		
		//Resumida ao extremo
		palavras.forEach(s -> System.out.println(s));
		
		
		
		
		
	
		

		
	}
}
