package br.edu.fatecpg.contrato.view;
import br.edu.fatecpg.contrato.model.*;
public class Main {

	public static void main(String[] args) {
		Faxineiro fax = new Faxineiro();
		Vendedor ven = new Vendedor();
		Gerente gen = new Gerente();
		
		fax.baterPonto();
		gen.baterPonto();
		ven.baterPonto();
		
		gen.solicitarMaterial();
		fax.solicitarMaterial();
		ven.solicitarMaterial();
		
		ven.RealizarVenda();
		gen.fecharCaixa();
		
		

	}

}
