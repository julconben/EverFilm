package com.everis;

public class NoRatedFilmsException extends Exception {

	public NoRatedFilmsException() {
		super("There are no rated Films to disclose.");

	}

}
