package com.ibm.apicine.exceptions;

import org.springframework.http.HttpStatus;

public class ExceptionType extends RuntimeException{
	private HttpStatus status;
	
	private static final long serialVersionUID = 1L;
	  public ExceptionType(HttpStatus status, String message) {
	        super(message);
	        this.status = status;
	    }
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}

}
