package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();

		// offer e add -> adicionam elementos na fila
		// Diferenca e o comportamento quando a fila esta cheia
		fila.add("Ana");// retorna false
		fila.offer("Bia");// Lanca uma excecao
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafael");
		fila.offer("Gui");

		//Peek e Element -> obtem o proximo elemento da fila
		// Diferenca e o comportamento quando a fila esta vazia
		System.out.println(fila.peek());// retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element());// lanca uma excesao
		System.out.println(fila.element());
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains();
		
		//Poll e Remove -> Obtem o proximo elemento da fila e remove
		//Diferenca de comportamento ocorre quando a fila esta vazia
		System.out.println(fila.poll()); //retorna null
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove()); //lanca uma excessao
	}
}
