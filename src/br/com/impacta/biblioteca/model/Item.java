package br.com.impacta.biblioteca.model;

public class Item {
	private long idItem;
	private String nome;
	private int quantidade;
	private Acervo idAcervo;
	public long getIdItem() {
		return idItem;
	}
	public void setIdItem(long idItem) {
		this.idItem = idItem;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Acervo getIdAcervo() {
		return idAcervo;
	}
	public void setIdAcervo(Acervo idAcervo) {
		this.idAcervo = idAcervo;
	}

}
