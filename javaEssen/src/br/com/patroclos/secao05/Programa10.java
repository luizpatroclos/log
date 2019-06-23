package br.com.patroclos.secao05;

//Foreach
public class Programa10 {

	public static void main(String[] args) {

		String nome = "Geek University";
		
		//Para cada um dos caracteres da string, imprima o caracter
		for(char valor : nome.toCharArray()) {
			
			System.out.print(valor);
			
		}
		
	}

	
	
}
