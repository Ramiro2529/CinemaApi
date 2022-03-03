package com.ibm.apicine.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.apicine.entidades.Pelicula;
@Repository("peliculaRepositorio")
public interface PeliculaRepositorio extends CrudRepository<Pelicula, Long>{
	

}
