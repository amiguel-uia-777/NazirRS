package uia.com.contabilidad.clientes;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

import uia.com.contabilidad.cheques.Cheque;
import uia.com.contabilidad.cheques.NotaDebito;
import uia.com.contabilidad.clientes.Cliente;
import uia.com.contabilidad.cuentas.AsientoDeudor;
import uia.com.contabilidad.cuentas.Cuenta;


@JsonTypeInfo(
	    use = JsonTypeInfo.Id.NAME,
	    include = JsonTypeInfo.As.PROPERTY,
	    property = "type")
	@JsonSubTypes({
	    @Type(value = Cliente.class, name = "cliente"),
	    @Type(value = Cuenta.class, name = "cuenta"),
	    @Type(value = Cheque.class, name = "cheque"),
	    @Type(value = NotaDebito.class, name = "notadebito"),
	    @Type(value = AsientoDeudor.class, name = "asientodeudor"),
	    })

public abstract class InfoUIA {

	private int id;
	private String name;
	private String estado;

	protected List<InfoUIA> items;
	protected List<InfoUIA> asientos;
	
	
	
	
	public List<InfoUIA> getAsientos() {
		return asientos;
	}

	public void setAsientos(List<InfoUIA> asientos) {
		this.asientos = asientos;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	
	public InfoUIA(int id, String name)
	{
		this.id=id;
		this.name = name;
	}
	
	public InfoUIA() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<InfoUIA> getItems() {
		return items;
	}

	public void setItems(List<InfoUIA> items) {
		this.items =  items;
	}

	protected void validaCobranza()
	{
		this.getItems().forEach(t->
			{
				t.validaCobranza();
			}
			);
	}
	
}
