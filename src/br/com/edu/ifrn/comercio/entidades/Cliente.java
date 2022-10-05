package br.com.edu.ifrn.comercio.entidades;

import br.com.edu.ifrn.comercio.Interface.ICliente;

public class Cliente extends Usuario implements ICliente {
	private String nomeCliente;
	private String enderecoCliente;
	private String cpfCliente;
	
	@Override
	public void cadastrarCliente() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void visualizarCliente() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void altereCliente() {
		// TODO Auto-generated method stub
		
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getEnderecoCliente() {
		return enderecoCliente;
	}
	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}
	public String getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	
	
	
	
}
