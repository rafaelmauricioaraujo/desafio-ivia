package br.com.ivia.selecao.contador.modelo;

import java.util.ArrayList;
/**
 * Classe que representa o n�mero e sua decomposi��o em letras e palavras
 * 
 * @author Rafael Araujo
 *
 */
public class Numero {
	
	private int valor;
	private ArrayList<Inteiro> inteiros;
	
	/**
	 * 
	 * @param valor inteiro que indica o valor do n�mero
	 * @param inteiros lista contendo as palavras de ordem da unidade, dezena, centena e milhar
	 */
	
	public Numero(int valor, ArrayList<Inteiro> inteiros) {
		this.valor = valor;
		this.inteiros = inteiros;
	}
	
	/**
	 * 
	 * @return valor do n�mero por extenso
	 */
	public String numeroPorExtenso() {
		return decomporETranscrever();
	}
	/**
	 * 
	 * @return total de letras da palavra por extenso do n�mero
	 */
	
	public int totalDeLetras() {
		return this.numeroPorExtenso().length();
	}
	
	/**
	 * 
	 * @return total de letras acummuladas at� o valor do n�mero
	 */
	
	public int totalDeLetrasAcumuladas() {
		return this.somaAcumulada();
	}
	
	/**
	 * Decopoe o valor do Numero em unidade, centena, dezena e milhar e o transcreve
	 * @return transcri��o do valor
	 */
	
	private String decomporETranscrever() {
		
		int ordemMilhar = this.valor / 1000;
		int ordemCentena = (this.valor % 1000) / 100;
		int ordemDezena = (this.valor % 100) / 10;
		int ordemUnidade = this.valor % 10;
		
		Inteiro inteiroMilhar = inteiros.get(ordemMilhar);
		Inteiro inteiroCentena = inteiros.get(ordemCentena);
		Inteiro inteiroDezena = inteiros.get(ordemDezena);
		Inteiro inteiroUnidade = inteiros.get(ordemUnidade);
		
		return monta(inteiroMilhar == null ? "" : inteiroMilhar.getMilhar(),
							inteiroCentena == null ? "" : inteiroCentena.getCentena(),
							inteiroDezena == null ? "" : inteiroDezena.getDezena(),
							ordemDezena == 1 && inteiroUnidade != null ? inteiroUnidade.getTeen() : "",
							inteiroUnidade == null ? "" : inteiroUnidade.getUnidade());
	}
	
	
	/**
	 * m�todo para montar a transcri��o do valor do N�mero 
	 * @param milhar milhar transcrito
	 * @param centena centena transcrito
	 * @param dezena dezena transcrito
	 * @param teen varia��es da dezena transcrito
	 * @param unidade unidade transcrito
	 * @return a transcri��o completa do valor
	 */
	private String monta(String milhar, String centena, String dezena, String teen, String unidade) {

		//N�meros contendos 1000 a 9000 na ordem de milhares
		String numeroMontado = milhar;
		
		//N�meros contendo 100 a 900 na ordem de centenas
		if((numeroMontado != "") && (centena != "")) {
			numeroMontado = numeroMontado + "e" + centena;
		}else if(centena != "") {
			numeroMontado = centena;
		}
		
		//N�meros contendo 20 a 90 na ordem de dezenas
		if((numeroMontado != "") && (teen == "") && (dezena != "")) {
			numeroMontado = numeroMontado + " e " + dezena;
		}else if((dezena != "") && (teen == "")) {
			numeroMontado = dezena;
		}
		
		//N�meros de 11 a 19
		if((numeroMontado != "") && (teen != "")) {
			numeroMontado = numeroMontado + " e " + teen;
		}else if (teen != "") {
			numeroMontado = teen;
		}
		
		//N�meros de 1 a 9
		if((numeroMontado != "") && (teen == "") && (unidade != "")) {
			numeroMontado = numeroMontado + " e " + unidade;
		}else if((teen == "") && (unidade != "")) {
			numeroMontado = unidade;
		}
		
		//Corrigindo transcri��o do 100
		if(numeroMontado == "cento") {
			numeroMontado = "cem";
		}
		
		return numeroMontado;
	}
	
	private int somaAcumulada() {
		
		int somaLetras = 0;
		for(int i = 0; i <= valor; i++) {
			Numero numero = new Numero(i, inteiros);
			somaLetras = somaLetras + numero.totalDeLetras();
		}
		return somaLetras;
	}
}
