package br.com.ivia.selecao.contador.modelo;

/**
 * A Classe ConversorNumeroEmLetras é responsável retornar a quantidade de letras
 * de uma sequencia de 1 a 1000
 * Atributo array contendo a quantidade de letras correspondente aos número de 1 a 20
 * @author Rafael
 *
 */
public class ConversorNumeroEmLetras {
	
	private int[] arrayAteVinte = {2, 4, 4, 6, 5, 4, 4, 4, 4, 3, 4, 4, 5, 8, 6, 9, 9, 7, 8, 5};

	public int contaLetras(int i) {
		if(i <= 20) {
			return arrayAteVinte[i - 1];
		}else {
			return 0;
		}	
	}
	
	public int somaLetras(int numero) {
		int aux;
		int total = 0;
		
		for(int i=0; i<numero-1; i++) {
			aux = contaLetras(i);
			total += aux;
		}
		return total;
	}
}
