package com.ibm.apicine.entidades;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Direccion implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String calle;
	private String numero;
	private String codigoPostal;
	private String departamento;
	private String piso;
	private String localidad;
	
	public Direccion() {
		
	}
	public Direccion(String calle, String numero, String codigoPostal, String departamento, String piso,
			String localidad) {
		this.calle = calle;
		this.numero = numero;
		this.codigoPostal = codigoPostal;
		this.departamento = departamento;
		this.piso = piso;
		this.localidad = localidad;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getPiso() {
		return piso;
	}
	public void setPiso(String piso) {
		this.piso = piso;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Direccion [calle=");
		builder.append(calle);
		builder.append(", numero=");
		builder.append(numero);
		builder.append(", codigoPostal=");
		builder.append(codigoPostal);
		builder.append(", departamento=");
		builder.append(departamento);
		builder.append(", piso=");
		builder.append(piso);
		builder.append(", localidad=");
		builder.append(localidad);
		builder.append("]");
		return builder.toString();
	}
	
	

}
