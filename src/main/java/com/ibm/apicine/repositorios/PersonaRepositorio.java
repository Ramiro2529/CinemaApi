package com.ibm.apicine.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.ibm.apicine.entidades.Persona;
@NoRepositoryBean
public interface PersonaRepositorio extends CrudRepository<Persona, Long> {

}
