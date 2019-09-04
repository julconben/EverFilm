package com.everis;

public interface IBillboard {
	
	public String toString();
	public Film getBestFilm();
	public boolean addFilm(Film movie);
	public Film removeOldFilm();

}
