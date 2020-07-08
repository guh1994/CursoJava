package classe;

public class DataTeste {
	public static void main(String[] args) {
		
		Data data = new Data();
		
//		data.ano=2021;
								
		System.out.println(data.obterDataFormatada());
		
		var data2 = new Data(06,07,2020);
		
		
		
		System.out.println(data2.obterDataFormatada());
	}
}
