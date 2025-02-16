package tarefa;
import java.util.Scanner;

public class Ff {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
        int n = scan.nextInt();
        int soma = 0;
        int numeroImpar = 1;
        for (int i = 0; i < n; i++) {
            soma += numeroImpar;
            numeroImpar += 2;
        }
        System.out.println("A soma dos " + n + " primeiros números ímpares é: " + soma);

		

	}

}
