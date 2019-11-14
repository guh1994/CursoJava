package controledesafiomodulo;

import java.util.Scanner;

public class VerificaNumeroPar {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Por favor insira um número: ");
		double numero = entrada.nextDouble();

		if (numero >= 0 && numero <= 10) {
			if (numero % 2 == 1) {
				System.out.println("Seu numero é impar");
			} else {
				System.out.println("Seu numero é par");
			}
		}else {
			System.out.println("Por favor digite um numero de 0 a 10");
		}

		entrada.close();
	}
}
