package uia.com.contabilidad.cuentas;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import uia.com.contabilidad.cheques.Cheque;
import uia.com.contabilidad.cheques.NotaDebito;
import uia.com.contabilidad.clientes.InfoUIA;
import uia.com.contabilidad.clientes.ListaInfoUIA;

public class Cuenta extends InfoUIA
{
		String fecha = "";
		
		@JsonCreator
	    public Cuenta(@JsonProperty("id")int id, @JsonProperty("name")String name, @JsonProperty("fecha")String p1) 
		{
	        super(id, name);
	        this.fecha = p1;
	    }

		public String getFecha() {
			return fecha;
		}

		public void setFecha(String fecha) {
			this.fecha = fecha;
		}	
		
		

		public void validaCobranza()
		{
			
		}

		public AsientoDeudor agregaAsientoDeudor(String nomCheque) {

			List<InfoUIA> lista = null;
			
			if(this.getAsientos() == null)
			{
				lista = new ArrayList<InfoUIA>();
				 this.asientos = lista;
			}
			
			int miId = this.getAsientos().size()+1;

			AsientoDeudor miAsientoDeudor = new AsientoDeudor(miId, nomCheque, "cobrarEfectivo", "20-11-2020");
			
			this.getAsientos().add(miAsientoDeudor);

			return miAsientoDeudor;
		}
}