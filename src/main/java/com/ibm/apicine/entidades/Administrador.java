package com.ibm.apicine.entidades;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "administradores", schema = "cinema")
@PrimaryKeyJoinColumn(name = "persona_id")
public class Administrador extends Usuario{

	
	

	

	public Administrador() {
		super();
	}

	public Administrador(Long id, String nombre, String apellido, String edad, Character genero, String usuarioCreacion,
			String contraseña, String correo, Direccion direccion) {
		super(id, nombre, apellido, edad, genero, usuarioCreacion, contraseña, correo, direccion);
	}

	private static final long serialVersionUID = 1L;

}
