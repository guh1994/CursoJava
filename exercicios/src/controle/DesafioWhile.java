package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double total = 0;
		double quantidadeNotas = 1;
		double media;
		double nota = 0;
		double notaInvalida = 0;

		while (nota != -1) {
			System.out.println("Digite uma nota valida ou digite -1 para sair: ");
			nota = entrada.nextDouble();
			if (nota <= 10 && nota >= 0) {

				total += nota;

				quantidadeNotas++;
			} else if (nota == -1) {

				System.out.println("Obrigado");
			} else {
				System.out.println("Por Favor digite uma nota valida");

				notaInvalida++;
			}
		}
		media = total / quantidadeNotas;

		System.out.println("A média é: " + media);
		System.out.println("A quantidade de notas digitas foram: " + quantidadeNotas);
		System.out.println("A quantidade de novas invalidas foram: " + notaInvalida);
		entrada.close();
	}
}
