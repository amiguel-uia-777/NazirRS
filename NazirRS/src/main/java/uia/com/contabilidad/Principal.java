package uia.com.contabilidad;

import uia.com.contabilidad.clientes.GestorClientes;

public class Principal {

	private static final String Periodo = null;

	public static void main(String[] args) {
		
		
		System.out.println("Hola UIA, Hola UIA");
		
		GestorClientes miGestorClientes = new GestorClientes();
		
		agregaRegistroChequeDevuelto();
		
		miGestorClientes.registraCheque("NazirRS", "Cheques", "ClienteX");
		
		
	}

	private static void agregaRegistroChequeDevuelto() {
		// TODO Auto-generated method stub
		
		String nombreCliente; 
		String banco;
		int importe; 
		int numeroregistro;
		
		System.out.println("Registro Cheque Devuelto Cliente :" + "Nombre Cliente: " + "Banco: " + "importe:" + " numero registro:");
		
		
	}

	public Object registroAgregado(String nuevoRegistroEspecialCheque, Object registroAgregado) {
		return registroAgregado;
	}
}
