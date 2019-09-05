package com.everis;

import java.util.*;



public class Film implements IFilm {
	private String title;
	private int year;
	private int quality;
	private Director diretor;
	private List<Actor> cast;
	
	
	//fazer construtor e for each
	
	public void main(String[] args) {
		

    }
	
	
	public Film() {
		super();
		this.title = "Titanic";
		this.year = 2005;
		this.quality = 6;
		
	}


	public Film(String title, int year, int quality, Director diretor, List<Actor> cast) {
		super();
		this.title = title;
		this.year = year;
		this.quality = quality;
		this.diretor = diretor;
		this.cast = cast;
	}


	@Override
	public String toString() {
		return "Film [" + title + " - " + year + " - " + quality + "]";
	}
	public int getQuality() {
		return quality;
	}
	public void getQualityString() {
		switch(quality) {
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
			System.out.println("Este filme nao foi avaliado");
			break;
		}
	}
}
