package com.ibm.apicine.servicios;

import java.util.Optional;

import com.ibm.apicine.entidades.Idioma;
import com.ibm.apicine.entidades.Persona;

public interface IdiomaDAO {
	public Optional<Idioma> buscarPorId(Long id);
	public Idioma guardar(Idioma idioma);
	public Iterable<Idioma> buscarTodos();
	public void eliminarPorId(Long id);
	public Iterable<Idioma> guardarTodos(Iterable<Idioma> idiomas);

	
}
