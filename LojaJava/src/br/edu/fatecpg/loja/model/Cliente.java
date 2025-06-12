package br.edu.fatecpg.loja.model;

public class Cliente extends Pessoa {
	private int codigo;
	private double credito;
	private Endereco end;
	
	public Cliente(String nome, int id, int cd, double crd, Endereco end) {
		super(nome, id);
		this.codigo= cd;
		this.credito=crd;
		this.end = end;
	}
	

	@Override
	public String toString() {
		return "Cliente ["+ "Nome: " +this.getNome() + " Idade: " + this.getIdade() + " Codigo=" + codigo + ", credito=" + credito + ", end=" + end + "]";
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public double getCredito() {
		return credito;
	}


	public void setCredito(double credito) {
		this.credito = credito;
	}


	public Endereco getEnd() {
		return end;
	}


	public void setEnd(Endereco end) {
		this.end = end;
	}
	

}
