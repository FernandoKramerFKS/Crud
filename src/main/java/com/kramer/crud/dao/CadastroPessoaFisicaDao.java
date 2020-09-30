package com.kramer.crud.dao;

import com.kramer.crud.entities.PessoaFisica;

public class CadastroPessoaFisicaDao extends Conexao{
	
	private static final String SALVAR = "CALL NOVO_CADASTRO(?,'1991-05-24','m',?,?,'ajdasjdjsd',"
			+ "'15151515','cel',?,?,?,?,?,?,?,186,'jjjj','jhhj')";
	
	
	public void salvar(PessoaFisica pf) {
		conectar();
		try {
			System.out.println("to aqui ");
			stmt = con.prepareStatement(SALVAR);
			stmt.setString(1, pf.getNome());
			stmt.setString(2, pf.getCpf());
			stmt.setString(3, pf.getRg());
			stmt.setString(4, pf.getEndereco().getPais());
			stmt.setString(5, pf.getEndereco().getIso());
			stmt.setString(6, pf.getEndereco().getEstado());
			stmt.setString(7, pf.getEndereco().getUf());
			stmt.setString(8, pf.getEndereco().getCidade());
			stmt.setString(9, pf.getEndereco().getBairro());
			stmt.setString(10, pf.getEndereco().getRua());
			stmt.execute();
			System.out.println("vim até aqui ");
	
		} catch (Exception e) {
			System.out.println(e);
		}
		

		desconectar();
	}

}
