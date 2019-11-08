package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String texto = "";
		do {
			System.out.println("Você precisa falar as palavras magicas...");
			
			System.out.println("Quer sair ?");
			texto = entrada.nextLine().toUpperCase();
		}
		while(!texto.equals("POR FAVOR"));
		
		System.out.println("Obrigado");
		
		entrada.close();
	}
}
