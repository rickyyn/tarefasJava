package br.edu.fatecpg.operacaoMatematica.view;
import br.edu.fatecpg.operacaoMatematica.model.*;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Calculadora c = new Calculadora();
		Scanner scan = new Scanner(System.in);
		
		double x, y;
		
		System.out.println("Digite um número");
		x = scan.nextDouble();
		System.out.println("Digite outro número");
		y = scan.nextDouble();
		
		System.out.println(c.somar(x, y));
		System.out.println(c.subtrair(x, y));
		System.out.println(c.multiplicar(x, y));
		System.out.println(c.dividir(x, y));
		
	}

}
