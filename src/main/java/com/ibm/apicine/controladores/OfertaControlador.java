package com.ibm.apicine.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import com.ibm.apicine.entidades.Oferta;
import com.ibm.apicine.servicios.OfertaDAO;

@RestController
@RequestMapping("oferta")
public class OfertaControlador {
	
	@Autowired
	private OfertaDAO ofertaDao;
	
	  /**
     * Endpoint listar todas las ofertas disponibles en el sistema
     * @return Respuesta para confirmar que la solicitud fue exitosa
     */
    @ApiOperation(value = "obtiene las ofertas disponibles en el sistema", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Satisfactorio se regresa la lista de ofertas"),
    }
    )
    @GetMapping("/listarOfertas")
    public ResponseEntity<?> getAllOffers() {
        Iterable<Oferta> ofertas=ofertaDao.buscarTodos();
        return new ResponseEntity<>(ofertas, HttpStatus.OK);
    }

}
