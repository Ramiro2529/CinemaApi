package com.ibm.apicine.exceptions.handler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ibm.apicine.exceptions.InvalidRequestBodyException;
import com.ibm.apicine.exceptions.NotFoundExeption;

@ControllerAdvice
public class ApiCineException {
	
	@ExceptionHandler(value = NotFoundExeption.class)
	public ResponseEntity<Object> noExisteException(NotFoundExeption ex){
		Map<String, Object> respuesta = new HashMap<String, Object>();
		respuesta.put("error", ex.getMessage());
		
		return new ResponseEntity<>(respuesta, HttpStatus.NOT_FOUND);
		
	}
	
	

}
