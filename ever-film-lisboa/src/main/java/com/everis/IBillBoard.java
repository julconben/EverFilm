package com.everis;

public interface IBillBoard {
	
	public String toString();
	public Film getBestFilm();
	public Boolean addFilm(Film film);
	public Film removeOldFilm();
	
}
