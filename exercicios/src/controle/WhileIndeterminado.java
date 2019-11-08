package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		String cont = "";
		Scanner entrada = new Scanner(System.in);

		while (!cont.equals("SAIR")) {
			
			System.out.println("Voce diz: ");
			cont = entrada.nextLine().toUpperCase();

		}

		entrada.close();
	}
}
