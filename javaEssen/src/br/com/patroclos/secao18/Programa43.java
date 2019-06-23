package br.com.patroclos.secao18;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

//Lendo em arquivos

/*
 * 
 * 
 *  
 * 
 * 
 * */
public class Programa43 {

	public static void main(String[] args) {

		try {
			Scanner ler = new Scanner(new FileInputStream("entrada.txt"));

			while (ler.hasNextLine()) {
				String linha = ler.nextLine();
				System.out.println(linha);
			}
			ler.close();

		} catch (IOException e) {
			System.out.println("Arquivo Inválido !");
		}

	}
	
	
}
