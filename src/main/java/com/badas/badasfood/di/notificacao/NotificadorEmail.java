package com.badas.badasfood.di.notificacao;



import com.badas.badasfood.di.modelo.Cliente;


public class NotificadorEmail implements Notificador {
	
	private boolean caixaAlta;
	private String hostServidorSMTP;
	
	public NotificadorEmail(String hostServidorSMTP) {
		this.hostServidorSMTP = hostServidorSMTP;
		System.out.println("Construtor chamado");
	}

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		if(this.caixaAlta) {
			mensagem = mensagem.toUpperCase();
		}
		System.out.printf("Notificando %s através do email %s usando SMTP %s: %s\n", cliente.getNome(), cliente.getEmail(), this.hostServidorSMTP, mensagem);
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
	
	
	
}
