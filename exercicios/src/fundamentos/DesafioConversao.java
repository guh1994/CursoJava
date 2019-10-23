package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		
		Scanner salario = new Scanner(System.in);
		
		System.out.print("Digite seu primeiro salario: ");
		String salario1 = salario.nextLine().replace(",",".");
			
		System.out.print("\nDigite seu segundo salario: ");
		String salario2 = salario.nextLine().replace(",",".");
				
		System.out.print("\nDigite seu terceiro salario: ");
		String salario3 = salario.nextLine().replace(",",".");
	
		double valor1 = Double.parseDouble(salario1);
		double valor2 = Double.parseDouble(salario2);
		double valor3 = Double.parseDouble(salario3);
		
		//double media = ((Double.parseDouble(salario1) + Double.parseDouble(salario2) + Double.parseDouble(salario3))/ 3);
		//System.out.println(media);
		double media2 = (valor1 + valor2 + valor3)/3;
		
		System.out.printf("A média é: %.2f",media2);
		
		salario.close();
	}
}
