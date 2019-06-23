package br.com.patroclos.secao21;


/**
 * Classe que representa uma célula (container) onde teremos o objeto (valor
 * e uma celula que será a ligação para o próximo)
 * 
 * @author luiz
 *
 */
public class Celula {
	
	private Celula proximo;
	private Celula anterior;
	private Object elemento;
	
	
	public Celula(Object elemento, Celula proximo) {
		this.elemento = elemento;
		this.proximo = proximo;
	}
	
	public Celula(Object elemento) {
		this(elemento, null);
	}
	
	public Celula getProximo() {
		return this.proximo;
	}
	
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	
	public Object getElemento() {
		return this.elemento;
	}

	public Celula getAnterior() {
		return anterior;
	}

	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}

}
