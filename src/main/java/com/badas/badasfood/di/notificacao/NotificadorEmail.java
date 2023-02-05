package com.badas.badasfood.di.notificacao;



import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.badas.badasfood.di.modelo.Cliente;

@Qualifier("email")
@Component
public class NotificadorEmail implements Notificador {
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do email %ss: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
	}
	
}
