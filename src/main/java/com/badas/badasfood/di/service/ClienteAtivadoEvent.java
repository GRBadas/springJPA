package com.badas.badasfood.di.service;

import com.badas.badasfood.di.modelo.Cliente;

public class ClienteAtivadoEvent {

	private Cliente cliente;

	public ClienteAtivadoEvent(Cliente cliente) {
		
	}

	public Cliente getCliente() {
		return cliente;
	}
	
}
