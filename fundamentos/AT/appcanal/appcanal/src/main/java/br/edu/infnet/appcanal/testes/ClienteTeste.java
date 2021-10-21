package br.edu.infnet.appcanal.testes;

import br.edu.infnet.appcanal.domain.Cliente;

public class ClienteTeste {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Marcelo", true, 1);
		System.out.println(cliente);
	}
}
