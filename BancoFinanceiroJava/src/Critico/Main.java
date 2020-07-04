package Critico;

public class Main {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		Conta c2 = new Conta();	
		c1.dataDeAbertura = new Data();
		c2.dataDeAbertura = new Data();
		
		c1.titular = "Luiz Carlos";
		c1.numero = 1234;
		c1.agencia="4827-9";
		c1.saldo = 400;
		
		c1.dataDeAbertura.dia = "04";
		c1.dataDeAbertura.mes = "06";
		c1.dataDeAbertura.ano = "1994";
		
		c1.deposita(5000);
		c1.saca(1500);
		
		
		
		
		System.out.println(c1.recuperaDadosImpressao());
		
		System.out.println(c2.dataDeAbertura.formatada());
	}

}
