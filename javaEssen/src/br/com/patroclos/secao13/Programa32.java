package br.com.patroclos.secao13;

import br.com.patroclos.secao12.Aluno;

/*
 * Template Method
 * 
 * O padr�o template method define um esqueleto de um algoritimo dentro de um m�todo
 * trasferindo alguns de seus passos para as subclasses. O emplate method permite que as subclasses redefinam
 * certos passos de um algoritimo sem alterar a estrutura do pr�prio algoritimo.
 * 
 * 
 * Algoritimos s�o "receitas" passo-a-passo para resolver algum problema
 * 
 *  receber numero:
 *  retornar numero + numero;
 * 
 * */
public class Programa32 {
	
	
	public static void main(String[] args) {
	
	
		TreinamentoInicioDaTemporada tit = new TreinamentoInicioDaTemporada();
		
		tit.treinoDiario();
		
		
		TreinamentoFimDaTemporada tft = new TreinamentoFimDaTemporada();
		
		tft.treinoDiario();
	
	}

}
