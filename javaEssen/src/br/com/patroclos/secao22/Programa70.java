package br.com.patroclos.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

//Classes An�nimas

public class Programa70 {
	
	public static void main(String[] args) {
		
		
		List<String> palavras = new ArrayList<String>();
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		
		palavras.add("Erick");
		palavras.add("Luiz");
		palavras.add("Lion");
		palavras.add("Mel");
		palavras.add("Tan");
		palavras.add("Dem");
		palavras.add("P�");
		
		palavras.sort(comparador);
		
		
		//Passando direto a interface Consumer
		palavras.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}});
		
		//Consumer<String> consumidor = new ImprimeNaLinha(); 1 - Op��o
		
		
		//Conceito de classes An�nimas
		Consumer<String> consumidor = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		
		
	
		
		//System.out.println(palavras);
		
	}
}
