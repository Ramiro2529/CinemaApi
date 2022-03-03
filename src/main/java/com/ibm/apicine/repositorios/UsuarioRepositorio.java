package com.ibm.apicine.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.apicine.entidades.Usuario;

@Repository("usuarioRepositorio")
public interface UsuarioRepositorio extends PersonaRepositorio{

}
