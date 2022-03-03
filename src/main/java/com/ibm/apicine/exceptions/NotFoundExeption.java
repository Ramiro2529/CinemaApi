package com.ibm.apicine.exceptions;

public class NotFoundExeption extends RuntimeException{

	
	private static final long serialVersionUID = 1L;
	
	public NotFoundExeption(String mensaje) {
		super(mensaje);
	}

}
