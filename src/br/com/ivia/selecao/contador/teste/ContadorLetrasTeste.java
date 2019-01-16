package br.com.ivia.selecao.contador.teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.ivia.selecao.contador.modelo.ConversorNumeroEmLetras;

class ContadorLetrasTeste {

	@Test
	public void QtdeDeLetrasDeNumeroMenorVinte() {
		ConversorNumeroEmLetras conversor = new ConversorNumeroEmLetras();
		int result = conversor.contaLetras(4);
		assertEquals(6, result);
	}
	
	@Test
	public void QtdeDeLetrasDeNumeroVinte() {
		ConversorNumeroEmLetras conversor = new ConversorNumeroEmLetras();
		int result = conversor.contaLetras(20);
		assertEquals(5, result);
	}
	
	@Test
	public void SomaLetrasAteDez() {
		ConversorNumeroEmLetras conversor = new ConversorNumeroEmLetras();
		int result = conversor.somaLetras(10);
		assertEquals(40, result);
	}
}
