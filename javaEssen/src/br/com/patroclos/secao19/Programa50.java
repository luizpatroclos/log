package br.com.patroclos.secao19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Mapas / Map

/*
 * 
 * Os mapas são representado em java pela interface Map
 * e mapeia seus elementos utilizando o conceito de chave/valor
 * 
 * 
 * Mapas são conhecidos como se fossem/representassem 3 coleções
 * 
 * - Coleçõe de chaves;
 * - Coleção de valores;
 * - Coleção de associações;
 * 
 * 
 * */
public class Programa50 {
	
	public static void main(String[] args) {
		
		
		Map<Integer,String> pessoas = new HashMap<Integer, String>();
		
		pessoas.put(40, "Jorge Luiz");
		pessoas.put(14, "Erick Albuquerque");
		pessoas.put(6, "Sarah Albuquerque");
		
		//Coleção de chaves
		System.out.println("Chaves: "+ pessoas.keySet());
		
		
		//Coleção de valores
		System.out.println("Valore: "+ pessoas.values());
		
		
		//Coleção de associações
		System.out.println("Associação: "+ pessoas.entrySet());
		
		
		//Disponibilizado a partir do java 8 - Lambdas
		//Forma 1
		pessoas.keySet().forEach(pessoa -> {
			
			//Pode ser feito qualquer coisa dentro da condição
			/*for(int i = 0; i < 5; i++) {
				System.out.println(" Pow !!!! ");
			}*/
			
			System.out.println(pessoas.get(pessoa));});
		
		
		//Iterar na coleção de chaves
		//Forma 2
		Set<Integer> chaves = pessoas.keySet();
		
		for(Integer valor : chaves) {
			System.out.println(pessoas.get(valor));
		}
		
		//Iterar na Coleção de valores
		
		//Forma 1
		Collection<String> values = pessoas.values();
		
		for(String nome : values) {
			System.out.println("Nome forma 1 : " + nome);
		}
		
		//Forma 2
		pessoas.values().forEach(nome ->{
			System.out.println("Nome forma 2 : " + nome);
		});
		
		//Iterara a coleção de associações
		
		//Foma 1
		Set<Entry<Integer, String>> associacoes = pessoas.entrySet();
		
		for(Entry<Integer, String> associacao : associacoes) {
			System.out.println(associacao.getKey() +"  -- "+ associacao.getValue());
		}
		
		//Foma 2
		pessoas.entrySet().forEach(associa -> {
			System.out.println(associa.getKey()+ " -- "+ associa.getValue());
		});
		
		
	}
	
}
