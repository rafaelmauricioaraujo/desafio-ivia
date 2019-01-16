package br.com.ivia.selecao.contador.main;

import java.util.ArrayList;

import br.com.ivia.selecao.contador.modelo.Inteiro;
import br.com.ivia.selecao.contador.modelo.Numero;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Inteiro> listaInteiros = new ArrayList<>();
		
		listaInteiros.add(new Inteiro(0, "", "", "", "", ""));
		listaInteiros.add(new Inteiro(1, "um", "dez", "onze", "cento", "mil"));
		listaInteiros.add(new Inteiro(2, "dois", "vinte", "doze", "duzentos", "dois mil"));
		listaInteiros.add(new Inteiro(3, "tres", "trinta", "treze", "trezento", "tres mil"));
		listaInteiros.add(new Inteiro(4, "quatro", "quarenta", "cartoze", "quatrocentos", "quatro mil"));
		listaInteiros.add(new Inteiro(5, "cinco", "cinquenta", "quinze", "quinhentos", "cinco mil"));
		listaInteiros.add(new Inteiro(6, "seis", "sessenta", "dezesseis", "sesseiscentos", "seis mil"));
		listaInteiros.add(new Inteiro(7, "sete", "setenta", "dezessete", "setecentos", "sete mil"));
		listaInteiros.add(new Inteiro(8, "oito", "oitenta", "dezoito", "oitocentos", "oito mil"));
		listaInteiros.add(new Inteiro(9, "nove", "noventa", "dezenove", "novecentos", "nove mil"));
		
		Numero numero = new Numero(121, listaInteiros);
		System.out.println(numero.descreveNumero());
		
	}
}
