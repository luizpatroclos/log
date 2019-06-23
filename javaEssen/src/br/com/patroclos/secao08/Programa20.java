package br.com.patroclos.secao08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

//Criando nossas pr�prias fun��es

/*
 Fa�a um programa que receba diversos nomes de frutas
 do usu�rio e no final imprima essas
 frutas em ordem contr�ria. O programa deve solicitar
 ao usu�rio quantas frutas ele quer informar.
 
 Informe quantas frutas deseja cadastrar :
 2
 
 Informe o nome de uma fruta:
 Manga
 
 Informe o nome de uma fruta:
 Goiaba
 
 */

public class Programa20 {
	
	
	//Variavel Global
	//Declara��o do Vetor
	static String frutas[];
	static Scanner teclado = new Scanner(System.in);
	

	public static void main(String[] args) {
		
		//Variavel Local
		int qtd;
		
		//Minha Solu��o
		//ArrayList<String> frutas = new ArrayList<String>();

		System.out.println("Informe quantas frutas deseja cadastrar :");
		//qtd = teclado.nextInt(); Bug
		qtd = Integer.parseInt(teclado.nextLine());
		
		
		cadastrar_dados(qtd);
		
		mostrar_dados(qtd);
		
		/*
		for(int i = 0; i < qtd; i++) {
		
		System.out.println("Informe a "+ (i + 1) +" fruta: ");
		frutas[i] = teclado.nextLine();
		
		//Minha Solu��o
		//frutas.add(fruta);
		}
		
		//Solu��o do Curso
		for(int i = qtd - 1; i >= 0; i--) {
			
			System.out.println(frutas[i]);
			
		}
		*/
		teclado.close();
		
		//Minha solu��o
		/*Collections.reverse(frutas);
		
		for(String fruit : frutas) {
			System.out.println(fruit);
		}*/
		
}
	
	static void cadastrar_dados(int quantidade) {

		// Definindo o tamanho do Vetor
		frutas = new String[quantidade];

		//3
		//0..2 (0,1,2)
		for (int i = 0; i < quantidade; i++) {
			System.out.println("Informe a " + (i + 1) + " fruta: ");
			frutas[i] = teclado.nextLine();
		}

	}
	
	static void mostrar_dados(int quantidade) {
		for (int i = (quantidade - 1); i >= 0; i--) {
			 System.out.println(frutas[i]);
		}
	}	
	
}
