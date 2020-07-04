package Critico;

public class Conta {
	String titular;
	int numero;
	String agencia;
	double saldo;
	String data;
	
	boolean saca(double valor){
		
		if(valor <= this.saldo){
			
			this.saldo-=valor;
			return true;
		}else{
			return false;
		}
	}
	
	boolean deposita(double valor){
		if(valor > 0){
			this.saldo+=valor;
			return true;
		}
		return false;
	} 
	
	boolean transfere(Conta contaBanco, double valor){
		if(this.saca(valor)){
			
			return contaBanco.deposita(valor);
		}else {
			return false;
		}
	}
}