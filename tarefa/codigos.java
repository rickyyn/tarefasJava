package tarefa;
import java.util.Scanner;
public class codigos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int op;
		System.out.println("1 - Calcular a area de um quadrado ");
		System.out.println("2 - Calcular area de um circulo");
		op = scan.nextInt();
		
		switch (op) {
		case 1:
			System.out.println("digite o comprimento do quadrado: ");
			double comp = scan.nextDouble();
			System.out.println("digite a altura do quadrado: ");
			double alt = scan.nextDouble();
			double result = comp * alt;
			System.out.println("Area do quadrado: " + result);
			break;
			
		case 2: System.out.println("Digite o raio do circulo: ");
		double r = scan.nextDouble();
		double area = (Math.pow(r, 2)) * Math.PI;
		area = Math.round(area);
		System.out.println("Area do circulo: " + area);
		break;
		
		default:
			System.out.println("erro");
			break;
			
		}

	}

}
