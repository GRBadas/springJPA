package com.badas.badasfood.di.notificacao;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import com.badas.badasfood.di.modelo.Cliente;

@Profile("dev")
@TipoDoNotificador(NivelUrgencia.BAIXA_PRIORIDADE)
@Component
public class NotificadorEmailMock implements Notificador {
	
	public NotificadorEmailMock() {
		System.out.println("NotificadorEmail REAL");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("MOCK :Notificando %s através do email %ss: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
	}
	
}
