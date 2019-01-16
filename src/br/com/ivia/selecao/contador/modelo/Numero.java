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
		
		int ordemMilhar = this.valor / 1000;
		int ordemCentena = (this.valor % 1000) / 100;
		int ordemDezena = (this.valor % 100) / 10;
		int ordemUnidade = this.valor % 10;
		
		Inteiro inteiroMilhar = inteiros.get(ordemMilhar);
		Inteiro inteiroCentena = inteiros.get(ordemCentena);
		Inteiro inteiroDezena = inteiros.get(ordemDezena);
		Inteiro inteiroUnidade = inteiros.get(ordemUnidade);
		
		/*
		return inteiroMilhar.getMilhar() + " e " +
		inteiroCentena.getCentena() + " e " + inteiroDezena.getDezena() +
		" e " + inteiroUnidade.getUnidade();
		*/
		
		return monta(inteiroMilhar == null ? "" : inteiroMilhar.getMilhar(),
							inteiroCentena == null ? "" : inteiroCentena.getCentena(),
							inteiroDezena == null ? "" : inteiroDezena.getDezena(),
							ordemDezena == 1 && inteiroUnidade != null ? inteiroUnidade.getTeen() : "",
							inteiroUnidade == null ? "" : inteiroUnidade.getUnidade());
	}
	
	
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
			numeroMontado = numeroMontado + " e " + dezena;
		}else if((dezena != "") && (teen == "")) {
			numeroMontado = dezena;
		}
		
		//Números de 11 a 19
		if((numeroMontado != "") && (teen != "")) {
			numeroMontado = numeroMontado + " e " + teen;
		}else if (teen != "") {
			numeroMontado = teen;
		}
		
		//Números de 1 a 9
		if((numeroMontado != "") && (teen == "") && (unidade != "")) {
			numeroMontado = numeroMontado + " e " + unidade;
		}else if((teen == "") && (unidade != "")) {
			numeroMontado = unidade;
		}
		
		//Corrigindo transcrição do 100
		if(numeroMontado == "cento") {
			numeroMontado = "cem";
		}
		
		return numeroMontado;
	}
	
	
	public int contaLetras(String valor) {
		return 0;
	}
}
