package br.com.lukaneto.funcionarios;

public class GerenteBanco extends FuncionariosDoBanco {
	
	private int senhaDoGerente;
	private int numeroDeFuncionariosGerenciados;
	
	public int getSenhaDoGerente() {
		return senhaDoGerente;
	}
	public void setSenhaDoGerente(int senhaDoGerente) {
		this.senhaDoGerente = senhaDoGerente;
	}
	
	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}
	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}
	
	public boolean autentica(int senha){
		if(this.senhaDoGerente == senha){
			System.out.println("Acesso permitido");
			return true;
		}else{
			System.out.println("Acesso negato");
			return false;
		}
	}
	
}
