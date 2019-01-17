package br.com.ivia.selecao.contador.teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.ivia.selecao.contador.modelo.Inteiro;

class InteiroTest {

	@Test
	public void DeveRetornarErroParaValorNegativoComValorDez() {
		Inteiro dez = new Inteiro(-10,"", "", "", "", "" );
		int result = dez.getValor();
		assertEquals(new IllegalArgumentException(), result);
	}
}
