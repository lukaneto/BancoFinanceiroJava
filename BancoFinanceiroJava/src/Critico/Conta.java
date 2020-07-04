package Critico;

public class Conta {
	String titular;
	int numero;
	String agencia;
	double saldo;
	Data dataDeAbertura;
	
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
	
	double calculaRendimento(){
		return this.saldo*0.1;
	}
	
	String recuperaDadosImpressao(){
		String dados = "Titular: "+this.titular;
		dados+= "\nNúmero: "+this.numero;
		dados+= "\nAgencia: "+this.agencia;
		dados+="\nSaldo: "+this.saldo;
		dados+="\nData de abertura ";
		dados+=this.dataDeAbertura.formatada();
		
		return dados;
	}
}