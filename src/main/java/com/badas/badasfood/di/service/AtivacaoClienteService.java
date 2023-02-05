package com.badas.badasfood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.badas.badasfood.di.modelo.Cliente;
import com.badas.badasfood.di.notificacao.Notificador;

@Component
public class AtivacaoClienteService {
	
	@Qualifier("email")
	@Autowired
	private Notificador notificador;

	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}

}
