package com.ibm.apicine.servicios;

import java.util.Optional;

import com.ibm.apicine.entidades.Funcion;
import com.ibm.apicine.entidades.Persona;

public interface FuncionDAO {
	public Optional<Funcion> buscarPorId(Long id);
	public Funcion guardar(Funcion funcion);
	public Iterable<Funcion> buscarTodos();
	public void eliminarPorId(Long id);
	public Iterable<Funcion> guardarTodos(Iterable<Funcion> funciones);

}
