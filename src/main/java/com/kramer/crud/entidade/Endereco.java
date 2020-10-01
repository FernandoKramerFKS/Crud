package com.kramer.crud.entidade;

import com.kramer.crud.utilidade.ViaCep;

public class Endereco {

	private Integer id;
	private String pais;
	private String iso;
	private String estado;
	private String uf;
	private String cidade;
	private String bairro;
	private String rua;
	private Integer numero;
	private String complemento;
	private String observacao;
	private String cep;

	public Endereco() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getIso() {
		return iso;
	}

	public void setIso(String iso) {
		this.iso = iso;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Endereco buscarCep(Endereco ende) {
		Endereco end = ViaCep.buscarCep(ende.getCep());
		end.setNumero(ende.getNumero());
		end.setComplemento(ende.getComplemento());
		end.setObservacao(ende.getObservacao());
		return end;

	}

}
