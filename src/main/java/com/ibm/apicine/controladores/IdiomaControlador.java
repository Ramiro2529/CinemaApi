package com.ibm.apicine.controladores;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.apicine.entidades.Actor;
import com.ibm.apicine.entidades.Idioma;
import com.ibm.apicine.entidades.Pelicula;
import com.ibm.apicine.servicios.IdiomaDAO;

@RestController
@RequestMapping("idioma")
public class IdiomaControlador {
	
	@Autowired
	private IdiomaDAO idiomaDao;
	
	@PostMapping("/guardarIdioma/{idioma}")
	public ResponseEntity<Idioma> crearIdioma(@PathVariable String idioma){
		
	Idioma idioma1 = new Idioma(null, idioma, "Ramiro");
	
		Idioma idiomaGuardar=  idiomaDao.guardar(idioma1);
		return ResponseEntity.status(HttpStatus.CREATED).body(idiomaGuardar);
	}
	
	@GetMapping("/listaIdiomas")
	public ResponseEntity<Iterable<Idioma>> listarIdiomas(){
		Iterable<Idioma> idiomas = idiomaDao.buscarTodos();
		return ResponseEntity.ok(idiomas);
	}
	
	
	
	
	
	

}
