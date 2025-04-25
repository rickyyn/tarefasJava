package br.edu.fatecpg.contrato.model;

public class Gerente implements Funcionario {

	@Override
	public void baterPonto() {
		
		
	}

	@Override
	public void solicitarMaterial() {
		System.out.println("Qual o Material?");
		
	}
	public void fecharCaixa() {
		System.out.println("Caixa fechado!");
	}

}
