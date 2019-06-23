package br.com.patroclos.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Lambdas

/*
 Expressões Lambdas, são funções anônimas 
 
 
 
  
 * */
public class Programa71 {
	
	public static void main(String[] args) {
		
		
		List<String> palavras = new ArrayList<String>();
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		
		palavras.add("Erick");
		palavras.add("Luiz");
		palavras.add("Lion");
		palavras.add("Mel");
		palavras.add("Tan");
		palavras.add("Dem");
		palavras.add("Pé");
		
		//palavras.sort(comparador);
		
		//Simples lambda declarando a String
		palavras.forEach((String s) -> {
			System.out.println(s);
		});
		
		//Resumida sem precisar declarar a String lambda
		palavras.forEach(s -> {
			System.out.println(s);
		});
		
		//Resumida ao extremo
		palavras.forEach(s -> System.out.println(s));
		
		//Incrementada
		palavras.forEach((String s) -> {
			if (s.contains("L")) {
				System.out.println(s);
			}
		});
		
		
		
		
		
		
		
		/*//Passando direto a interface Consumer
		palavras.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}});
		
		//Consumer<String> consumidor = new ImprimeNaLinha(); 1 - Opção
		
		
		//Conceito de classes Anônimas
		Consumer<String> consumidor = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		*/
		
	
		
		//System.out.println(palavras);
		
	}
}
