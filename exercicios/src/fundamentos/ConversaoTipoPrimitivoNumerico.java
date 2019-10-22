package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		//convers�o implicita
		double a = 1;
		System.out.println(a);
		
		//convers�o explicita (CAST)
		float b = (float)1.12345678888888;
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; //convers�o explicita (CAST)		
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int) e; //convers�o explicita (CAST)
		System.out.println(f);
	}
}
