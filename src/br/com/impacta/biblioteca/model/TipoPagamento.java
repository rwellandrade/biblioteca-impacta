package br.com.impacta.biblioteca.model;

public class TipoPagamento {
	private long idTipoPagamento;
	private Pagamento pagamento;
	private String descricao;
	public long getIdTipoPagamento() {
		return idTipoPagamento;
	}
	public void setIdTipoPagamento(long idTipoPagamento) {
		this.idTipoPagamento = idTipoPagamento;
	}
	public Pagamento getPagamento() {
		return pagamento;
	}
	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
