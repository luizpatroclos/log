package br.com.patroclos.secao20;

public class BarraDeProgresso implements Runnable {
	

	@Override
	public void run() {
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("Barra de Progresso Aguarde... " + i);
		}

	}

}
