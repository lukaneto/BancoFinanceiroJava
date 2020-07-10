package br.com.lukaneto.contas;

public class Data {
	private String dia;
	private String mes;
	private String ano;
	
	public String getDia(){
		return this.dia; 
	}
	
	public void setDia(String dia){
		this.dia = dia;
	}
	
	public String getMes(){
		return this.mes;
	}
	
	public void setMes(String mes){
		this.mes = mes;
	}
	
	public String getAno(){
		return this.ano;
	}
	
	public void setAno(String ano){
		this.ano = ano;
	}
	
	String formatada(){
		String data = this.dia+"/"+this.mes+"/"+this.ano;
		return data;
	}
}