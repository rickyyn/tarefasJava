package br.edu.fatecpg.restaurante.model;


public class Itempedido {
	private String NmPrato;
	private int qtd;
	private double precoUnitario;
	
	public Itempedido(String nmPrato, int qtd, double precoUnitario) {
		super();
		NmPrato = nmPrato;
		this.qtd = qtd;
		this.precoUnitario = precoUnitario;
	}
	public String getNmPrato() {
		return NmPrato;
	}
	public void setNmPrato(String nmPrato) {
		NmPrato = nmPrato;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public double getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	
	@Override
	public String toString() {
		return "Itens Pedidos [Nome do prato=" + NmPrato + ", quantidade=" + qtd + ", preço=" + precoUnitario + "]";
	}
	
	
	

}
