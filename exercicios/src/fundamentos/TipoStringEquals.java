package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		
		System.out.println("2".equals(s1)); //Compara a igualdade
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();//next remove os espaços em branco e nextLine não remove.
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
		
	}
}
