package br.com.patroclos.secao22;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

//Lambdas

/*

 Expressões lambdas são expressões anônimas, ou seja, sem nome.
 
 
 Já sabemos que podemos utilizar expressões lambdas com interfaces funcionais.
 
 Devemos então criar uma função lambda compativel com a função da interface
 que estivermos utilizando.
 
 Por exemplo:
 
 - A interface consumer, possui um método que recebe uma string e não retorna nada. 
 Por isso foi possível utilizar a expressão lambda que passa uma string como parametro
 e não retorna nada
 
 - A função sort espera receber 2 parametros do tipo string como entrada e retorna um inteiro
 por isso foi possivel passar a expressão lambda infomanda as 2 strings s1 e s2 e utilizando a classe 
 integer.compare passando os parâmetros(s1 e s2)
  
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
		palavras.add("Pé");
		
	
		//palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		
		//forma 1
		//palavras.forEach(s -> System.out.println(s));
		
		// Equivale a forma 1 passando o argumento
		Consumer<String> consumer = s -> System.out.println(s);
		palavras.forEach(consumer);
		
		
	}
}
