package br.com.impacta.biblioteca.model;

public class Multa {
	private long idMulta;
	private Emprestimo emprestimo;
	private double valor;
	public long getIdMulta() {
		return idMulta;
	}
	public void setIdMulta(long idMulta) {
		this.idMulta = idMulta;
	}
	public Emprestimo getEmprestimo() {
		return emprestimo;
	}
	public void setEmprestimo(Emprestimo emprestimo) {
		this.emprestimo = emprestimo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

}
