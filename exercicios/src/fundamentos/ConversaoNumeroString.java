package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		Integer num1 = 10000;
		
		System.out.println(num1.toString().length());//convers�o forma 1
		
		int num2 = 100000;
		
		System.out.println(Integer.toString(num2).length());//convers�o forma 2 isso serve para todos os wrapper
		
		System.out.println((""+num2).length());//convers�o forma 3
		System.out.println((""+num1).length());//convers�o forma 4
		
	
	}
}
