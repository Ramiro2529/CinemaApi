package com.ibm.apicine.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name = "personas",schema = "cinema")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Persona implements Serializable{


	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido")
	private String apellido;
	@Column(name = "edad")
	private String edad;
	@Column(name = "genero")
	private Character genero;
	@Column(name = "usuario_creacion", nullable = false)
	private String usuarioCreacion;
	@Column(name = "fecha_creacion")
	private Date fechaCreacion;
	@Column(name = "fecha_modificacion")
	private Date fechaModificacion;
	
	public Persona() {
		
	}
	public Persona(Long id, String nombre, String apellido, String edad, Character genero, String usuarioCreacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.genero = genero;
		this.usuarioCreacion=usuarioCreacion;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public Character getGenero() {
		return genero;
	}
	public void setGenero(Character genero) {
		this.genero = genero;
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
		builder.append("Persona [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellido=");
		builder.append(apellido);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", genero=");
		builder.append(genero);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(id, other.id);
	}
	@PrePersist
	public void antesPersistir() {
		this.fechaCreacion= new Date();
	}
	@PreUpdate
	public void despuesPersistir() {
		this.fechaModificacion= new Date();
	}
	

}
