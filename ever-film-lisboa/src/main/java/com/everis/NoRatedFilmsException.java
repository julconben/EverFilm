package com.everis;

public class NoRatedFilmsException extends Exception {
	
	private String message;
	private String messageSecundario;

	public NoRatedFilmsException() {
		super();
	}

	public NoRatedFilmsException(String message) {
		super();
		this.message = message;
	}

	public NoRatedFilmsException(String message, String messageSecundario) {
		super();
		this.message = message;
		this.messageSecundario = messageSecundario;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessageSecundario() {
		return messageSecundario;
	}

	public void setMessageSecundario(String messageSecundario) {
		this.messageSecundario = messageSecundario;
	}
	

}
