package br.com.patroclos.secao18;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

//Escrevendo em arquivos

/*
 * 
 * Em Java String s�o imut�veis. - Ou seja, n�o mudam.
 *  
 * 
 * 
 * */
public class Programa42 {
	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		try {
			PrintStream escrever = new PrintStream("saida.txt");
			
			System.out.println("Escreva Algo: ");
			
			String msg = teclado.nextLine();
			escrever.println(msg);
			escrever.close();
			
		} catch (IOException e) {
			System.out.println("Arquivo Inv�lido !");
		}
	
		teclado.close();
		
		
	}
	
	
}
