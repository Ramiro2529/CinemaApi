package com.ibm.apicine.entidades;

import java.math.BigDecimal;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.ibm.apicine.enums.TipoEmpleado;

@Entity
@Table(name = "empleados", schema = "cinema")
@PrimaryKeyJoinColumn(name = "persona_id")
public class Empleado extends Persona{


	private static final long serialVersionUID = 1L;
	@Column(name = "sueldo")
	private BigDecimal sueldo;
	@Column(name = "tipo_empleado")
	private TipoEmpleado tipoEmpleado;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "codigoPostal", column = @Column(name="codigo_ostal")),
		@AttributeOverride(name = "departamento", column = @Column(name="departamento"))
	})
	private Direccion direccion;
	public Empleado() {
	}
	public Empleado(Long id, String nombre, String apellido, String edad, Character genero, String usuarioCreacion, Direccion direccion
			, TipoEmpleado tipoEmpleado, BigDecimal sueldo) {
		super(id, nombre, apellido, edad, genero, usuarioCreacion);
		this.direccion=direccion;
		this.tipoEmpleado=tipoEmpleado;
		this.sueldo=sueldo;
	}
	public BigDecimal getSueldo() {
		return sueldo;
	}
	public void setSueldo(BigDecimal sueldo) {
		this.sueldo = sueldo;
	}
	public TipoEmpleado getTipoEmpleado() {
		return tipoEmpleado;
	}
	public void setTipoEmpleado(TipoEmpleado tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
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
		builder.append(super.toString());
		builder.append("Empleado [sueldo=");
		builder.append(sueldo);
		builder.append(", tipoEmpleado=");
		builder.append(tipoEmpleado);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
