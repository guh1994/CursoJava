package controle;

public class Continue {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if(i % 2 == 1) {
				continue;//interrompe o que est� sendo feito.
			}
			System.out.println(i);
		}
	}
}
