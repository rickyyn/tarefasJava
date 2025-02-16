package tarefa;
import java.util.Scanner;

public class Gg {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String[] nomes = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = scan.next();
        }
        scan.nextLine();

        System.out.print("Digite um nome para verificar se está na lista: ");
        String veri = scan.nextLine();
        boolean nom = false;
        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(veri)) {
                nom = true;
                break;
            }
        }

        if (nom) {
            System.out.println("O nome " + veri + " está na lista!");
        } else {
            System.out.println("O nome " + veri + " não está na lista!");
        }

		

	}

}
