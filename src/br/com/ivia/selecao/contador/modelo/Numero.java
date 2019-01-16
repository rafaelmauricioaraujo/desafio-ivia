package br.com.ivia.selecao.contador.modelo;

import java.util.ArrayList;
import java.util.LinkedList;

public class Numero {
	
	public int valor;
	public ArrayList<Inteiro> inteiros;
	
	public Numero(int valor, ArrayList<Inteiro> inteiros) {
		this.valor = valor;
		this.inteiros = inteiros;
	}
	
	public String descreveNumero() {
		
		int ordemMilhar = this.valor / 1000;
		int ordemCentena = (this.valor % 1000) / 100;
		int ordemDezena = (this.valor % 100) / 10;
		int ordemUnidade = this.valor % 10;
		
		Inteiro inteiroMilhar = inteiros.get(ordemMilhar);
		Inteiro inteiroCentena = inteiros.get(ordemCentena);
		Inteiro inteiroDezena = inteiros.get(ordemDezena);
		Inteiro inteiroUnidade = inteiros.get(ordemUnidade);
		
		return inteiroMilhar.getMilhar() + " e " +
		inteiroCentena.getCentena() + " e " + inteiroDezena.getDezena() +
		" e " + inteiroUnidade.getUnidade();
	}
	
	/*
	String monta(String milhar, String centena, String dezena, String teen, String unidade) {
		//Números contendos 1000 a 9000 na ordem de milhares
		String numeroMontado = milhar;
		
		//Números contendo 100 a 900 na ordem de centenas
		if((numeroMontado != "") && (centena != "")) {
			numeroMontado = numeroMontado + " e " + centena;
		}else if(centena != "") {
			numeroMontado = centena;
		}
		
		//Números contendo 20 a 90 na ordem de dezenas
		if((numeroMontado != "") && (teen == "") && (dezena != "")) {
			
		}
		
		return numeroMontado;
	}
	*/
	
	public int contaLetras(String valor) {
		return 0;
	}
}
