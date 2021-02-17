package co.com.crearusuario.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DireccionEnt implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String idPersona;
	private String descripcion;
	private String direccion;
	public DireccionEnt() {
		
	}
	
	public DireccionEnt(String id, String idPersona, String descripcion, String direccion) {
		super();
		this.id = id;
		this.idPersona = idPersona;
		this.descripcion = descripcion;
		this.direccion = direccion;
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
