package com.ibm.apicine.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.apicine.entidades.Persona;
import com.ibm.apicine.repositorios.PersonaRepositorio;

@Service
public class AdministradorDAOImpl implements AdministradorDAO {

	@Autowired
	@Qualifier("administradorRepositorio")
	private PersonaRepositorio personaRepositorio;
	
	@Override
	@Transactional(readOnly = true)
	public Optional<Persona> buscarPorId(Long id) {
		return personaRepositorio.findById(id);
	}

	@Override
	@Transactional
	public Persona guardar(Persona persona) {
		return personaRepositorio.save(persona);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Persona> buscarTodos() {
		return personaRepositorio.findAll();
	}

	@Override
	@Transactional
	public void eliminarPorId(Long id) {
			personaRepositorio.deleteById(id);
	}

	@Override
	@Transactional
	public Iterable<Persona> guardarTodos(Iterable<Persona> personas) {
		return personaRepositorio.saveAll(personas);
	}

}
