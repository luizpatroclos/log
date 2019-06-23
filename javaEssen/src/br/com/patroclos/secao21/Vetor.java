package br.com.patroclos.secao21;

import java.util.Arrays;

public class Vetor {
	
	
	private Aluno alunos[] = new Aluno[100];
	private int total = 0;
	
	
	public void adiciona(Aluno aluno) {
		this.garantirEspaco();
		//recebe um aluno
		this.alunos[total] = aluno;
		total = total + 1;
		
	//		for(int i = 0; i < alunos.length; i++) {
	//			
	//			if (alunos[i] == null) {
	//				alunos[i] = aluno;
	//				break;
	//			}			
	//		}
		
	}
	
	
	public void adiciona(int posicao, Aluno aluno) {
		this.garantirEspaco();
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posi��o Inv�lida !");
		}
		for(int i = total -1; i >= posicao; i -= 1) {
			alunos[i+1] = alunos[i];
		}
		alunos[posicao] = aluno;
		total++;
	}
	
	
	
	public Aluno pega(int posicao) {
		//recebe uma posicao e devolve um aluno
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posi��o Inv�lida !");
		}
		return this.alunos[posicao];
	}
	
	
	public void remove(int posicao) {
		for(int i = posicao; i < total; i++) {
			this.alunos[i] = this.alunos[i+1];
		}
		total --;
		//remove aluno pela posicao
	}
	
	public boolean contem(Aluno aluno) {
		//descobre se o aluno est� ou n�o na lista			
		for(int i = 0; i < total; i++) {
			
			if (aluno.equals(alunos[i])) {
				return true;
			}
		}
		
		return false;		
	}
	
	public int tamanho() {
		//devolve a qtd de alunos no vetor
		return this.total;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(this.alunos);//facilita a visualiza��o do Array
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < total;
	}
	
	private void garantirEspaco() {
		//verifica se o array aluno est� cheio
		if (total == alunos.length) {
			//caso esteja cheio, cria um novo array com o dobro do tamanho do array anterior
			Aluno novoArray[] = new Aluno[alunos.length * 2];
			//copia os dados do array anterior para o novo array
			for (int i = 0; i < alunos.length; i++) {
				novoArray[i] = alunos[i];
			}
			//Por �ltimo atribuimos o novo array ao array original
			this.alunos = novoArray;
		}
	}

}
