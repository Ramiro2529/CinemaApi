package com.ibm.apicine.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ibm.apicine.entidades.Persona;
import com.ibm.apicine.repositorios.PersonaRepositorio;

@Service
public class ActorDAOImpl implements ActorDAO {
	
	@Autowired
	@Qualifier("actorRepositorio")
	private PersonaRepositorio personaRepositorio;

	@Override
	public Optional<Persona> buscarPorId(Long id) {
		return personaRepositorio.findById(id);
	}

	@Override
	public Persona guardar(Persona persona) {
		return personaRepositorio.save(persona);
	}

	@Override
	public Iterable<Persona> buscarTodos() {
		return personaRepositorio.findAll();
	}

	@Override
	public void eliminarPorId(Long id) {
		personaRepositorio.deleteById(id);
	}

	@Override
	public Iterable<Persona> guardarTodos(Iterable<Persona> personas) {
		return personaRepositorio.saveAll(personas);
	}

}
