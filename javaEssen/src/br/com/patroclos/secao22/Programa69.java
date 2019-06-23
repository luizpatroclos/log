package br.com.patroclos.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

//Classes Anônimas
/*
 * Classes Anônimas são classes sem nome
 * 
 * 
 * Quando utilizar ?
 * - geralmente utilizamos quando temos interfaces com um
 * ou poucos métodos e não precisamos reaproveitar o código da classe.
 * 
 * Ou seja, se não iremos precisar reaproveitar a classe em um outro lugar
 * do nosso sistema e esta classe que eu deverias criar iria apenas implementar
 * uma interface com um ou poucos métodos, podemos utilizar o conceito de classe anônima.
 * 
 * */

public class Programa69 {
	
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
		
		palavras.sort(comparador);
		
		//Consumer<String> consumidor = new ImprimeNaLinha(); 1 - Opção
		
		
		//Conceito de classes Anônimas
		Consumer<String> consumidor = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		
		
		palavras.forEach(consumidor);
		
		//System.out.println(palavras);
		
	}
}
