package com.everis;

	public interface IBillboard {

		String toString();

		Film getBestFilm();
		
		Boolean addFilm();

		Film removeOldFilm();

	}
