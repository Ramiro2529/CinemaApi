package com.ibm.apicine.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "peliculas", schema = "cinema")
public class Pelicula implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "titulo", unique = true)
	private String titulo;
	@Column(name = "duracion")
	private String duracion;
	@Column(name = "clasificacion")
	private String clasificacion;
	@Column(name = "usuario_creacion", nullable = false)
	private String usuarioCreacion;
	@Column(name = "fecha_creacion")
	private Date fechaCreacion;
	@Column(name = "fecha_modificacion")
	private Date fechaModificacion;
	@OneToMany(mappedBy = "pelicula", fetch = FetchType.LAZY)
	@JsonIgnoreProperties({"peliculas"})
	private Set<Funcion> funciones;
	@ManyToMany(mappedBy = "peliculas", fetch = FetchType.LAZY)
	private Set<Idioma> idiomas;
	@ManyToMany(mappedBy = "peliculas", fetch = FetchType.LAZY)
	private Set<Actor> actores;
	@JsonIgnoreProperties({"peliculas"})
	@OneToMany(mappedBy = "pelicula", fetch = FetchType.LAZY)
	private Set<Director> directores;
	 
	public Pelicula () {
		
	}
	
	public Pelicula(Long id, String titulo, String duracion, String clasificacion, String usuarioCreacion) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.duracion = duracion;
		this.clasificacion = clasificacion;
		this.usuarioCreacion = usuarioCreacion;
		
		
	}
	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public String getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
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
	public Set<Funcion> getFunciones() {
		return funciones;
	}
	public void setFunciones(Set<Funcion> funciones) {
		this.funciones = funciones;
	}
	public Set<Idioma> getIdiomas() {
		return idiomas;
	}
	public void setIdiomas(Set<Idioma> idiomas) {
		this.idiomas = idiomas;
	}
	public Set<Actor> getActores() {
		return actores;
	}
	public void setActores(Set<Actor> actores) {
		this.actores = actores;
	}
	public Set<Director> getDirectores() {
		return directores;
	}
	public void setDirectores(Set<Director> directores) {
		this.directores = directores;
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
