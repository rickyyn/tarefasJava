package tarefa;
import java.util.Scanner;
public class Ee {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String senha = "Java123";
		System.out.println("Digite a senha: ");
		String i = scan.next();
		
		while (!i.equals (senha)) {
			System.out.println("Senha incorreta, tente novamente");
			i = scan.next();
			
		} 
		System.out.println("Senha correta!");

	}

}
