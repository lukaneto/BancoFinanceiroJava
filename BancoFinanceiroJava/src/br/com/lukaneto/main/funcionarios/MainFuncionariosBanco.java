package br.com.lukaneto.main.funcionarios;

import br.com.lukaneto.funcionarios.GerenteBanco;

public class MainFuncionariosBanco {

	public static void main(String[] args) {
		int senha = 1232;
		GerenteBanco gerente = new GerenteBanco();
		gerente.setNomeDoFuncionario("Mateus Carvalho");
		gerente.setSenhaDoGerente(senha);
		System.out.println(gerente.getNomeDoFuncionario());
		System.out.println(gerente.getSenhaDoGerente());
		gerente.autentica(2222);
	}

}
