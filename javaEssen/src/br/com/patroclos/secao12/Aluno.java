package br.com.patroclos.secao12;

/*
 * Beneficio da Herança
 * Evita a repetição de código
 * Facilita a manutenção do programa
 * 
 * */

public class Aluno extends Pessoa{

	// private String nome;
	// private int ano_nascimento;
	 private String ra;
	 
	public Aluno(String nom, int ano, String ra, String email) {

		//this.nome = nom;
		//this.ano_nascimento = ano;
		super(nom, ano, email);
		this.ra = ra;

	}
	 
	/*public String getNome() {
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
	}*/
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}

	public String toString() {
		return super.toString() + "\nR.A.: " + this.ra;
	}
	
	public String getNome() {
		return "Aluno: \n" + super.getNome();
	}

	@Override
	public void outra_msg(String msg) {
		System.out.println(msg);
	}
	
}