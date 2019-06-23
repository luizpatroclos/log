package br.com.patroclos.secao12;

public class Professor extends Pessoa {
	
	private String matricula;
	
	public Professor(String nome, int ano_nascimento, String matricula, String email) {
		super(nome, ano_nascimento, email);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	// Overrinding / Sobreescrita de m�todo
	public String toString() {
		
		return super.toString() + "\nMatr�cula :" + this.matricula;
	}

	@Override
	public void outra_msg(String msg) {
		System.out.println(msg);
		
	}

	

}
