package com.ibm.apicine;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.ibm.apicine.entidades.Actor;
import com.ibm.apicine.entidades.Pelicula;
import com.ibm.apicine.entidades.Persona;
import com.ibm.apicine.servicios.ActorDAO;

@Component
public class TestActor implements CommandLineRunner{

	@Autowired
	private ActorDAO actorDao;
	
	@Override
	public void run(String... args) throws Exception {
		
		Actor damian = new Actor(null, "Damian", "Alcazar", "50", 'M', "Ramiro");
		Actor anne = new Actor(null, "Anne", "Hathaway", "40", 'F', "Ramiro");
		Actor matt = new Actor(null,"Matt", "Mcconaldhey", "40", 'M', "Ramiro");
		Actor bruceW = new Actor(null,"Bruce", "Willis", "40", 'M', "Ramiro");
		
	//	actorDao.guardarTodos(List.of(damian,anne,matt,bruceW));
//		actorDao.eliminarPorId(5L);
//		actorDao.eliminarPorId(6L);
//		actorDao.eliminarPorId(7L);
//		actorDao.eliminarPorId(8L);
		
		
//		//actorDao.guardar(damian);
//		//actorDao.guardar(anne);
//		//actorDao.guardar(matt);
//		Pelicula infierno = new Pelicula(null, "infierno", "185", "b15", "Ramiro");
//		Pelicula interestellar = new Pelicula(null, "Interestellar", "180", "b15", "Ramiro");
//		Actor cochiloco = new Actor(null,"benny", "garcia", "40", 'M', "Ramiro");
////		cochiloco.setPeliculas(peliculasMatt);
//		
//		
////		bruceW.setPeliculas(peliculasMatt);
//		
//		//actorDao.guardar(bruceW);
//		
		
		
		
	}

}
