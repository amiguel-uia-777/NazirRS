package uia.com.contabilidad;

import uia.com.contabilidad.clientes.GestorClientes;

public class Principal {

	public static void main(String[] args) {
		
		
		System.out.println("Hola UIA");
		
		GestorClientes miGestorClientes = new GestorClientes();
		
		miGestorClientes.registraCheque("NazirRS", "Cheques", "ClienteX");
		
		
	}

}
