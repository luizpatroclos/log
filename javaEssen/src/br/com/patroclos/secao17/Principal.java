package br.com.patroclos.secao17;

import java.util.Scanner;

import br.com.patroclos.secao11.Cliente;
import br.com.patroclos.secao11.Conta;


/*
 * Gerando Executáveis *jars
 * 
 * 
 * JAR  - Java Archive
 * 
 * Archive - Arquivo compactado java
 * 
 * 
 * */
public class Principal {
	
	static Cliente cliente = new Cliente(56,"Margaret", "Rua brates, 33"); 
	static Conta conta = new Conta(1, 200, 300, cliente);
	static Scanner teclado = new Scanner(System.in);
	
	public static void depositar() {
		
		System.out.println("#################  Déposito  ########################");
		System.out.println("Informe o valor do depósito : ");
		
		float valor = teclado.nextFloat();
		
		if(valor > 0) {
			conta.depositar(valor);
			System.out.println("Depósito efetuado com Sucesso : ");
		}else {
			System.out.println("O valor precisa ser positivo");
		}
	}
	
	public static void sacar() {
		
		System.out.println("#################  Saque  ########################");
		System.out.println("Informe o valor para Saque : ");
		float valor = teclado.nextFloat();
		
		if(valor > 0) {
			conta.sacar(valor);
			System.out.println("Saque efetuado com Sucesso : ");
		}else {
			System.out.println("O valor precisa ser positivo");
		}
			
	}
	
	public static void consultarSaldo() {
		System.out.println("Seu saldo é : " + conta.getSaldo());
	}

	public static void main(String[] args) {
		
		int opcao = 0;
		
		System.out.println("Bem Vindo ao Banco Patroclos");
		
		do {
			System.out.println();
			System.out.println("Selecione uma opção abaixo :");
			System.out.println("1 - Depositar:");
			System.out.println("2 - Sacar:");
			System.out.println("3 - Consultar Saldo:");
			System.out.println("0 - Sair:");
			
			try {
				opcao = teclado.nextInt();
			} catch (Exception e) {
				System.out.println("Opção Inválida Shuting down !!!");
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				depositar();
				break;
			case 2:
				sacar();
				break;
			case 3:
				consultarSaldo();
				break;
			case 0:
				break;
			default:
				System.out.println("Opção Inválida");
				break;
			}
			
			
			
		}while(opcao > 0);
		teclado.close();
			
				
		
	}
	

}
