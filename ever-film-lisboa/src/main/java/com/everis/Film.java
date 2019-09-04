package com.everis;

import java.util.ArrayList;
import java.util.List;

public class Film implements IFilm{
	
	String title;
	Integer year;
	Integer quality;
	Director director;
	List<Actor> cast = new ArrayList<Actor>();
	FilmType filmType;
	
	public Film() {
		//TODO
	}

	public Film(String title, Integer year, Integer quality, Director director, List<Actor> cast, FilmType filmType) {
		super();
		this.title = title;
		this.year = year;
		this.quality = quality;
		this.director = director;
		this.cast = cast;
		this.filmType = filmType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getQuality() {
		return quality;
	}

	public void setQuality(Integer quality) {
		this.quality = quality;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public List<Actor> getCast() {
		return cast;
	}

	public void setCast(List<Actor> cast) {
		this.cast = cast;
	}

	public FilmType getFilmType() {
		return filmType;
	}

	public void setFilmType(String filmType) {
		this.filmType = FilmType.valueOf(filmType);
	}
	
	/** toString
	 * 
	 * Returns a String with [Title – Year – getQuality (quality)]*/
	public String toString() {
		
		return ("[ "+ title + " - " + year.toString() + " - " + getQualityString()+" ]");
		
	}
	
	/**getQualityString
	 * 
	 * Returns a string reporting the quality category of the film*/

	public String getQualityString() {
		
			switch (quality) {
			case 0:;
			case 1:;
			case 2: return ("REALLY BAD");
			case 3:;
			case 4:return ("BAD");
			case 5:;
			case 6:return ("NORMAL");
			case 7:;
			case 8:return ("GOOD");
			case 9:;
			case 10:return ("EXCELENT");
			default: break;
			}
		
		return null;
	}

}
