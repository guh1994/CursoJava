package fundamentos.desafiosconceitosbasicos;

import java.util.Scanner;

public class Imc {
	public static void main(String[] args) {
		
		System.out.println("Programa que calcula IMC");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a sua Altura: ");
		
		double altura = entrada.nextDouble();
		
		System.out.println("Digite seu peso: ");
		
		double peso = entrada.nextDouble();
		
		double resultado = peso /(altura * altura);
		
		System.out.printf("O seu IMC é: %.2f", resultado);
		
		
		entrada.close();
	}
}
