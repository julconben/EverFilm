package com.everis;

public class NoRatingFilmsException extends Exception {

		public NoRatingFilmsException() {
			super("no rated films");
		}
}
