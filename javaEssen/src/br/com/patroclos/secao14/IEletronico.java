package br.com.patroclos.secao14;


/*
 * Uma interfacce pode conter:
 * 
 *  - constantes;
 *  - M�todos Abstratos;
 * 
 * */
public interface IEletronico {
	
	
	public String MARCA = "Mondial";
	
	
	public abstract void ligar();
	
	public void desligar();
	
	
	//Implementa��o no java 8 - A capacidade de uma interface implementar m�thod com retorno
	default String nome(String nome) {
		return "jorge Luiz";
	}
	

}
