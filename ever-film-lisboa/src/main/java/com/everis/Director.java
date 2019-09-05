package com.everis;

import java.util.List;

public class Director extends People{
	
	private String ProductionCompany;
	private List<String> filmography;
	
	public Director() {
		super();
	}

	public Director(String name, String surname, int age,String productionCompany, List<String> filmography) {
		
		super(name,surname,age);
				
		ProductionCompany = productionCompany;
		this.filmography = filmography;
	}

	public String getProductionCompany() {
		return ProductionCompany;
	}

	public void setProductionCompany(String productionCompany) {
		ProductionCompany = productionCompany;
	}

	public List<String> getFilmography() {
		return filmography;
	}

	public void setFilmography(List<String> filmography) {
		this.filmography = filmography;
	}
	
	
}
