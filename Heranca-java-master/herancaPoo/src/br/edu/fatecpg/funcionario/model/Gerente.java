package br.edu.fatecpg.funcionario.model;

public class Gerente implements Funcionario{
	
	
	@Override
public void solicitarMaterial () {
	System.out.println("material solicitado");
	}
@Override
public void baterPonto(){}

public void fecharCaixa () {
	System.out.println("Caixa fechado!");
}

}
