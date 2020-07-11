package br.com.lukaneto.contas;

import br.com.lukaneto.clientes.ClientesDoBanco;

public class Conta {
	public ClientesDoBanco cliente;
	private int numero;
	private String agencia;
	private double saldo;
	public Data dataDeAbertura;
	
	public int getNumero(){
		return this.numero;
	}
	
	public void setNumero(int numero){
		this.numero = numero;
	}
	
	public String getAgencia(){
		return this.agencia;
	}
	
	public void setAgencia(String agencia){
		this.agencia = agencia;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	
	public boolean saca(double valor){
		
		if(valor <= this.saldo){
			
			this.saldo-=valor;
			return true;
		}else{
			return false;
		}
	}
	
	boolean transfere(Conta contaBanco, double valor){
		if(this.saca(valor)){
			contaBanco.setSaldo(valor);
			return true;
		}else {
			return false;
		}
	}
	
	double calculaRendimento(){
		return this.saldo*0.1;
	}
	
	public String recuperaDadosImpressao(){
		String dados = "Titular: "+this.cliente.getTitular();
		dados+= "\nNúmero: "+this.numero;
		dados+= "\nAgencia: "+this.agencia;
		dados+="\nSaldo: "+this.saldo;
		dados+="\nData de abertura: ";
		dados+=this.dataDeAbertura.formatada();
		
		return dados;
	}
}