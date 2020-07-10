package br.com.lukaneto.clientes;

public class Clientes {
	private String nome;
	private int idade;
	public EnderecoDoCliente endereco;
	
	
	public String getTitular(){
		return this.nome;
	}
	
	public void setTitular(String nome){
		this.nome = nome;
	}
	
	public int getIdade(){
		return this.idade;
	}
	
	public void setIdade(int idade){
		this.idade = idade;
	}
	
	
	
}
