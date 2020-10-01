package com.kramer.crud.repositorio;

import com.kramer.crud.Dao.Conexao;
import com.kramer.crud.entidade.Paciente;

public class CadastroPacienteDao extends Conexao{
	
	private static final String SALVAR = "CALL NOVO_CADASTRO(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	public void salvar(Paciente p) {
		conectar();
		try {			
			stmt = con.prepareStatement(SALVAR);
			stmt.setString(1, p.getNome());
			stmt.setDate(2, p.getDataNascimento());
			stmt.setString(3, p.getSexo());
			stmt.setString(4, p.getCpf());
			stmt.setString(5, p.getRg());
			stmt.setString(6, p.getContato().getEmail());
			stmt.setString(7, p.getContato().getTelefone());
			stmt.setString(8, p.getContato().getTipo());
			stmt.setString(9, p.getEndereco().getPais());
			stmt.setString(10, p.getEndereco().getIso());
			stmt.setString(11, p.getEndereco().getEstado());
			stmt.setString(12, p.getEndereco().getUf());
			stmt.setString(13, p.getEndereco().getCidade());
			stmt.setString(14, p.getEndereco().getBairro());
			stmt.setString(15, p.getEndereco().getRua());
			stmt.setInt(16, p.getEndereco().getNumero());
			stmt.setString(17, p.getEndereco().getComplemento());
			stmt.setString(18, p.getEndereco().getObservacao());
			stmt.execute();			
		} catch (Exception e) {
			System.out.println(e);
		}
		desconectar();
		
	}

}
