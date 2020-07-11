package br.com.lukaneto.clientes;

public class EnderecoDoClienteBanco {
	private String logradouro;
	private String bairro;
	private String numero;
	private String complemento;
	
	public String getLogradouro(String logradouro){
		return this.logradouro;
	}
	
	public void setLogradouro(String logradouro){
		this.logradouro = logradouro;
	}
	
	public String getBairro(){
		return this.bairro;
	}
	
	public void setBairro(String bairro){
		this.bairro = bairro;
	}
	
	public String getNumero(){
		return this.numero;
	}
	
	public void setNumero(String numero){
		this.numero = numero;
	}
	
	public String getComplemento(){
		return this.complemento;
	}
	
	public void setComplemento(String complemento){
		this.complemento = complemento;
	}
}
