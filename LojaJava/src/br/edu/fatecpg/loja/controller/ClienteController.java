package br.edu.fatecpg.loja.controller;
import java.util.List;
import java.util.ArrayList;
import br.edu.fatecpg.loja.model.*;

public class ClienteController {
	private List<Cliente> clientes = new ArrayList<>();
	
	public void setCliente(String nome, int id, int cd, double crd, Endereco end) {
		Cliente c = new Cliente(nome, id, cd, crd, end);
		clientes.add(c);
	}
	
	public String getCliente(int index) {
		return clientes.get(index).toString();	
	}
	
	public String getLista() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<clientes.size(); i++) {
			sb.append(clientes.get(i).toString());
			sb.append("\n");
		}
		
		return sb.toString();
	}

}
