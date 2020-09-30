package com.kramer.crud.controles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kramer.crud.dao.CadastroPessoaFisicaDao;
import com.kramer.crud.entities.Endereco;
import com.kramer.crud.entities.PessoaFisica;
import com.kramer.crud.utilidades.ViaCep;

@Controller
public class ControlePessoa {
	
	@RequestMapping("/")
	public String form() {
		return "CadastroPessoaFisica";
	}
	
	@RequestMapping(value="/", method = RequestMethod.POST)
	public String forma(PessoaFisica pf, Endereco en) {
		PessoaFisica pfs = pf;
		pfs.setEndereco(ViaCep.buscarCep(en.getCep()));
		new CadastroPessoaFisicaDao().salvar(pfs);
		return "CadastroPessoaFisica";
		
	}

}
