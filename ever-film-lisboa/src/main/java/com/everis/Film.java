package com.everis;

import java.util.List;

public class Film implements Comparable<Film>, IFilm {
	public String title;
	public Integer year;
	public Integer quality;
	public Director director;
	public List<Actor> cast;

	public Film(String title, Integer year, Integer quality, Director director, List<Actor> cast) {
		super();
		this.title = title;
		this.year = year;
		this.quality = quality;
		this.director = director;
		this.cast = cast;
	}

	public String getQualityString(Integer quality) {
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
			return "Invalid";
		}
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

	public int compareTo(Film otherFilm) {
		if (this.getQuality() == otherFilm.getQuality()) {
			return this.getYear().compareTo(otherFilm.getYear());
		} else {
			return this.quality.compareTo(otherFilm.quality);
		}

	}

	@Override
	public String toString() {
		return "Film [Title -" + title + ", Year=" + year + ", Quality=" + getQualityString(quality) + "]";
	}

	public String getQualityString() {
		// TODO Auto-generated method stub
		return null;
	}



}
