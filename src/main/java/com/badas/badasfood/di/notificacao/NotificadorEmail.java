package com.badas.badasfood.di.notificacao;

import org.springframework.stereotype.Component;

import com.badas.badasfood.di.modelo.Cliente;

@Component
public class NotificadorEmail implements Notificador {
	
	public NotificadorEmail() {
		System.out.println("Construtor chamado");
	}

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do email %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
	}
	
	
	
}
