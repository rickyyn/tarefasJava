package tarefa;
import java.util.Scanner;

public class bb {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro: ");
		int t = scan.nextInt();
		if (t % 2 == 0) {
			System.out.println("Numero par");
		}else {
			System.out.println("Numero impar");
		}
		
		

	}

}
