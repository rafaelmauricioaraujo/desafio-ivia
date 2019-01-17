package br.com.ivia.selecao.contador.teste;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import br.com.ivia.selecao.contador.modelo.Inteiro;
import br.com.ivia.selecao.contador.modelo.Numero;

class NumeroTeste {
	
	public ArrayList<Inteiro> listaInteiro(){
		
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
		
		return listaInteiros;
		
	}
	
	@Test
	public void deveRetornarStringUmParaInteiroUm() {
		Numero numero = new Numero(1, listaInteiro());
		String result = numero.numeroPorExtenso();
		assertEquals("um", result);
	}
	
	@Test
	public void deveRetornaStringDezParaInteiroDez() {
		Numero numero = new Numero(10, listaInteiro());
		String result = numero.numeroPorExtenso();
		assertEquals("dez", result);
	}
	
	@Test
	public void deveRetornarStringCemParaInteiroCem() {
		Numero numero = new Numero(100, listaInteiro());
		String result = numero.numeroPorExtenso();
		assertEquals("cem", result);
	}
}
