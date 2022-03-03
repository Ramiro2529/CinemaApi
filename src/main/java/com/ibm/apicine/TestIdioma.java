package com.ibm.apicine;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ibm.apicine.entidades.Actor;
import com.ibm.apicine.entidades.Director;
import com.ibm.apicine.entidades.Idioma;
import com.ibm.apicine.entidades.Pelicula;
import com.ibm.apicine.servicios.DirectorDAO;
import com.ibm.apicine.servicios.IdiomaDAO;
import com.ibm.apicine.servicios.PeliculaDAO;

@Component
public class TestIdioma implements CommandLineRunner{

	@Autowired
	private IdiomaDAO idiomaDao;
	
	@Autowired
	private DirectorDAO directorDao;
	
	@Autowired
	private PeliculaDAO peliculaDao;
	
	@Override
	public void run(String... args) throws Exception {
		Idioma español = new Idioma(null, "Español", "Ramiro");
		Idioma ingles = new Idioma(null, "Ingles", "Ramiro");
		Idioma aleman = new Idioma(null, "Aleman", "Ramiro");
		
		
//		Pelicula clubPelea = new Pelicula(null, "Club de la pelea", "180", "b15", "Ramiro");
//		Actor pitt = new Actor(null, "Brad", "Pitt", "40", 'M', "Ramiro");
//		Director directorDavid = new Director(null, "David ", "Fincher", "39", 'M', "Ramiro");
//		Set<Idioma> idiomas= new HashSet<>();
//		Set<Pelicula> peliculasEsp = new HashSet<>();
//		peliculasEsp.add(clubPelea);
//		idiomas.add(español);
//		idiomas.add(ingles);
//		clubPelea.setIdiomas(idiomas);
//		directorDavid.setPelicula(clubPelea);
//		
//		aleman.setPeliculas(peliculasEsp);
		
		//idiomaDao.guardarTodos(List.of(español,ingles,aleman));
		
		
		//directorDao.guardar(directorDavid);
		//idiomaDao.guardarTodos(idiomas);
		
		
		
		
		
	}

	
	
}
