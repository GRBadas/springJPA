package com.badas.badasfood.di.notificacao;



import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.badas.badasfood.di.modelo.Cliente;

@Component
public class NotificadorSMS implements Notificador {
	
	@Qualifier("SMS")
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s por SMS através do telefone %s: %s\n", cliente.getNome(), cliente.getTelefone(), mensagem);
	}
	
}
