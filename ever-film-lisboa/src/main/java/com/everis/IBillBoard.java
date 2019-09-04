package com.everis;

public interface IBillBoard {

	public String toString();
	public Filme getGestFilm();
	public boolean addFilm();
	public Filme removeOldFilm();
	
	
}
