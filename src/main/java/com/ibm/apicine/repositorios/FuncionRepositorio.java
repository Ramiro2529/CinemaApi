package com.ibm.apicine.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.apicine.entidades.Funcion;

@Repository("funcionRepositorio")
public interface FuncionRepositorio extends CrudRepository<Funcion, Long>{

}
