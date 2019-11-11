package controle;

public class DesafioFor {
	public static void main(String[] args) {

		String valor = "#";
		for (int i = 1; i <= 5; i++) {
			System.out.println(valor);

			valor += "#";
		}

		// Versao do desafio
		// N�o pode usar valor numerico pra controlar o la�o!

		//Assim
		for (; !valor.equals("######"); valor += "#") {
			System.out.println(valor);
		}
		//ou Assim
		for(String v = "#";!v.equals("######");v+="#") {
			System.out.println(v);
		}
	}
}
