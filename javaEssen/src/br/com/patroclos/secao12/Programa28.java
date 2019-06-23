package br.com.patroclos.secao12;
/*
 * Estudo do Polimorfismo
 * 
 * */
public class Programa28 {
	
	
	public static void main(String[] args) {
	
		//Pessoa p1 = new Pessoa("Luiz", 1955, "luiz.brazil.com");
		
		
		System.out.println("############## Pessoa #################");
	//	System.out.println(p1);
		
		/*System.out.println("############## Pessoa #################");
		System.out.println("Nome : " + p1.getNome());
		System.out.println("Ano Nascimento : " + p1.getAno_nascimento());
		System.out.println("Email : " + p1.getEmail());*/
		
		System.out.println("############## Aluno #################");
		Aluno a1 = new Aluno("Vanessa", 20001, "125544", "vanessa.brazil.com");
		
		System.out.println(a1);
		
		/*System.out.println("Nome : " + a1.getNome());
		System.out.println("Ano Nascimento : " + a1.getAno_nascimento());
		System.out.println("Email : " + a1.getEmail());*/
		
		System.out.println("############## Professor #################");
		Professor prof = new Professor("Carlos", 2010, "EPTT22", "carlos.brazil.com");
		
		System.out.println(prof);
		
		/*System.out.println("Nome : " + prof.getNome());
		System.out.println("Ano Nascimento : " + prof.getAno_nascimento());
		System.out.println("Email : " + prof.getEmail());*/
		
		
		
	}

}
