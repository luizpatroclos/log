package br.com.patroclos.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

//forEach

public class Programa68 {
	
	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<String>();
		
		Consumer<String> consumidor = new ImprimeNaLinha();
		
		palavras.add("Erick");
		palavras.add("Luiz");
		palavras.add("Lion");
		palavras.add("Mel");
		palavras.add("Tan");
		palavras.add("Dem");
		palavras.add("Pé");
		
		//novo java 8 - faz o mesmo que uma lista
		palavras.forEach(consumidor);
		
		/*for (int i = 0; i < palavras.size(); i++) {
			System.out.println( palavras.get(i));
		}
		
		for(String valor : palavras) {
			System.out.println(valor);
		}*/
		
		
		
		
		System.out.println(palavras);
		
	}
}
