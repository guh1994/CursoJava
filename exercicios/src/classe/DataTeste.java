package classe;

public class DataTeste {
	public static void main(String[] args) {
		
		Data data = new Data();
		
		data.dia = 04;
		data.mes = 03;
		data.ano = 1994;
						
		System.out.printf("%d/%d/%d\n", data.dia, data.mes, data.ano);
		
		var data2 = new Data();
		
		data2.dia = 06;
		data2.mes = 07;
		data2.ano = 2020;
		
		System.out.printf("%d/%d/%d\n", data2.dia, data2.mes, data2.ano);
	}
}
