package fundamentos.desafiosconceitosbasicos;

import java.util.Scanner;

public class QuadradoCubo {
	public static void main(String[] args) {
		
		System.out.println("Resultado ao quadrado e ao cubo");
		
		Scanner entrada = new Scanner(System.in);
				
		System.out.println("Digite o valor: ");
		
		double valor = entrada.nextDouble();		
		
		double resultado1 = Math.pow(valor, 2);
		
		double resultado2 = Math.pow(valor, 3);
		
		System.out.printf("O valor ao quadrado é: %.2f e o valor ao cubo é: %.2f", resultado1,resultado2);
		
		entrada.close();
		
	}
}
