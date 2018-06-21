package com.lombok.exception;

public class NameNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	
	public NameNotFoundException(String name) {
		super(name);
	}
	
	public String getMessage() {
		return "Did not find FirstName & LastName.";
	}
}
