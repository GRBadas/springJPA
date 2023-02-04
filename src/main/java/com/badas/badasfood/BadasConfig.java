package com.badas.badasfood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.badas.badasfood.di.notificacao.NotificadorEmail;
import com.badas.badasfood.di.service.AtivacaoClienteService;

@Configuration
public class BadasConfig {
	
	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail("smtp.badasmail.com.br");
		notificador.setCaixaAlta(true);
		
		return notificador;
	}
	@Bean
	public AtivacaoClienteService ativacaoClienteService() {
		return new AtivacaoClienteService(notificadorEmail());
	}

}
