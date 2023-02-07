package com.badas.badasfood.di.notificacao;

import org.springframework.stereotype.Component;
import com.badas.badasfood.di.modelo.Cliente;

@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorEmail implements Notificador {
	
	public NotificadorEmail() {
		System.out.println("NotificadorEmail REAL");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do email %ss: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
	}
	
}
