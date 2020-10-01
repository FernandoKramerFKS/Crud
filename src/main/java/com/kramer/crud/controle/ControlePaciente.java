package com.kramer.crud.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kramer.crud.entidade.Contato;
import com.kramer.crud.entidade.Endereco;
import com.kramer.crud.entidade.Paciente;
import com.kramer.crud.repositorio.CadastroPacienteDao;

@Controller
public class ControlePaciente {

	@RequestMapping("/")
	public String form() {
		return "cadastroPaciente";
	}
	
	@RequestMapping(value="/", method = RequestMethod.POST)
	public String form(Paciente p, Endereco e, Contato c) {
		Paciente ps = p;
		ps.setEndereco(e.buscarCep(e));
		ps.setContato(c);
		new CadastroPacienteDao().salvar(ps);
		return "cadastroPaciente";
		
	}
}
