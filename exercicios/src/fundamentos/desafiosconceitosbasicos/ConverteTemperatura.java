package fundamentos.desafiosconceitosbasicos;

import java.util.Scanner;

public class ConverteTemperatura {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite C para converter em celsius ou F para Fahrenheit");
		
		System.out.println("Digita aqui: ");
		String escalaTemperatura = entrada.nextLine().toUpperCase();
			
		System.out.println("Digite a temperatura que deseja converter: ");
		double temperatura = entrada.nextDouble();
		
		double resultado = "C".equals(escalaTemperatura) ? (temperatura - 32) * 5/9 : 0;
		
		resultado = "F".equals(escalaTemperatura) ? (temperatura * 9/5) + 32 : resultado;
	
		System.out.printf("O valor convertido é: %.2f" , resultado);
		entrada.close();
		
		
	}
}
