package br.com.impacta.biblioteca.model;

public class TipoEndereco {
	private long idTipoEndereco;
	private Endereco endereco;
	private String descricao;
	public long getIdTipoEndereco() {
		return idTipoEndereco;
	}
	public void setIdTipoEndereco(long idTipoEndereco) {
		this.idTipoEndereco = idTipoEndereco;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
