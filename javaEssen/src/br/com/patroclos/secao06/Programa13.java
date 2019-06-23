package br.com.patroclos.secao06;

//Tipos de dados alfanumericos
//Caracteres e String
public class Programa13 {

	public static void main(String[] args) {
		
		//
		char letra1 = 'c';//representação de caracter por aspas simples.
		char letra2 = 97; //97 em decimal == 'a'
		
		System.out.println("Letra2 " + letra2);
		
		letra2 = (char) (letra2 + 1);// cast pois por padrão retorna um int
		
		int dem = letra2 + 1;
		
		System.out.println(" Valor letra1 " + letra1);
		System.out.println(" Valor letra2 " + letra2);
		
		
		//Tipos não primitivos
		Character letra3 = 'A';
		String nome = "Geek University";

		System.out.println("Letra3 " + letra3);
		
		System.out.println(" char/Character " + Character.SIZE + " bits ");
		
		System.out.println(" Valor Min char/Character " + Character.MIN_VALUE);//0
		System.out.println(" Valor Max char/Character " + Character.MAX_VALUE);//65535
		
		System.out.println("Nome " + nome);
		
		System.out.println("Tamanho da String:  " + nome.length());
		
		
		System.out.println("String " + (Character.SIZE * nome.length()) + " bits");
		
	}

	
	
}
