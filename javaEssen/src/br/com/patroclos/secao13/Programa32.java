package br.com.patroclos.secao13;

import br.com.patroclos.secao12.Aluno;

/*
 * Template Method
 * 
 * O padrão template method define um esqueleto de um algoritimo dentro de um método
 * trasferindo alguns de seus passos para as subclasses. O emplate method permite que as subclasses redefinam
 * certos passos de um algoritimo sem alterar a estrutura do próprio algoritimo.
 * 
 * 
 * Algoritimos são "receitas" passo-a-passo para resolver algum problema
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
