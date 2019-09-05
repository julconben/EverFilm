package com.everis;

import java.util.List;

public class Film implements IFilm, Comparable<Film> {

	private String title;
	private int year, quality;
	private FilmType filmType;
	
	private Director director;
	private List<Actor> cast;

	public Film() {
		super();
	}

	public Film(String title, int year, int quality, Director director, List<Actor> cast, FilmType filmType) {
		super();
		this.title = title;
		this.year = year;
		this.quality = quality;
		this.filmType = filmType;
		
		this.director = director;
		this.cast = cast;		
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
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

	public void setFilmType(FilmType filmType) {
		this.filmType = filmType;
	}

	public String getQualityString() {

		switch (quality) {
		case 0:
		case 1:
		case 2:
			return "REALLY BAD";
		case 3:
		case 4:
			return "BAD";
		case 5:
		case 6:
			return "NORMAL";
		case 7:
		case 8:
			return "GOOD";
		case 9:
		case 10:
			return "EXCELENT";
		default:
			return null;
		}
	}

	@Override
	public String toString() {
		return "Film [title=" + title + ", year=" + year + ", Quality=" + getQualityString() + "]";
	}


	@Override
	public int compareTo(Film o) {
		
		if (this.quality < o.quality) {
			return -1;
		}
		if (this.quality > o.quality) {
			return 1;
		}
		if (this.quality == o.quality) {
			if(this.year < o.year) return -1;
			if(this.year > o.year) return 1;
		}
		return 0;
	}

}
