package br.edu.fatecpg.restaurante.view;
import br.edu.fatecpg.restaurante.model.*;

public class Main {

	public static void main(String[] args) {
		Restaurante r = new Restaurante();
		Pedido p = new Pedido(1);
		Itempedido item1 = new Itempedido("Lasanha Bolonhesa", 2, 29.90);
		Itempedido item2 = new Itempedido("Parmegiana de Frango", 2, 19.90);
		p.adicionarItem(item2);
		p.adicionarItem(item1);
		p.removerItem(item2);
		r.adicionarItem(item1);
		r.removerItem(item2);
		System.out.println(r.getLista());		
		p.reservarMesa(2);
	}

}
