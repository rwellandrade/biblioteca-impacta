package br.com.impacta.biblioteca.model;

public class Pagamento {
	private long idPagamento;
	private Multa multa;
	public long getIdPagamento() {
		return idPagamento;
	}
	public void setIdPagamento(long idPagamento) {
		this.idPagamento = idPagamento;
	}
	public Multa getMulta() {
		return multa;
	}
	public void setMulta(Multa multa) {
		this.multa = multa;
	}

}
