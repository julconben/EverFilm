package com.everis;

public class NoRatedFilmsException extends Exception {
	private String message;
	
	public NoRatedFilmsException() {
		
	}
	
	
	public NoRatedFilmsException(String message) {
		super();
		this.message = message;
	}



	public String getMessage(String message) {
		return message;
	}

}
