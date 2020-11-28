package uia.com.contabilidad.cuentas;

import java.text.SimpleDateFormat;
import java.util.Date;

import uia.com.contabilidad.cheques.Cheque;
import uia.com.contabilidad.cheques.GestorCheques;
import uia.com.contabilidad.clientes.Cliente;

public class GestorCuentas {
	
	private GestorCheques miGestorCheques = new GestorCheques();
	private Cuenta miCCheques;
	private Cliente miCliente;
	
	public void GestorCuentas()
	{}
	
	public void validaCobranza(Cliente cliente)
	{
		miCliente = cliente;
		//miCliente.validaCobranza();		
	}
	
	public void agregaRegistroChequeDevuelto(Cliente cliente ) {
		
		Date fecha = new Date();
		 System.out.println(fecha);
		
		 String nombre; 
		 String bancogirado;
		 int importe; 
		 
		 System.out.println("Nombre:" + "banco girado: " + "importe:");
	}
	
	public void agregaResgistroEspecial( String chequeDevuelto) {
		
		
		Date fecha = new Date();
		 System.out.println(fecha);
		
		 String nombreEmisor; 
		 String bancogirado2;
		 int importecheque; 
		 
		 
		 System.out.println("Nombre del emisor :" + "banco girado: " + "importe:");
		
	}

	public void registraCheque(Cliente cliente, String nomCuentaCheques, String nomCheque) 
	{

		this.miCliente = cliente;
		if(this.miGestorCheques != null && miCliente != null)
		{
			for(int i = 0; i < this.miCliente.getItems().size(); i++)
			{
			    miCCheques = (Cuenta) this.miCliente.getItems().get(i);
			    if(miCCheques.getName().contains(nomCuentaCheques.toString()))
			    	break;
			}
			
			if(miCCheques != null)
				if((miGestorCheques.registraCheque(miCCheques,  nomCuentaCheques, nomCheque).getEstado().contentEquals("devuelto")))
						miGestorCheques.realizaAsientoDeudor(miCCheques,  nomCuentaCheques, nomCheque);
			else
				System.out.println("Error: Cuenta de cheques no encontrada");
		}
	}
	 
	public Object chequeDevuelto() {
		Object chequeDevuelto = null;
		return chequeDevuelto;
	}
	

}
