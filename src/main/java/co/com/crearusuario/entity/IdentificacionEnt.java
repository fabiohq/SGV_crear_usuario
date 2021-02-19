package co.com.crearusuario.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="identificacion")
public class IdentificacionEnt implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String idPersona;
	private String descripcion;
	private String numero;
	
	public IdentificacionEnt() {
		
	}
		
	public IdentificacionEnt(String id, String idPersona, String descripcion, String numero) {
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
