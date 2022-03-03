package com.ibm.apicine.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name="ofertas")
public class Oferta implements Serializable {

	  
	private static final long serialVersionUID = 1L;

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long  id;

	    @Column(name="descripcion")
	    private String descripcion;


	    @JsonFormat(pattern="yyyy-MM-dd")
	    @Column(name="valida_hasta")
	    private Date limite;

	    @Column(name="puntos")
	    private Integer puntos;

	    @Column(name="sub_puntos")
	    private Integer subPuntos;
}
