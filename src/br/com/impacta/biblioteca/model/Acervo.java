package br.com.impacta.biblioteca.model;

import java.util.Calendar;

public class Acervo {
	private long idAcervo;
	private String descricao;
	private String autor;
	private String gravadora;
	private Calendar ano;
	private String titulo;
	public long getIdAcervo() {
		return idAcervo;
	}
	public void setIdAcervo(long idAcervo) {
		this.idAcervo = idAcervo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	public Calendar getAno() {
		return ano;
	}
	public void setAno(Calendar ano) {
		this.ano = ano;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	

}
