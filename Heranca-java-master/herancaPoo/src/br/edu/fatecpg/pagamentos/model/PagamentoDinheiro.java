package br.edu.fatecpg.pagamentos.model;

public class PagamentoDinheiro implements Pagamentos{
private double valor;
	
public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public void calcularPagamento() {
		this.valor = this.valor - (this.valor * 0.10) ;
		
	}

	@Override
	public void emitirRecibo() {
		System.out.println("Valor total: " + this.valor);
		
	}

	
}
