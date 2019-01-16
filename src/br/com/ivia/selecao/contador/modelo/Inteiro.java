package br.com.ivia.selecao.contador.modelo;

public class Inteiro {
	
	private int valor;
	private String unidade;
	private String dezena;
	private String teen;
	private String centena;
	private String milhar;
		
	public Inteiro(int valor, String unidade, String dezena, String teen, String centena, String milhar) {
		if (valor >= 0) {
			this.valor = valor;
			this.unidade = unidade;
			this.dezena = dezena;
			this.teen = teen;
			this.centena = centena;
			this.milhar = milhar;
		}else {
			throw new IllegalArgumentException("Digite um número positivo");
		}
	}
	
	public int getValor() {
		return valor;
	}
	
	public String getUnidade() {
		return unidade;
	}
	
	public String getDezena() {
		return dezena;
	}
	
	public String getTeen() {
		return teen;
	}
	
	public String getCentena() {
		return centena;
	}
	
	public String getMilhar() {
		return milhar;
	}
	
	
	@Override
	public String toString() {
		return "[ " + this.valor + ", " + this.unidade + ", " + this.dezena + 
				", " + this.teen + ", " + this.centena + ", " + this.milhar + "]";
	}
}
