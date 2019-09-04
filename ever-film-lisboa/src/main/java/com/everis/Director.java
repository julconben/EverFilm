package com.everis;

import java.util.ArrayList;
import java.util.List;

public class Director extends People {

	String productionCompany;
	List<String> filmography = new ArrayList<String>();
	
	public Director() {
			super();	
	}
	
	public Director(String firstName, String surName, int age, String productionCompany, List<String> filmography) {
		super(firstName, surName, age);
		this.productionCompany = productionCompany;
		this.filmography = filmography;
	}
	

	public String getProductionCompany() {
		return productionCompany;
	}

	public void setProductionCompany(String productionCompany) {
		this.productionCompany = productionCompany;
	}

	public List<String> getFilmography() {
		return filmography;
	}

	public void setFilmography(List<String> filmography) {
		this.filmography = filmography;
	}



}
