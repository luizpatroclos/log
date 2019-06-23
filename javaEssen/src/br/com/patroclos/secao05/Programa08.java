package br.com.patroclos.secao05;

import java.util.Scanner;

//do while
public class Programa08 {

	public static void main(String[] args) {
		
		int idade = 1;
		String nome;
		
		//Para receber dados do teclado
		Scanner teclado = new Scanner(System.in);
		
		//Primeiro executa o bloco, depois faz a checagem
		
		do {
			System.out.println("Informe seu nome:");
			nome = teclado.nextLine();

			System.out.println("Informe sua Idade:");
			//idade = teclado.nextInt(); Bug
			idade = Integer.parseInt(teclado.nextLine());
			
			System.out.println(nome + " tem " +idade+ " anos");
			
		}while(idade > 0);
		
		teclado.close();
	}
		
	
	
}
