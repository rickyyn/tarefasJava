package br.edu.fatecpg.funcionario.view;
import br.edu.fatecpg.funcionario.model.*;
public class Main {

	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		Vendedor v = new Vendedor();
		Faxineiro f = new Faxineiro();
		
		g.fecharCaixa();
		v.realizarVenda();
		f.baterPonto();

	}

}
