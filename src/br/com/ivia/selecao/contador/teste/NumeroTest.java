package br.com.ivia.selecao.contador.teste;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import br.com.ivia.selecao.contador.modelo.Inteiro;
import br.com.ivia.selecao.contador.modelo.Numero;

class NumeroTest {
	
	public ArrayList<Inteiro> listaInteiros(){
		
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
	
	//Testes abaixo são relativos ao método que converte um número em um inteiro por extenso.
	
	@Test
	public void deveRetornarStringUmParaInteiroUm() {
		Numero numero = new Numero(1, listaInteiros());
		String result = numero.numeroPorExtenso();
		assertEquals("um", result);
	}
	
	@Test
	public void deveRetornaStringDezParaInteiroDez() {
		Numero numero = new Numero(10, listaInteiros());
		String result = numero.numeroPorExtenso();
		assertEquals("dez", result);
	}
	
	@Test
	public void deveRetornarStringCemParaInteiroCem() {
		Numero numero = new Numero(100, listaInteiros());
		String result = numero.numeroPorExtenso();
		assertEquals("cem", result);
	}
	
	@Test 
	void deveRetornarStringCentoParaInteiroDaOrdemDasCentenasMaioresQueCem() {
		Numero numero = new Numero(121, listaInteiros());
		String result = numero.numeroPorExtenso();
		assertEquals("cento e vinte e um", result);
	}
	
	@Test 
	void deveRetornarStringMilParaInteiroMil() {
		Numero numero = new Numero(1000, listaInteiros());
		String result = numero.numeroPorExtenso();
		assertEquals("mil", result);
	}
	
	//Testes abaixo são relativos ao método que conta o número de letras de cada string.
	
	@Test 
	void deveRetornarOInteiroSeisParaONumeroQuatro() {
		Numero numero = new Numero(4, listaInteiros());
		int result = numero.totalDeLetras();
		assertEquals(6, result);
	}
	
	@Test 
	void deveRetornarOInteiroTresParaONumeroMil() {
		Numero numero = new Numero(1000, listaInteiros());
		int result = numero.totalDeLetras();
		assertEquals(3, result);
	}
	
	@Test 
	void deveRetornarOInteiroVinteESeteParaONumeroNovecentosENoventaENove() {
		Numero numero = new Numero(999, listaInteiros());
		int result = numero.totalDeLetras();
		assertEquals(27, result);
	}
	
	//Testes abaixo são relativos ao método que conta o numero de letras acumuladas até o valor
	
	@Test 
	void deveRetonrnarOInteiroTrintaESeteParaASomaDasLetrasAteNove() {
		Numero numero = new Numero(9, listaInteiros());
		int result = numero.totalDeLetrasAcumuladas();
		assertEquals(37, result);
	}
	
	@Test
	void deveRetornarOInteiro23084ParaASomaDasLetrasAte1000() {
		Numero numero = new Numero(1000, listaInteiros());
		int result = numero.totalDeLetrasAcumuladas();
		assertEquals(23084, result);
	}
	
}
