package com.ibm.apicine.servicios;

import java.util.Optional;

import com.ibm.apicine.entidades.Pelicula;

public interface PeliculaDAO {
	public Optional<Pelicula> buscarPorId(Long id);
	public Pelicula guardar(Pelicula pelicula);
	public Iterable<Pelicula> buscarTodos();
	public void eliminarPorId(Long id);
	public Iterable<Pelicula> guardarTodos(Iterable<Pelicula> peliculas);

}
