package controledesafiomodulo;

import java.util.Scanner;

public class AnoBissexto {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu ano atual: ");
		int anoAtual = entrada.nextInt();
		
		int bissexto = anoAtual % 4;
		
		if(bissexto == 0) {
			System.out.println("É ano bissexto!!");
		}else {
			System.out.println("Não é ano bissexto!!");
		}

		entrada.close();
	}
}
