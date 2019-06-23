package br.com.patroclos.secao14;


/*
 * Uma interfacce pode conter:
 * 
 *  - constantes;
 *  - Métodos Abstratos;
 * 
 * */
public interface IEletronico {
	
	
	public String MARCA = "Mondial";
	
	
	public abstract void ligar();
	
	public void desligar();
	
	
	//Implementação no java 8 - A capacidade de uma interface implementar méthod com retorno
	default String nome(String nome) {
		return "jorge Luiz";
	}
	

}
