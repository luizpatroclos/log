package br.com.patroclos.secao18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

//Escrevendo em arquivos II

/*
 * 
 *
 *  
 * 
 * 
 * */
public class Programa44 {
	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		try {
			//Faz com que adicione no arquivo e não sobreponha, caso o arquivo
			//não exista, ele cria.
			PrintStream escrever = new PrintStream(new FileOutputStream("saida.txt", true));
			
			System.out.println("Escreva Algo: ");
			
			String msg = teclado.nextLine();
			escrever.println(msg);
			escrever.close();
			
		} catch (IOException e) {
			System.out.println("Arquivo Inválido !");
		}
	
		teclado.close();
		
		
	}
	
	
}
