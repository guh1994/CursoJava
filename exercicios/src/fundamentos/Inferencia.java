package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		double a = 4.5;
		
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		//isso é inferencia onde não há declaração de tipagem. O java identifica automaticamente
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
	}

}
