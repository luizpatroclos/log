package br.com.patroclos.secao22;

import java.util.function.Consumer;

public class ImprimeNaLinha implements Consumer<String> {
	
	@Override
	public void accept(String t) {
		System.out.println(t);
	}
	

}
