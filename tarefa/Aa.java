package tarefa;
import java.util.Scanner;

public class Aa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		double v = scan.nextDouble();
		for (int i = 0; i <= 10; i++) {
			double e = i * v;
			System.out.println(e);
		}
		

	}

}
