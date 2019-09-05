package com.everis;

public class NoRatedFilmsException extends Exception{
	private String message;
	
	public NoRatedFilmsException() {
		super();
		this.message="Nenhum filme foi avaliado";
		// TODO Auto-generated constructor stub
	}
	

	public NoRatedFilmsException(String message) {
		super();
		this.message = message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}


	
}
