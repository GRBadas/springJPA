package com.badas.badasfood.listenter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.badas.badasfood.di.notificacao.NivelUrgencia;
import com.badas.badasfood.di.notificacao.Notificador;
import com.badas.badasfood.di.notificacao.TipoDoNotificador;
import com.badas.badasfood.di.service.ClienteAtivadoEvent;

@Component
public class NotificacaoService {
	
	@Autowired
	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
	private Notificador notificador;
	
	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		System.out.println("Cliente " + event.getCliente().getNome() + " agora está ativo.");
	}

}
