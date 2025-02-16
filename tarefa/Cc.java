package tarefa;
import java.util.Scanner;
public class Cc {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Digite um valor inteiro: ");
	double i = scan.nextDouble();
	double fatorial = 1; 
	for (int c = 1; c <= i; c++) {
	fatorial *= c;
		
	}
	System.out.println(fatorial);

	}

}
