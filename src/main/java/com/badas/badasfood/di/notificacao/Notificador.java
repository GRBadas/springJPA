package com.badas.badasfood.di.notificacao;

import com.badas.badasfood.di.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}