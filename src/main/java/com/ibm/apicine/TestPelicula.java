package com.ibm.apicine;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ibm.apicine.entidades.Actor;
import com.ibm.apicine.entidades.Pelicula;
import com.ibm.apicine.entidades.Persona;
import com.ibm.apicine.servicios.ActorDAO;
import com.ibm.apicine.servicios.PeliculaDAO;

@Component
public class TestPelicula implements CommandLineRunner{
@Autowired
private PeliculaDAO peliculasDao;
@Autowired
private ActorDAO actorDao;
	
	@Override
	public void run(String... args) throws Exception {
		Pelicula interestellar = new Pelicula(null, "Interestellar", "180", "b15", "Ramiro");
		Pelicula requiem = new Pelicula(null, "Rquiem for a dream", "180", "C", "Ramiro");
		
		Pelicula endOf = new Pelicula(null, "The end of evangelion", "180", "C", "Ramiro");
		Pelicula efectoMari = new Pelicula(null, "El efecto mariposa", "180", "b15", "Ramiro");
		Pelicula warriors = new Pelicula(null, "The warriors", "180", "b15", "Ramiro");
		Pelicula clubPelea = new Pelicula(null, "El club de la pelea", "180", "C", "Ramiro");
		Pelicula batman = new Pelicula(null, "Batman", "180", "b15", "Ramiro");
		Pelicula donnie = new Pelicula(null, "Donnie darko", "180", "b15", "Ramiro");
		Pelicula spiderman = new Pelicula(null, "Spider man", "180", "b15", "Ramiro");
		Pelicula it = new Pelicula(null, "It", "180", "b15", "Ramiro");
		
//		peliculasDao.guardarTodos(List.of(requiem,endOf, efectoMari, warriors
//				,clubPelea,batman,donnie,spiderman,it));
//		
//	Optional<Persona> anne= actorDao.buscarPorId(14L);
//		System.out.println(anne.get().getNombre());
//		Optional<Persona> matt= actorDao.buscarPorId(15L);
//		System.out.println(matt.get().getNombre());
//		
//		
//		
//		Optional<Pelicula> inter = peliculasDao.buscarPorId(1L);
//		System.out.println(inter.get().getTitulo());
//		
//		Iterable<Persona> actores = actorDao.buscarTodos();
//		actores.forEach(actor-> System.out.println(actor.getNombre()));
		
		
		
		//peliculasDao.guardar(interestellar);
		
//		Set<Persona> actoresInter = new HashSet<>();
//		actoresInter.add(anne);
//		actoresInter.add(matt);
		
	
		
		
		
		
		
	}

}
