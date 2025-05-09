package br.edu.fatecpg.pagamentos.model;

public class PagamentoCartao implements Pagamentos{
private double valor;

public double getValor() {
	return valor;
}

public void setValor(double v) {
	this.valor = v;
}

	@Override
	public void calcularPagamento() {
		this.valor = this.valor + (this.valor * 0.05) ;
		
	}

	@Override
	public void emitirRecibo() {
		System.out.println("Valor total: " + this.valor);
		
	}

}
