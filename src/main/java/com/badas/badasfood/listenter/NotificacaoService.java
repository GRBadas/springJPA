package com.badas.badasfood.listenter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.badas.badasfood.di.notificacao.NivelUrgencia;
import com.badas.badasfood.di.notificacao.Notificador;
import com.badas.badasfood.di.notificacao.TipoDoNotificador;
import com.badas.badasfood.di.service.ClienteAtivadoEvent;

@Component
public class NotificacaoService {
	
	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
	@Autowired
	private Notificador notificador;
	
	@EventListener
	@Order(1)
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		notificador.notificar(event.getCliente(), "Seu cadastro agora está ativo");

	}
}