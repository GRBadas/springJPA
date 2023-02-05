package com.badas.badasfood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.badas.badasfood.di.modelo.Cliente;
import com.badas.badasfood.di.service.AtivacaoClienteService;

@Controller
public class MeuPrimeiroController {
	
	private AtivacaoClienteService ativacaoClienteService;
	
	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
	}



	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		Cliente badas = new Cliente("Badas", "badas@mail.com", "99999-9999");
				ativacaoClienteService.ativar(badas);
		return "Olá hahaha!";
	}

}
