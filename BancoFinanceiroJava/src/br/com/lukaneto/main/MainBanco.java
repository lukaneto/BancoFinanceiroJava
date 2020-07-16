package br.com.lukaneto.main;

import br.com.lukaneto.clientes.ClientesDoBanco;
import br.com.lukaneto.contas.Conta;
import br.com.lukaneto.data.Data;
import br.com.lukaneto.funcionarios.GerenteBanco;

public class MainBanco {

	public static void main(String[] args) {
		
		int senha = 1232;
		GerenteBanco gerente = new GerenteBanco();
		gerente.setNomeDoFuncionario("Mateus Carvalho");
		gerente.setSenhaDoGerente(senha);
		gerente.setSalarioDoFuncionario(5000);
		System.out.println(gerente.getNomeDoFuncionario());
		System.out.println(gerente.getSenhaDoGerente());
		System.out.println(gerente.getBonificacao());
		gerente.autentica(1232);
		
		
		Conta c1 = new Conta();
		c1.dataDeAbertura = new Data();
		c1.cliente = new ClientesDoBanco();
		c1.cliente.setTitular("Luiz Carlos");
		c1.setNumero(4827);
		c1.setAgencia("4443-9");
		c1.setSaldo(4000);
		
		c1.dataDeAbertura.setDia("20");
		c1.dataDeAbertura.setMes("07");
		c1.dataDeAbertura.setAno("2018");
		
		c1.saca(1500);
		
		System.out.println(c1.recuperaDadosImpressao());
	}
}