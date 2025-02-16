package tarefa;
import java.util.Scanner;

public class Dd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		if(idade < 18) {
			System.out.println("Menor de idade");
		}else if(idade < 60) {
			System.out.println("Maior de idade");
		}else {
			System.out.println("Idoso");
		}

	}

}
