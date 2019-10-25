package fundamentos.operadores;

public class DesafioLogico {
	public static void main(String[] args) {
		//trabalho na terça (V ou F)
		//trabalho na quinta (V ou F)
		
		//se os dois trabalhos derem certos tv 50 polegadas
		//se apenas 1 dos dois derem certos tv de 32 polegadas
		//Tanto comprando um ou outro a familia vai comprar sorvete
		//nenhum trabalho deu certo familia fica em casa
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		//Operador unario
		boolean maisSaudavel = !comprouSorvete;
		
		
		System.out.println("Comprou TV 50\"?" + comprouTv50);
		System.out.println("Comprou TV 32\"?" + comprouTv32);
		System.out.println("Sorvete?" + comprouSorvete);
		System.out.println("Mais Saudavel?" + maisSaudavel);
		
		
//		//caso 1
//		trabalho1 = true;
//		trabalho2 = true;
//		if(trabalho1 == true && trabalho2 == true) {
//			System.out.println("Compraremos a Tv de 50 polegadas e tomaremos sorvete");
//		}
//		
//		//caso 2
//		trabalho1 = true;
//		trabalho2 = false;
//		
//		if(trabalho1 ^ trabalho2 ) {
//			System.out.println("Compraremos a TV de 32 polegadas e tomaremos sorvete");
//		}
//		
//		//caso 3
//		
//		if(trabalho1 == true || trabalho2 == true) {
//			System.out.println("Tomaremos Sorvete");
//			
//		}
//		
//		if(trabalho1==false && trabalho2==false) {
//			System.out.println("Ficaremos em casa");
//		}
	}
}
