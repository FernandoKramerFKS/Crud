package com.kramer.crud;

import com.kramer.crud.entidade.Endereco;

public class TesteEndereco {

	public static void main(String[] args) {
		
		Endereco end = new Endereco();
		end.setCep("85.814-155");
		end.setNumero(186);
		end.setComplemento("Casa");
		end.setObservacao("Próximo ao viaduto");
		
		Endereco e = end.buscarCep(end);
		System.out.println(e.getPais());
		System.out.println(e.getIso());
		System.out.println(e.getEstado());
		System.out.println(e.getUf());
		System.out.println(e.getCidade());
		System.out.println(e.getBairro());
		System.out.println(e.getRua());
		System.out.println(e.getNumero());
		System.out.println(e.getComplemento());
		System.out.println(e.getObservacao());

	}

}
