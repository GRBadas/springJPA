package com.badas.badasfood.di.service;

import org.springframework.stereotype.Component;

import com.badas.badasfood.di.modelo.Cliente;
import com.badas.badasfood.di.notificacao.Notificador;

public class AtivacaoClienteService {
	
	private Notificador notificador;
	
	
	
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
		
		System.out.println("AivaçãoClienteService" + notificador);
	}



	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
	
	

}
