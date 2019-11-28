package controledesafiomodulo;

import java.util.Scanner;

public class media {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a primeira note: ");
		double nota1 = entrada.nextDouble();

		System.out.println("Digite a segunda note: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 * nota2) / 2;
		
		if(media>= 7 ) {
			System.out.println("Aprovado");
		}else if(media<7 && media>4.0) {
			System.out.println("Recuperação");
		}else {
			System.out.println("Reprovado");
		}
		entrada.close();
	}
}
