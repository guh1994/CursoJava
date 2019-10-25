package fundamentos.operadores;

public class DesafioAritimeticos {
	public static void main(String[] args) {
		
		double b;
		double c;
		
		double resultado;
		
		b = Math.pow(6*(3+2),2); //metodo para potencia
		
		b = b/(3*2);
		
		c = Math.pow((1-5)*(2-7)/2, 2);	
		
		resultado = Math.pow((b - c)/10, 3);
		
		System.out.println(resultado);		
		
	}
}
