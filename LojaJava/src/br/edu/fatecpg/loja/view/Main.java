package br.edu.fatecpg.loja.view;
import br.edu.fatecpg.loja.model.*;
import br.edu.fatecpg.loja.controller.*;

public class Main {
	
	public static void main(String[] args) {
		Endereco end1 = new Endereco("11703-222","Rua X","10A","Boqueirão");
		Endereco end2 = new Endereco("11703-221","Rua Y","11A","Boqueirão");
		Endereco end3 = new Endereco("11703-220","Rua Z","12A","Boqueirão");
		EnderecoController end = new EnderecoController();
		end.setEndereco("11700-221", "Rua X", "10A", "Boqueirão");
		end.setEndereco("11700-222", "Rua Y", "11A", "Boqueirão");
		end.setEndereco("11700-223", "Rua Z", "12A", "Boqueirão");
		ClienteController cliente = new ClienteController();
		cliente.setCliente("Atrasado da silva", 20, 1, 6900.99, end1);
		cliente.setCliente("Sheldon", 20, 2, 19000.99, end2);
		cliente.setCliente("Desgracado de souza", 20, 3, 1200.99, end3);
		
		System.out.println(cliente.getCliente(1));
		System.out.println(cliente.getLista());
		System.out.println(end.getEndereco(0));
		System.out.println(end.getLista());
		
		
		
		
	}

}
