package com.ibm.apicine.servicios;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.apicine.entidades.Oferta;
import com.ibm.apicine.repositorios.OfertaRepositorio;

@Service
public class OfertaDAOImpl implements OfertaDAO{

	@Autowired
	private OfertaRepositorio ofertaRepositorio;
	
	@Override
	@Transactional(readOnly = true)
	public Optional<Oferta> buscarPorId(Long id) {
		return ofertaRepositorio.findById(id);
	}

	@Override
	@Transactional
	public Oferta guardar(Oferta oferta) {
		return ofertaRepositorio.save(oferta);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Oferta> buscarTodos() {
		return ofertaRepositorio.findAll();
	}

	@Override
	@Transactional
	public void eliminarPorId(Long id) {
		ofertaRepositorio.deleteById(id);
	}

	@Override
	@Transactional
	public Iterable<Oferta> guardarTodos(Iterable<Oferta> ofertas) {
		return ofertaRepositorio.saveAll(ofertas);
	}

}
