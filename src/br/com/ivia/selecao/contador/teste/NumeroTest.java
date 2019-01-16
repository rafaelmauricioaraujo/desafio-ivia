package br.com.ivia.selecao.contador.teste;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import br.com.ivia.selecao.contador.modelo.Inteiro;
import br.com.ivia.selecao.contador.modelo.Numero;

class NumeroTest {
	
	public ArrayList<Inteiro> listaInteiros;
	
	@Before
	public void inicialize() {
		
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
		
	}
	
	@Test
	public void retornaDezParaInteiroDez() {
		Numero numeroDez = new Numero(10, listaInteiros);
		String transcricao = numeroDez.numeroPorExtenso();
		assertEquals("dez", transcricao);

	}
}
