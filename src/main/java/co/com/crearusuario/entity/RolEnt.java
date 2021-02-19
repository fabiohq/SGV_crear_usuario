package co.com.crearusuario.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="rol")
public class RolEnt implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String descripcion;
	private String rol;
	
	
	public RolEnt() {

	}
	
	public RolEnt(String id, String descripcion, String rol) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.rol = rol;
	}

	public String getId() {
		return id;
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
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
}
