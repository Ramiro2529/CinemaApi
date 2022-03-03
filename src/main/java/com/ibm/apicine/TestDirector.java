package com.ibm.apicine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ibm.apicine.entidades.Direccion;
import com.ibm.apicine.entidades.Director;
import com.ibm.apicine.entidades.Pelicula;
import com.ibm.apicine.entidades.Persona;
import com.ibm.apicine.servicios.DirectorDAO;

@Component
public class TestDirector implements CommandLineRunner {

	@Autowired
	private DirectorDAO directorDao;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		Pelicula batman = new Pelicula(null, "Batman", "185", "b15", "Ramiro");
		
		Director directorNollan = new Director(null, "Christopher", "Nollan", "39", 'M', "Ramiro");
		directorNollan.setPelicula(batman);
		//directorDao.guardar(directorNollan);
		Director directorSami = new Director(null, "Sam", "Rami", "39", 'M', "Ramiro");
		directorSami.setPelicula(batman);
		//directorDao.guardar(directorSami);
	
	}

}
