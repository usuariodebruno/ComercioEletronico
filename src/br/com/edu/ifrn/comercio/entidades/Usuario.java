package br.com.edu.ifrn.comercio.entidades;

import br.com.edu.ifrn.comercio.Interface.IUsuario;

public class Usuario implements IUsuario {
	private static final int SEQUENCIAL = 0;
	private int IdUsuario = SEQUENCIAL;
	private String nomeUsuario;
	private String senhaUsuario;
	private String emailUsuario;
	
	@Override
	public void cadastraUsuario() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeUsuario() {
		// TODO Auto-generated method stub
		
	}
	public int getIdUsuario() {
		return IdUsuario;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getSenhaUsuario() {
		return senhaUsuario;
	}
	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}
	public String getEmailUsuario() {
		return emailUsuario;
	}
	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}
	
	
	
}
