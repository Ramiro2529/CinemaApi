package com.ibm.apicine.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.apicine.entidades.Pelicula;
import com.ibm.apicine.repositorios.PeliculaRepositorio;

@Service
public class PeliculaDAOImpl implements PeliculaDAO {

	@Autowired
	private PeliculaRepositorio peliculasRepo;
	@Override
	@Transactional(readOnly = true)
	public Optional<Pelicula> buscarPorId(Long id) {
		return peliculasRepo.findById(id);
	}

	@Override
	@Transactional
	public Pelicula guardar(Pelicula pelicula) {
		return peliculasRepo.save(pelicula);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Pelicula> buscarTodos() {
		return peliculasRepo.findAll();
	}

	@Override
	@Transactional
	public void eliminarPorId(Long id) {
		peliculasRepo.deleteById(id);
	}

	@Override
	@Transactional
	public Iterable<Pelicula> guardarTodos(Iterable<Pelicula> peliculas) {
		return peliculasRepo.saveAll(peliculas);
	}

}
