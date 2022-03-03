package com.ibm.apicine.entidades;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "directores", schema = "cinema")
@PrimaryKeyJoinColumn(name = "persona_id")
public class Director extends Persona{

	@ManyToOne(optional = true, cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinColumn(name = "pelicula_id", foreignKey = @ForeignKey(name="FK_PELICULA_ID"))
	private Pelicula pelicula;
	
	private static final long serialVersionUID = 1L;

	public Director() {
		super();
	}

	public Director(Long id, String nombre, String apellido, String edad, Character genero,String usuarioCreacion) {
		super(id, nombre, apellido, edad, genero, usuarioCreacion);
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Director [pelicula=");
		builder.append(pelicula);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
