package br.com.impacta.biblioteca.model;

import java.util.Calendar;

public class Emprestimo {
	private long idEmprestimo;
	private String nome;
	private String domiciliar;
	private String local;
	private Calendar renovacao;
	private Calendar devolucao;
	private String reserva;
	private String ope;
	private int quantidade;
	private Calendar retirada;
	private char bloqueado;
	public long getIdEmprestimo() {
		return idEmprestimo;
	}
	public void setIdEmprestimo(long idEmprestimo) {
		this.idEmprestimo = idEmprestimo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDomiciliar() {
		return domiciliar;
	}
	public void setDomiciliar(String domiciliar) {
		this.domiciliar = domiciliar;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public Calendar getRenovacao() {
		return renovacao;
	}
	public void setRenovacao(Calendar renovacao) {
		this.renovacao = renovacao;
	}
	public Calendar getDevolucao() {
		return devolucao;
	}
	public void setDevolucao(Calendar devolucao) {
		this.devolucao = devolucao;
	}
	public String getReserva() {
		return reserva;
	}
	public void setReserva(String reserva) {
		this.reserva = reserva;
	}
	public String getOpe() {
		return ope;
	}
	public void setOpe(String ope) {
		this.ope = ope;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Calendar getRetirada() {
		return retirada;
	}
	public void setRetirada(Calendar retirada) {
		this.retirada = retirada;
	}
	public char getBloqueado() {
		return bloqueado;
	}
	public void setBloqueado(char bloqueado) {
		this.bloqueado = bloqueado;
	}

}
