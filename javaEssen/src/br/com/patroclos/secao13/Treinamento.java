package br.com.patroclos.secao13;


//Template Method
/*
 * final  - Modificador de acesso que faz com o que o elemento que esteja utilizando não 
 * possa ser extendido ou reescrito.
 * 
 * */
public abstract class Treinamento {
	
	//Template Method
	final void treinoDiario() {
		preparoFisico();
		jogoTreino();
		treinoTatico();
		
	}
	
	
	public abstract void preparoFisico();
	
	public abstract void jogoTreino();
	
	public final void treinoTatico() {
		System.out.println("Treino tático");
	}
	

}
