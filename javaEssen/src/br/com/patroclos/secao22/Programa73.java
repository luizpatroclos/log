package br.com.patroclos.secao22;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

//Lambdas

/*

 Express�es lambdas s�o express�es an�nimas, ou seja, sem nome.
 
 
 J� sabemos que podemos utilizar express�es lambdas com interfaces funcionais.
 
 Devemos ent�o criar uma fun��o lambda compativel com a fun��o da interface
 que estivermos utilizando.
 
 Por exemplo:
 
 - A interface consumer, possui um m�todo que recebe uma string e n�o retorna nada. 
 Por isso foi poss�vel utilizar a express�o lambda que passa uma string como parametro
 e n�o retorna nada
 
 - A fun��o sort espera receber 2 parametros do tipo string como entrada e retorna um inteiro
 por isso foi possivel passar a express�o lambda infomanda as 2 strings s1 e s2 e utilizando a classe 
 integer.compare passando os par�metros(s1 e s2)
  
 * */
public class Programa73 {
	
	public static void main(String[] args) {
		
		
		List<String> palavras = new ArrayList<String>();
		
		palavras.add("Erick");
		palavras.add("Luiz");
		palavras.add("Lion");
		palavras.add("Mel");
		palavras.add("Tan");
		palavras.add("Dem");
		palavras.add("P�");
		
	
		//palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		
		//forma 1
		//palavras.forEach(s -> System.out.println(s));
		
		// Equivale a forma 1 passando o argumento
		Consumer<String> consumer = s -> System.out.println(s);
		palavras.forEach(consumer);
		
		
	}
}
