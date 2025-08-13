package br.edu.fatecpg.restaurante.model;
import java.util.ArrayList;
import java.util.List;
import br.edu.fatecpg.restaurante.model.*;

public class Restaurante {
	private List<Itempedido> pedidos = new ArrayList<>();
	
	public void adicionarItem(Itempedido p) {
		pedidos.add(p);
	}
	
	public void removerItem(Itempedido p) {
		pedidos.remove(p);
	}
	
	public String getPedido(int index) {
		return pedidos.get(index).toString();
	}
	
	public String getLista() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<pedidos.size(); i++) {
			sb.append(pedidos.get(i).toString());
			sb.append("\n");
		}
		return sb.toString();
	}

}
