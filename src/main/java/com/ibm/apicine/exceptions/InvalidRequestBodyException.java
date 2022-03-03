package com.ibm.apicine.exceptions;

public class InvalidRequestBodyException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;
	
	public InvalidRequestBodyException (String mensaje) {
		super(mensaje);
	}

}
