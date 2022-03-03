package com.ibm.apicine.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name = "idiomas", schema = "cinema")
public class Idioma implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "idioma")
	private String nombreIdioma;
	@Column(name = "usuario_creacion", nullable = false)
	private String usuarioCreacion;
	@Column(name = "fecha_creacion")
	private Date fechaCreacion;
	@Column(name = "fecha_modificacion")
	private Date fechaModificacion;
	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(
			name = "idioma_pelicula",schema = "cinema",
			joinColumns = @JoinColumn(name="idioma_id"),
			inverseJoinColumns = @JoinColumn(name="pelicula_id")
			)
	private Set<Pelicula> peliculas;
	public Idioma() {
		
	}
	
	public Idioma(Long id, String nombreIdioma, String usuarioCreacion) {
		
		this.id = id;
		this.nombreIdioma = nombreIdioma;
		this.usuarioCreacion = usuarioCreacion;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombreIdioma() {
		return nombreIdioma;
	}
	public void setNombreIdioma(String nombreIdioma) {
		this.nombreIdioma = nombreIdioma;
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
	
	
	
	public Set<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(Set<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}

	@PrePersist
	public void antesPersistir() {
		this.fechaCreacion= new Date();
	}
	@PreUpdate
	public void despuesPersistir() {
		this.fechaModificacion= new Date();
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Idioma [id=");
		builder.append(id);
		builder.append(", nombreIdioma=");
		builder.append(nombreIdioma);
		builder.append(", usuarioCreacion=");
		builder.append(usuarioCreacion);
		builder.append(", fechaCreacion=");
		builder.append(fechaCreacion);
		builder.append(", fechaModificacion=");
		builder.append(fechaModificacion);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, nombreIdioma);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Idioma other = (Idioma) obj;
		return Objects.equals(id, other.id) && Objects.equals(nombreIdioma, other.nombreIdioma);
	}
	
	
	

}
