package co.com.crearusuario.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="correo")
public class CorreoEnt implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String idPersona;
	private String descripcion;
	private String correo;
	public CorreoEnt() {
		
	}
	
	public CorreoEnt(String id, String idPersona, String descripcion, String correo) {
		super();
		this.id = id;
		this.idPersona = idPersona;
		this.descripcion = descripcion;
		this.correo = correo;
	}

	public String getId() {
		return id;
	}
	public String getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(String idPersona) {
		this.idPersona = idPersona;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
}
