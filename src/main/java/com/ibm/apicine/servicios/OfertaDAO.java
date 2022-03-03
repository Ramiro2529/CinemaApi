package com.ibm.apicine.servicios;

import java.util.Optional;

import com.ibm.apicine.entidades.Oferta;

public interface OfertaDAO {
	public Optional<Oferta> buscarPorId(Long id);
	public Oferta guardar(Oferta oferta);
	public Iterable<Oferta> buscarTodos();
	public void eliminarPorId(Long id);
	public Iterable<Oferta> guardarTodos(Iterable<Oferta> ofertas);
	
}
