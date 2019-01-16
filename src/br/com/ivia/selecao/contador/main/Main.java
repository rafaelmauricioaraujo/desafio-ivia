package br.com.ivia.selecao.contador.main;

import java.util.ArrayList;

import br.com.ivia.selecao.contador.modelo.Inteiro;
import br.com.ivia.selecao.contador.modelo.Numero;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Inteiro> listaInteiros = new ArrayList<>();
		
		listaInteiros.add(new Inteiro(0, "", "", "", "", ""));
		listaInteiros.add(new Inteiro(1, "um", "dez", "onze", "cento", "mil"));
		listaInteiros.add(new Inteiro(2, "dois mil", "duzentos", "vinte", "dois"));
		listaInteiros.add(new Inteiro(3, "tres mil", "trezentos", "trinta", "tres"));
		listaInteiros.add(new Inteiro(4, "quatro mil", "quatrocentos", "quarenta", "quatro"));
		listaInteiros.add(new Inteiro(5, "cinco mil", "quinhentos", "cinquenta", "cinco"));
		listaInteiros.add(new Inteiro(6, "seis mil", "seiscentos", "sessenta", "seis"));
		listaInteiros.add(new Inteiro(7, "sete mil", "setecentos", "setenta", "sete"));
		listaInteiros.add(new Inteiro(8, "oito mil", "oitocentos", "oitenta", "oito"));
		listaInteiros.add(new Inteiro(9, "nove mil", "novecentos", "noventa", "nove"));
		
		Numero numero = new Numero(100, listaInteiros);
		System.out.println(numero.descreveNumero());
		
	}
}
