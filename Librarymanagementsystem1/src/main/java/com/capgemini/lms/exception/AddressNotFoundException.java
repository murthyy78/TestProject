package com.capgemini.lms.exception;

public class AddressNotFoundException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AddressNotFoundException() {
		
	}
	
public AddressNotFoundException(String msg) {
		super(msg);
	}
	
}
