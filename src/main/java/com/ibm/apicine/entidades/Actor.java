package com.ibm.apicine.entidades;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "actores", schema = "cinema")
@PrimaryKeyJoinColumn(name = "persona_id")
public class Actor extends Persona{

	private static final long serialVersionUID = 1L;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(
			name = "actor_pelicula",schema = "cinema",
			joinColumns = @JoinColumn(name="actor_id"),
			inverseJoinColumns = @JoinColumn(name="pelicula_id")
			)
	private Set<Pelicula> peliculas;

	public Actor() {
		
	}

	public Actor(Long id, String nombre, String apellido, String edad, Character genero, String usuarioCreacion) {
		super(id, nombre, apellido, edad, genero,usuarioCreacion);
	}

	public Set<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(Set<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Actor [peliculas=");
		builder.append(peliculas);
		builder.append("]");
		return builder.toString();
	}

	
	
	


	
	
}
