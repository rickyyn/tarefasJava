package br.edu.fatecpg.contrato.model;

public class Vendedor implements Funcionario {

	@Override
	public void baterPonto() {
		System.out.println("Ponto Registrado!");
	}

	@Override
	public void solicitarMaterial() {
		System.out.println("Qual o Material?");
	}
	
	public void RealizarVenda() {
		System.out.println("Venda realizada!");
	}

}
