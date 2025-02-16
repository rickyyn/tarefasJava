package tarefa;
import java.util.Scanner; 


public class java {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 

		int n1, n2; 

		System.out.println("Digite o primeiro valor: "); 

		n1 = scan.nextInt(); 

		System.out.println("Digite o segundo valor: ");
		
		n2 = scan.nextInt();
		
		if(n1 < n2){
			System.out.println("Valores digitados são diferentes, o segundo sendo o maior");
			
		}else if (n1 > n2) {
			System.out.println("Valores digitados são diferentes, o primeiro sendo o maior");
		}else {
			System.out.println("Valores digitados são iguais");
		}

	}

}
