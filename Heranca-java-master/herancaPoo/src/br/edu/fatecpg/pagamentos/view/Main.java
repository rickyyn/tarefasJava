package br.edu.fatecpg.pagamentos.view;
import br.edu.fatecpg.pagamentos.model.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		PagamentoDinheiro pg = new PagamentoDinheiro();
		PagamentoCartao pc = new PagamentoCartao();
		Scanner scan = new Scanner(System.in);
		
		String x;
		double v = 50;
		
		System.out.println("Opções de pagamento");
		System.out.println("Cartão - 1");
		System.out.println("Dinheiro - 2");
		x = scan.nextLine();
		
		switch(x) {
		case "1":
			pc.setValor(v);
			pc.calcularPagamento();
			pc.emitirRecibo();
			break;
			
		case "2":
			pg.setValor(v);
			pg.calcularPagamento();
			pg.emitirRecibo();
			break;
			
		default:
			System.out.println("Erro, escolha a opção correta!");
			break;
		}
		
		
	}

}
