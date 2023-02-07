package com.badas.badasfood.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.badas.badasfood.di.notificacao.NivelUrgencia;
import com.badas.badasfood.di.notificacao.Notificador;
import com.badas.badasfood.di.notificacao.TipoDoNotificador;
import com.badas.badasfood.di.service.ClienteAtivadoEvent;

@Component
public class NotificacaoService {
	
	@TipoDoNotificador(NivelUrgencia.BAIXA_PRIORIDADE)
	@Autowired
	private Notificador notificador;

	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		notificador.notificar(event.getCliente(), "Seu cadastro no sistema está ativo !");
	}
	
}
