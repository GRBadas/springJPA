package com.badas.badasfood.di.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.badas.badasfood.di.modelo.Cliente;

@Component
public class AtivacaoClienteService {
	
	@Autowired
	private ApplicationEventPublisher eventPublisher;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
 // dizer ao container que o cliente está ativo
		eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));

	}
}
