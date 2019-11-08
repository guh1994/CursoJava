package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana: ");
		String valor = entrada.nextLine().toUpperCase();
		
		if(valor == "DOMINGO") {
			System.out.println("O valor é: 1");
		}else if(valor.equals("SEGUNDA")) {
			System.out.println("O valor é: 2");
		}else if(valor.equals("TERÇA")) {
			System.out.println("O valor é: 3");
		}else if(valor.equals("QUARTA")) {
			System.out.println("O valor é: 4");
		}else if(valor.equals("QUINTA")) {
			System.out.println("O valor é: 5");
		}else if(valor.equals("SEXTA")) {
			System.out.println("O valor é: 6");
		}else if(valor.equals("SABADO")) {
			System.out.println("O valor é: 7");
		}else {
			System.out.println("Dia da semana invalido.");
		}
		
		entrada.close();
	}
}
