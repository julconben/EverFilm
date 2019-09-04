package com.everis;

public class NoRatedFilmsException extends Exception{

	public NoRatedFilmsException(String errorMessage, Throwable err) {
		super(errorMessage, err);
	}

}
