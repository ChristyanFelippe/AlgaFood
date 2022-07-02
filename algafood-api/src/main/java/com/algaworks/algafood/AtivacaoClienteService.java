package com.algaworks.algafood;

import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {
	private Notificador notificador;
	
	public AtivacaoClienteService(Notificador notificador) {
	this.notificador = notificador;
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		notificador.notificar(cliente, "Seu cadastro está ativo");
	}

}
