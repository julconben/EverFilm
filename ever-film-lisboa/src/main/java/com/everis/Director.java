package com.everis;

public class Director extends People {

	String productionCompany;
	String[] filmography;
	
	public Director() {
			super();	
	}
	
	public Director(String productionCompany, String[] filmography) {
		super();
		this.productionCompany = productionCompany;
		this.filmography = filmography;
	}
	

	public String getProductionCompany() {
		return productionCompany;
	}

	public void setProductionCompany(String productionCompany) {
		this.productionCompany = productionCompany;
	}

	public String[] getFilmography() {
		return filmography;
	}

	public void setFilmography(String[] filmography) {
		this.filmography = filmography;
	}



}
