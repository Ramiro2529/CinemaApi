package com.ibm.apicine.servicios;

import java.util.Optional;

import com.ibm.apicine.entidades.Persona;

public class PersonaDAOImpl implements PersonaDAO {

	
	
	@Override
	public Optional<Persona> buscarPorId(Long id) {
		return null;
	}

	@Override
	public Persona guardar(Persona persona) {
		return null;
	}

	@Override
	public Iterable<Persona> buscarTodos() {
		return null;
	}

	@Override
	public void eliminarPorId(Long id) {

	}

	@Override
	public Iterable<Persona> guardarTodos(Iterable<Persona> personas) {
		return null;
	}

}
