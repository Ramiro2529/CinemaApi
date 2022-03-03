package com.ibm.apicine.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clasificaciones", schema = "cinema")
public class Clasificacion implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre")
	private String nombre;
	
	public Clasificacion() {
		
	}
	public Clasificacion(Long id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	

}
