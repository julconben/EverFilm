package com.everis;

import java.util.List;

public class Film implements Comparable<Film> {

	private String title;
	private Integer year;
	private Integer quality;
	private Director director;
	private List<Actor> cast;
	private FilmType filmType;

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

	public void setFilmType(FilmType filmType) {
		this.filmType = filmType;
	}

	@Override
	public String toString() {
		return "Film [Title - Year - getQuality (quality)]";
	}

	public void getQualityString(String[] args) {

		switch (quality) {

		case 0:
		case 1:
		case 2:
			System.out.println("REALLY BAD");
			break;
		case 3:
		case 4:
			System.out.println("BAD");
			break;
		case 5:
		case 6:
			System.out.println("NORMAL");
			break;
		case 7:
		case 8:
			System.out.println("GOOD");
			break;
		case 9:
		case 10:
			System.out.println("EXCELLENT");
			break;
		default:
			System.out.println("error");

		}
	}

	public int compareTo(Film o) {
		// TODO Auto-generated method stub
		return 0;
	}
}