package Critico;

public class Data {
	String dia;
	String mes;
	String ano;
	
	String formatada(){
		String data = this.dia+"//"+this.mes+"//"+this.ano;
		return data;
	}
}
