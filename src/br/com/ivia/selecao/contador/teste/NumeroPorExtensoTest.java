package br.com.ivia.selecao.contador.teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.ivia.selecao.contador.modelo.Numero;

class NumeroPorExtensoTest {

	@Test
	public void retornaDezParaInteiroDez() {
		Numero numero = new Numero(10, listaInteiros);
		String result = numero.numeroPorExtenso();
		assertEquals("dez", result);
	}

}
