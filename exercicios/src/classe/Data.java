package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	Data(){
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	Data(int dia,int mes,int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada(){
		return String.format("%d/%d/%d ", this.dia,this.mes,this.ano);
	}
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
}
//byte, short, int, long ->0
//float, double -> 0.0
//boolean -> false
//char -> '\u0000'
//objetos -> null