package com.everis;

import java.util.ArrayList;
import java.util.List;

public class Director extends People {

	String ProductionCompany;
	List<String> Filmography = new ArrayList<String>();

	public Director(String name, String surname, Integer age, String productionCompany, List<String> filmography) {
		super(name, surname, age);
		ProductionCompany = productionCompany;
		Filmography = filmography;
	}

	public String getProductionCompany() {
		return ProductionCompany;
	}

	public void setProductionCompany(String productionCompany) {
		ProductionCompany = productionCompany;
	}

	public List<String> getFilmography() {
		return Filmography;
	}

	public void setFilmography(List<String> filmography) {
		Filmography = filmography;
	}

	@Override
	public String toString() {
		return "Director [getProductionCompany()=" + getProductionCompany() + ", getFilmography()=" + getFilmography()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}

}
