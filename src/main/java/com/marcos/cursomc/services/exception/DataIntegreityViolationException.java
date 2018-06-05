package com.marcos.cursomc.services.exception;


public class DataIntegreityViolationException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public DataIntegreityViolationException(String msg) {
		super(msg);
	}
	
	public DataIntegreityViolationException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
