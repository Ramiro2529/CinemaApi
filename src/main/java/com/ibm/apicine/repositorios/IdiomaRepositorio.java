package com.ibm.apicine.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.apicine.entidades.Idioma;

@Repository
public interface IdiomaRepositorio extends CrudRepository<Idioma, Long> {
	

}
