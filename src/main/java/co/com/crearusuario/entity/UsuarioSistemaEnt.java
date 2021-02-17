package co.com.crearusuario.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UsuarioSistemaEnt implements Serializable {


	private static final long serialVersionUID = 1L;
	@Id
	private String idUsuarioSistema;
	private String idRolFK;
	private String idPersonaFK;
	private Date fechaIni;
	private Date fechaFin;
	private String observacion;
	private int estado;
	
	public String getIdUsuarioSistema() {
		return idUsuarioSistema;
	}
	public void setIdUsuarioSistema(String idUsuarioSistema) {
		this.idUsuarioSistema = idUsuarioSistema;
	}
	public String getIdRolFK() {
		return idRolFK;
	}
	public void setIdRolFK(String idRolFK) {
		this.idRolFK = idRolFK;
	}
	public String getIdPersonaFK() {
		return idPersonaFK;
	}
	public void setIdPersonaFK(String idPersonaFK) {
		this.idPersonaFK = idPersonaFK;
	}
	public Date getFechaIni() {
		return fechaIni;
	}
	public void setFechaIni(Date fechaIni) {
		this.fechaIni = fechaIni;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
}
