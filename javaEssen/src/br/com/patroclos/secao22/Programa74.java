package br.com.patroclos.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

//Method References

/*

 
 
 
  
 * */
public class Programa74 {
	
	public static void main(String[] args) {
		
		
		List<String> palavras = new ArrayList<String>();
		
		palavras.add("Erick");
		palavras.add("Luiz");
		palavras.add("Lion");
		palavras.add("Mel");
		palavras.add("Tan");
		palavras.add("Dem");
		palavras.add("Pé");
		
		
		//Foma 1
//		Function<String, Integer> tamanho = new Function<String, Integer>(){
//			@Override
//			public Integer apply(String t) {
//				
//				return t.length();
//			}
//			
//		};

		//Foma 1
		//Comparator<String> comparador =  Comparator.comparing(tamanho);
		
		
		
		//Method Reference Forma 2 - Exuta
		//palavras.sort(Comparator.comparing(s -> s.length()));
		
		
		//Method Reference Forma 2 - Extremamente Exuta
		//palavras.sort(Comparator.comparing(String::length));
		
		
		//Method Reference Forma 3
		//Function<String, Integer> tamanho = String :: length; //Usando Methos References
//		Function<String, Integer> tamanho = s -> s.length();  // usando expressão lambda
//		Comparator<String> comparador =  Comparator.comparing(tamanho);
//		palavras.sort(comparador);
//		
		//System.out.println(palavras);
		
		palavras.forEach(s -> System.out.println(s)); //Usando Lambda
		
		palavras.forEach(System.out :: println); // Method references
		
	}
}
