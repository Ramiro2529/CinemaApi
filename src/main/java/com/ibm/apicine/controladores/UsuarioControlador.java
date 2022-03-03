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

import com.ibm.apicine.entidades.Direccion;
import com.ibm.apicine.entidades.Pelicula;
import com.ibm.apicine.entidades.Persona;
import com.ibm.apicine.entidades.Usuario;
import com.ibm.apicine.exceptions.ExceptionType;
import com.ibm.apicine.exceptions.NotFoundExeption;
import com.ibm.apicine.servicios.AdministradorDAO;
import com.ibm.apicine.servicios.UsuarioDAO;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("usuario")
public class UsuarioControlador {

	@Autowired
	private UsuarioDAO usuarioDao;
	
	
	  /**
     * Endpoint para dar de alta un usuario
     *@param cinema cinema que se dara de alta
     * @return Respuesta para confirmar que la solicitud fue exitosa
     */
    @ApiOperation(value = "Da de alta a un usuario", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Se creó el usuario"),
            @ApiResponse(code = 400, message = "Los datos proporcionados son incorrectos"),
            @ApiResponse(code = 403, message = "No se esta autorizado para acceder al recursp")
    }
    )
    @PostMapping("crearUsuario/{calle}/{numero}/{cp}/{departamento}/{piso}/{localidad}/{nombre}/{apellido}/{edad}/{genero}/{contra}/{correo}")
    public ResponseEntity<Persona> crearUsuario (@PathVariable String calle, @PathVariable String numero, @PathVariable String cp, @PathVariable String departamento,
    		@PathVariable String piso, @PathVariable String localidad, @PathVariable String nombre, @PathVariable String apellido,
    		@PathVariable String edad, @PathVariable Character genero, @PathVariable String contra, @PathVariable String correo){
    	
    	
    	try {
			Direccion direccion = new Direccion(calle, numero, cp, departamento, piso, localidad);
    	Persona persona = new Usuario(null,nombre, apellido, edad,genero , "Ramiro", contra, correo,direccion);
		Persona personaGuardada = usuarioDao.guardar(persona);
		
    	return ResponseEntity.status(HttpStatus.CREATED).body(personaGuardada);
		} catch (ExceptionType e) {
			
			throw e;
		}
    	
    }
    
    /**
     * Endpoint para dar de baja un usuario
     *@param id del usuario
     * @return Respuesta para confirmar que la solicitud fue exitosa
     */
    @ApiOperation(value = "Da de baja a un usuario", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Se eliminó el usuario"),
            @ApiResponse(code = 400, message = "Los datos proporcionados son incorrectos"),
            @ApiResponse(code = 403, message = "No se esta autorizado para acceder al recursp")
    }
    )
    @PostMapping("/eliminarUsuario/id/{id}")
    public void eliminarUsuario(@PathVariable Long id){
    	
    	Optional<Persona> oPersona = usuarioDao.buscarPorId(id);
    	
    	
    	if(!oPersona.isPresent()) {
    		throw new NotFoundExeption(String.format("El usuario con id: %d no existe", id));
    	}else {
    		usuarioDao.eliminarPorId(id);
    	}
    	
    	
    }
    /**
     * Endpoint para ver detalles del usuario
     *@param id del usuario
     * @return Respuesta para confirmar que la solicitud fue exitosa
     */
    @ApiOperation(value = "Ver detalles del usuario", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "se vieron detalles delusuario"),
            @ApiResponse(code = 400, message = "Los datos proporcionados son incorrectos"),
            @ApiResponse(code = 403, message = "No se esta autorizado para acceder al recursp")
    }
    )
    @GetMapping("buscarUsuarioId/id/{id}")
	public ResponseEntity<?> buscarUsuarioId(@PathVariable Long id){
		Optional<Persona> oPersona = usuarioDao.buscarPorId(id);
		
		if(!oPersona.isPresent()) 
			throw new NotFoundExeption(String.format("El usuario con id: %d no existe", id));
		
		
		return new ResponseEntity<Persona>(oPersona.get(),HttpStatus.OK);
	}
    
    
}
