package br.edu.fatecpg.restaurante.model;
import java.util.ArrayList;
import java.util.List;
import br.edu.fatecpg.restaurante.model.*;

public class Pedido {
	private int nmrPedido;
	private int nmrMesa;
	public Pedido(int nmrPedido) {
		super();
		this.nmrPedido = nmrPedido;
		this.listaPedidos = new ArrayList<>();
	}
	private List<Itempedido> listaPedidos = new ArrayList<>();
	
	public void adicionarItem(Itempedido item) {
		listaPedidos.add(item);
	}
	
	public void removerItem(Itempedido item) {
		listaPedidos.remove(item);
	}
	public double calcularPreco() {
		double valorTotal = 0;
		for (Itempedido item : listaPedidos) {
			valorTotal += item.getPrecoUnitario() * item.getQtd();
		}
		return valorTotal;
	}
	
	public void reservarMesa(int nmrMesa) {
		this.nmrMesa = nmrMesa;
		System.out.println("Mesa reservada!");
		
	}
}
