package fundamentos.desafiosconceitosbasicos;

import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que calcula a area do triangulo!!!");
		
		System.out.println("Digite o valor da base: ");
		double base = entrada.nextDouble();
		
		System.out.println("Digite o valor da altura do triangulo: ");
		double altura = entrada.nextDouble();
		
		double area = (base*altura)/2;
		
		System.out.printf("A area do triangulo é %.2f", area);
		
		entrada.close();
	}
}
