package com.ibm.apicine;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ibm.apicine.entidades.Actor;
import com.ibm.apicine.entidades.Funcion;
import com.ibm.apicine.entidades.Pelicula;
import com.ibm.apicine.servicios.FuncionDAO;
import com.ibm.apicine.servicios.PeliculaDAO;

@Component
public class TestFuncion implements CommandLineRunner{
	
	@Autowired
	private FuncionDAO funcionDao;
	@Autowired
	private PeliculaDAO peliculaDao;

	@Override
	public void run(String... args) throws Exception {
		
		Funcion funcion1= new Funcion(null, "14:00", "2022-03-09", "Ramiro");
		
		
		Optional<Pelicula> inter= peliculaDao.buscarPorId(1L);
		System.out.println(inter.get().getTitulo());
		
		
		//funcionDao.guardar(funcion1);
		
		
		
	}

}
