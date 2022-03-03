package com.ibm.apicine.controladores;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ibm.apicine.entidades.Pelicula;
import com.ibm.apicine.exceptions.NotFoundExeption;
import com.ibm.apicine.servicios.PeliculaDAO;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("pelicula")
public class PeliculasControlador {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PeliculasControlador.class);
	@Autowired
	private PeliculaDAO peliculaDao;
	
	/**
     * Endpoint para la creación de películas.
     * @param movie Datos de la película que será creada.
     * @return Lista de peliculas
     */
	
	 @ApiOperation(value = "obtiene listado de peliculas", response = ResponseEntity.class)
	    @ApiResponses(value = {
	            @ApiResponse(code = 200, message = "Satisfactorio se regresa la lista de peliculas"),
	            }
	    )
	@GetMapping("/listaPeliculas")
	public ResponseEntity<Iterable<Pelicula>> listaPeliculas(){
		Iterable<Pelicula> peliculas =peliculaDao.buscarTodos();
		 return ResponseEntity.ok(peliculas);
	}
	
	/**
     * Endpoint para buscar peliculas por su id.
     * @param id de la pelicula
     * @return Un objeto ResponseEntity con la pelicula especificada.
     */
	
	  @ApiOperation(value = "busca una pelicula por id", response = ResponseEntity.class)
	    @ApiResponses(value = {
	            @ApiResponse(code = 200, message = "Satisfactorio se regresa la informacion de la pelicula"),
	            @ApiResponse(code = 404, message = "La pelicula no existe"),
	    })
	@GetMapping("buscarPeliculaId/id/{id}")
	public ResponseEntity<?> buscarPeliculaId(@PathVariable Long id){
		Optional<Pelicula> oPelicula = peliculaDao.buscarPorId(id);
		
		if(!oPelicula.isPresent()) 
			throw new NotFoundExeption(String.format("la pelicula con id: %d no existe", id));
		
		
		return new ResponseEntity<Pelicula>(oPelicula.get(),HttpStatus.OK);
	}
	
	
	/**
     * Endpoint para crear una pelicula.
     * @param titulo de la pelicula
     * @param duracion de la pelicula
     * @param clasificacion de la pelicula
     * @return Un objeto ResponseEntity con la pelicula creada.
     */
	 
	    @ApiOperation(value = "crear una pelicula en el sistema", response = ResponseEntity.class)
	    @ApiResponses(value = {
	            @ApiResponse(code = 200, message = "Satisfactorio se regresa la informacion de la pelicula"),
	            @ApiResponse(code = 404, message = "La pelicula no existe"),
	    })
	@PostMapping("/crearPelicula/{titulo}/{duracion}/{clasifiacion}")
	public ResponseEntity<Pelicula> crearPelicula(@PathVariable String titulo, @PathVariable String duracion,
			@PathVariable String clasifiacion){
		Pelicula pelicula = new Pelicula(null, titulo, duracion, clasifiacion, "Ramiro");
		Pelicula pelicuaGuardada= peliculaDao.guardar(pelicula);
		
		
		 return ResponseEntity.status(HttpStatus.CREATED).body(pelicuaGuardada);
	}
	

}
