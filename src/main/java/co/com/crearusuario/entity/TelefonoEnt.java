package co.com.crearusuario.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="telefono")
public class TelefonoEnt {

	private String id;
	private String idPersona;
	private String descripcion;
	private String numero;
	
	public TelefonoEnt() {
		
	}
	
	public TelefonoEnt(String id, String idPersona, String descripcion, String numero) {
		super();
		this.id = id;
		this.idPersona = idPersona;
		this.descripcion = descripcion;
		this.numero = numero;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(String idPersona) {
		this.idPersona = idPersona;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
}
