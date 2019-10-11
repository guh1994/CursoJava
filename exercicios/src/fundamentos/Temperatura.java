package fundamentos;

public class Temperatura {
	public static void main(String[] args) {

		// (°F - 32) x 5/9 = °C
		final double AJUSTE = 32;
		final double DIVISAO = 5.0 / 9.0;
		double result;
		double fahre = 86;

		result = (fahre - AJUSTE) * DIVISAO;

		System.out.println("A temperatura é " + result + "°C.");

		fahre = 150;
		result = (fahre - AJUSTE) * DIVISAO;

		System.out.println("A temperatura é " + result + "°C.");
	}
}
