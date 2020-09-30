package com.kramer.crud.entities;

public class PessoaFisica extends Pessoa {

	private String sexo;
	private String cpf;
	private String rg;
	
	public PessoaFisica() {

	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	
	
	
}
