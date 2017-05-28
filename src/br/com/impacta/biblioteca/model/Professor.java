package br.com.impacta.biblioteca.model;

import java.util.Calendar;

public class Professor {
	private long idProfessor;
	private Telefone telefone;
	private Endereco endereco;
	private String nome;	
	private char sexo;
	private Calendar dataNasc;
	private String email;	
	public Telefone getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	
	//TODO: ArrayList de matérias
	public long getIdProfessor() {
		return idProfessor;
	}
	public void setIdProfessor(long idProfessor) {
		this.idProfessor = idProfessor;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
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
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
