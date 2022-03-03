package com.ibm.apicine.servicios;

import java.util.Optional;

import com.ibm.apicine.entidades.Persona;

public interface PersonaDAO {
	
	public Optional<Persona> buscarPorId(Long id);
	public Persona guardar(Persona persona);
	public Iterable<Persona> buscarTodos();
	public void eliminarPorId(Long id);
	public Iterable<Persona> guardarTodos(Iterable<Persona> personas);

}
