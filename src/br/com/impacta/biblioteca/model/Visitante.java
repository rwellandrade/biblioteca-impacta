package br.com.impacta.biblioteca.model;

import java.util.Calendar;

public class Visitante {
	private long idVisitante;
	private String nome;	
	private char sexo;
	private Calendar dataNasc;
	private String Email;
	public long getIdVisitante() {
		return idVisitante;
	}
	public void setIdVisitante(long idVisitante) {
		this.idVisitante = idVisitante;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public Calendar getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Calendar dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}

}
