package br.com.ivia.selecao.contador.modelo;

import java.util.ArrayList;

public class Numero {
	
	public int valor;
	public ArrayList<Inteiro> inteiros;
	
	public Numero(int valor, ArrayList<Inteiro> inteiros) {
		this.valor = valor;
		this.inteiros = inteiros;
	}
	
	public String descreveNumero() {
		
		int milhar = this.valor / 1000;
		int centena = this.valor / 100;
		int dezena = this.valor / 10;
		int unidade = this.valor % 10;
		
		Inteiro intMilhar = inteiros.get(milhar);
		Inteiro intCentena = inteiros.get(centena);
		Inteiro intDezena = inteiros.get(dezena);
		Inteiro intUnidade = inteiros.get(unidade);
		
		return intMilhar.getMilhar() + " e " + intCentena.getCentena() + " e " + intDezena.getDezena() + " e " + intUnidade.getUnidade();
	}
	
	public int contaLetras(String valor) {
		return 0;
	}
}
