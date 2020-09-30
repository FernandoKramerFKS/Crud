package com.kramer.crud;

import com.kramer.crud.dao.Conexao;
import com.kramer.crud.entities.Endereco;
import com.kramer.crud.entities.Pessoa;
import com.kramer.crud.utilidades.ViaCep;

public class Teste {

	public static void main(String[] args) throws ClassNotFoundException {
		
		
		new Conexao().conectar();
		new Conexao().desconectar();
		
		
		
		String cep = "85.814-155";
		
		
		Pessoa p = new Pessoa();
		
		p.setEndereco(ViaCep.buscarCep(cep));
		
		System.out.println(p.getEndereco().getPais());
		System.out.println(p.getEndereco().getCidade());
		System.out.println("___________________");
		
		
		Endereco e = ViaCep.buscarCep(cep);
		
		System.out.println(e.getPais());
		System.out.println(e.getIso());
		System.out.println(e.getEstado());
		System.out.println(e.getUf());
		System.out.println(e.getCidade());
		System.out.println(e.getBairro());
		System.out.println(e.getRua());
		System.out.println(e.getCep());
		System.out.println(e.getNumero());
		System.out.println(e.getComplemento());
		System.out.println(e.getObservacao());
		
		e.setNumero(186);
		e.setComplemento("Casa");
		e.setObservacao("Próximo ao viaduto");
		
		System.out.println("_____________________");
		System.out.println(e.getPais());
		System.out.println(e.getIso());
		System.out.println(e.getEstado());
		System.out.println(e.getUf());
		System.out.println(e.getCidade());
		System.out.println(e.getBairro());
		System.out.println(e.getRua());
		System.out.println(e.getCep());
		System.out.println(e.getNumero());
		System.out.println(e.getComplemento());
		System.out.println(e.getObservacao());

	}
	

}
