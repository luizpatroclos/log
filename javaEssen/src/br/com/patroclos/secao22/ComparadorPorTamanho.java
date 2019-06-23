package br.com.patroclos.secao22;

import java.util.Comparator;


/*
 * 
 Estamos criando nosso pr�prio comparador de Objetos (String)
 para que seja poss�vels, desta forma, ordenar a string pelo seu tamanho
 ao inv�s de ordem alfab�tica.
 
 1 - A String1 � menor que a String2 -> retornamos -1
 2 - A String1 � maior que a String2 -> retornamos 1
 3 - A String1 tem o mesmo tamanho da String2 -> retornamos 0
 
 
 * */
public class ComparadorPorTamanho implements Comparator<String> {

	
	
	
	@Override
	public int compare(String s1, String s2) {
		
		if (s1.length() < s2.length()) {
			return -1;
		}
		if(s1.length() > s2.length()) {
			return 1;
		}
		return 0;
	}
	
	
	

}
