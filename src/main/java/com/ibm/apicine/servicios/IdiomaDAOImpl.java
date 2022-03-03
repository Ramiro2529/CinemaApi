package com.ibm.apicine.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.apicine.entidades.Idioma;
import com.ibm.apicine.repositorios.IdiomaRepositorio;

@Component
public class IdiomaDAOImpl implements IdiomaDAO {

	@Autowired
	private IdiomaRepositorio idiomaRepositorio;
	@Override
	@Transactional(readOnly = true)
	public Optional<Idioma> buscarPorId(Long id) {
		return idiomaRepositorio.findById(id);
	}

	@Override
	@Transactional
	public Idioma guardar(Idioma idioma) {
		return idiomaRepositorio.save(idioma);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Idioma> buscarTodos() {
		return idiomaRepositorio.findAll();
	}

	@Override
	@Transactional
	public void eliminarPorId(Long id) {
		idiomaRepositorio.deleteById(id);
	}

	@Override
	@Transactional
	public Iterable<Idioma> guardarTodos(Iterable<Idioma> idiomas) {
		return idiomaRepositorio.saveAll(idiomas);
	}

}
