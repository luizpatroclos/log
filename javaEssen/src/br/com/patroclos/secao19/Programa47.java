package br.com.patroclos.secao19;

import java.util.ArrayList;
import java.util.Collections;

import br.com.patroclos.secao11.Cliente;

//Listas

/*
 * */
public class Programa47 {
	
	
	public static void main(String[] args) {
	
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		Cliente cli1 = new Cliente(34, "Jorge", "Rua tres");
		
		Cliente cli2 = new Cliente(42, "Jorgete", "Rua quatro");
		
		Cliente cli3 = new Cliente(23, "Andréa", "Rua cinco");
		
		clientes.add(cli1);
		clientes.add(cli2);
		clientes.add(cli3);
		
		
		System.out.println(" O tamanho do meu Array é -> " +clientes.size());
		
		System.out.println("############### Segue o Jogo ##########################");
											
		System.out.println("");
		System.out.println("############### Sem ordenar ##########################");
		for(int i = 0; i < clientes.size(); i++) {
			
			System.out.println("Nome do Cidadão = " +clientes.get(i));
			
			
		}
		
		
		System.out.println("");
		System.out.println("############### Aplicando foreach  ##########################");
		
		Collections.sort(clientes);
		
		System.out.println("");
		System.out.println("############### Ordenado ##########################");
		
		for(Cliente nome : clientes) {
			
			System.out.println(" Nome do Cidadão : " +nome);

		}
		
		
		
		/*Scanner teclado = new Scanner(System.in);
		
			
			System.out.println("Escreva Algo: ");
			
			
			
		
	
		teclado.close();*/
		
		
	}
	
	
}
