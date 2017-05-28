package br.com.impacta.biblioteca.model;

public class TipoFone {
	private long idTipoFone;
	private Telefone telefone;
	private String descricao;
	public long getIdTipoFone() {
		return idTipoFone;
	}
	public void setIdTipoFone(long idTipoFone) {
		this.idTipoFone = idTipoFone;
	}
	public Telefone getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
