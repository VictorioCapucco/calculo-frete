package br.com.victoriocalculafrete.calculafrete.enumx;

public enum Empresas {
	BRASPRESS("Braspress", "BRASPRESS"), CORREIOS("Correios", "CORREIOS"), JAMEF("Jamef", "JAMEF"),
	RODONAVES("Rodonaves", "RODONAVES"), SEDEX("Sedex", "SEDEX");

	private String descricao;

	private String value;

	private Empresas(String descricao, String value) {
		this.descricao = descricao;
		this.value = value;
	}
	
	public String toString() {
		return this.descricao;
	}
}
