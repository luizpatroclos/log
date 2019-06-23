package br.com.patroclos.secao12;


//Agora como classe Abstrata
/*
 * Desta forma impedimos a criação de objetos desta classe
 * 
 * Classe genérica / Classe base
 * 
 * 
 * Uma classe abstrata pode ter:
 * 
 * 	- atributos;
 *  - Métodos;
 *  - Métodos abstratos;
 *  
 *  Métodos abstratos:
 *  
 *   - São métodos, que não possuem implementeção, logo a classe que herda de uma classe abstrata
 *   deve obrigatoriamente implementá-los.
 * 
 * */
public abstract class Pessoa {
	
	private String nome;
	private int ano_nascimento;
	private String email;
	
	
	public Pessoa() {
		
	}
	
	public Pessoa(String firstName, int ano, String email) {
		this.nome = firstName;
		this.ano_nascimento = ano;
		this.email = email;

	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAno_nascimento() {
		return ano_nascimento;
	}
	public void setAno_nascimento(int ano_nascimento) {
		this.ano_nascimento = ano_nascimento;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	// Overrinding / Sobreescrita de método
	public String toString() {
		return "Nome: " + this.nome + "\nNascimento: " + this.ano_nascimento;
	}
	
	
	//Overloading - Sobrecarga
	public void mensagem() {
		System.out.println("Mensagem Overloading -- Basic");
	}
	
	//Overloading - Sobrecarga
	public void mensagem(String msg) {
		System.out.println("Mensagem Overloading -- Com entrada de um String " + msg);
	}
	
	public void mensagem(String msg, int index) {
		 System.out.println("Mensagem Overloading -- Com entrada de String e inteiro " + msg + "-" + index);
	}
	
	public abstract void outra_msg(String msg);

}
