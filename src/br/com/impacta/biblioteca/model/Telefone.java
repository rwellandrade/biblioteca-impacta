package br.com.impacta.biblioteca.model;

public class Telefone {
	private long idTelefone;
	private Aluno aluno;
	private String numero;	
	public long getIdTelefone() {
		return idTelefone;
	}
	public void setIdTelefone(long idTelefone) {
		this.idTelefone = idTelefone;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Visitante getVisitante() {
		return visitante;
	}
	public void setVisitante(Visitante visitante) {
		this.visitante = visitante;
	}
	private Visitante visitante;

}
