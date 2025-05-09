package br.edu.fatecpg.autenticavel.view;
import br.edu.fatecpg.autenticavel.model.*;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		SistemadeSeguranca ss = new SistemadeSeguranca();
		Scanner scan = new Scanner(System.in);
		
		String l, s, x;
		
		do {
		System.out.printf("Login :");
		l = scan.nextLine();
		System.out.printf("Senha: ");
		s = scan.nextLine();
		
		if(!ss.login(l, s)) {
			System.out.println("usuario ou senha incorreto");
		}
		else {
			System.out.println("Boas vindas!");
		}
		
		}while(!ss.login(l, s));
	
		
		System.out.println("Deseja desconectar?");
		System.out.println("Sim - 1");
		System.out.println("Nao - 2");
		x = scan.nextLine();
		if(x.equalsIgnoreCase("1")) {
			ss.logout();
		}

	}

}
