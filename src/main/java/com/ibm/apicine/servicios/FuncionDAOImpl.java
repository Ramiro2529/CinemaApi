package com.ibm.apicine.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.apicine.entidades.Funcion;
import com.ibm.apicine.repositorios.FuncionRepositorio;

@Service
public class FuncionDAOImpl implements FuncionDAO {
	
	@Autowired
	private FuncionRepositorio funcionRepositorio;

	@Override
	@Transactional(readOnly = true)
	public Optional<Funcion> buscarPorId(Long id) {
		return funcionRepositorio.findById(id);
	}

	@Override
	@Transactional
	public Funcion guardar(Funcion funcion) {
		return funcionRepositorio.save(funcion);
	}


	@Override
	@Transactional(readOnly = true)
	public Iterable<Funcion> buscarTodos() {
		return funcionRepositorio.findAll();
	}

	@Override
	@Transactional
	public void eliminarPorId(Long id) {
		funcionRepositorio.deleteById(id);
	}

	@Override
	@Transactional
	public Iterable<Funcion> guardarTodos(Iterable<Funcion> funciones) {
		return funcionRepositorio.saveAll(funciones);
	}



	
}
