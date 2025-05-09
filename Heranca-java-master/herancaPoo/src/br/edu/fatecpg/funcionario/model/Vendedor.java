package br.edu.fatecpg.funcionario.model;

public class Vendedor implements Funcionario{

	@Override
	public void baterPonto() {
		System.out.println("ponto batido");
		
	}

	@Override
	public void solicitarMaterial() {
		// TODO Auto-generated method stub
		
	}
	
	public void realizarVenda () {
		System.out.println("venda realizada!");
	}

}
