package desafioClasse;

public class Jantar {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Joaquim", 99.6);

		Comida c1 = new Comida("Feijao", 0.250);
		Comida c2 = new Comida("Arroz", 0.200);
		Comida c3 = new Comida("Bife", 0.400);

		System.out.println(p.apresentar());

		p.comer(c1);
		System.out.println(p.apresentar());
		
		p.comer(c2);
		System.out.println(p.apresentar());
		
		p.comer(c3);
		System.out.println(p.apresentar());
	}
}
