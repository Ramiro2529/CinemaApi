package com.ibm.apicine.entidades;

import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.mapping.Constraint;

@Entity
@Table(name = "usuarios", schema = "cinema")
@PrimaryKeyJoinColumn(name = "persona_id")
public class Usuario extends Persona{


	private static final long serialVersionUID = 1L;
	
	@Column(name = "contraseña", nullable = false)
	private String contraseña;
	@Column(name = "correo", nullable = false)
	private String correo;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "codigoPostal", column = @Column(name="codigo_postal")),
		@AttributeOverride(name = "departamento", column = @Column(name="departamento"))
	})
	private Direccion direccion;
	
	
	public Usuario() {
		super();
	}
	public Usuario(Long id, String nombre, String apellido, String edad, Character genero, String usuarioCreacion, String contraseña, String correo, Direccion direccion) {
		super(id, nombre, apellido, edad, genero, usuarioCreacion);
		this.contraseña=contraseña;
		this.correo=correo;
		this.direccion=direccion;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Usuario [contraseña=");
		builder.append(contraseña);
		builder.append(", correo=");
		builder.append(correo);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(contraseña, correo);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(contraseña, other.contraseña) && Objects.equals(correo, other.correo);
	}
	
	
	

	
	
}
