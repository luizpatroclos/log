package br.com.patroclos.secao11;

//Protected

/*
 * Visível somente dentro do mesmo pacote
 * 
 * */
public class Cliente implements Comparable {
	
	
	private int idade;
	private String nome;
	private String endereco;
	
	
	
	public Cliente(int idade, String nome, String endereco) {
		this.idade = idade;
		this.nome = nome;
		this.endereco = endereco;
		//this.dizer_oi();
	}
	
	private void dizer_oi() {
		System.out.println( this.nome +" Está dizendo Oi !");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return "Nome : " + this.nome + " <--> Endereço : " + this.endereco;
	}

	@Override
	public int compareTo(Object o) {
		Cliente cliente = (Cliente)o;
		
		if(this.idade < cliente.idade) {
			return -1;
		}else if(this.idade > cliente.idade) {
			return 1;
		}else {
			return 0;
		}
		
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
