package com.ibm.apicine.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
@Table(name = "funciones", schema = "cinema")
public class Funcion implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "hora")
	private String hora;
	@JsonFormat(pattern = "yyyy-MM-dd", shape = Shape.STRING)
	@Column(name = "dia")
	private String dia;
	@Column(name = "usuario_creacion", nullable = false)
	private String usuarioCreacion;
	@Column(name = "fecha_creacion")
	private Date fechaCreacion;
	@Column(name = "fecha_modificacion")
	private Date fechaModificacion;
	@ManyToOne(optional = true, cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinColumn(name = "pelicula_id", foreignKey = @ForeignKey(name="FK_PELICULA_ID"))
	private Pelicula pelicula;
	
	public Funcion() {
		
	}
	
	
	public Funcion(Long id, String hora, String dia, String usuarioCreacion) {
		super();
		this.id = id;
		this.hora = hora;
		this.dia = dia;
		this.usuarioCreacion = usuarioCreacion;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public Pelicula getPelicula() {
		return pelicula;
	}
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}
	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Funcion [id=");
		builder.append(id);
		builder.append(", hora=");
		builder.append(hora);
		builder.append(", dia=");
		builder.append(dia);
		builder.append(", usuarioCreacion=");
		builder.append(usuarioCreacion);
		builder.append(", fechaCreacion=");
		builder.append(fechaCreacion);
		builder.append(", fechaModificacion=");
		builder.append(fechaModificacion);
		builder.append(", pelicula=");
		builder.append(pelicula);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
