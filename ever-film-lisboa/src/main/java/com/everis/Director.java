package com.everis;

import java.util.*;

public class Director extends People {
	
	private String ProductionCompany;
	private List<String> Filmography;
	
	public static void main(String[] args) {
		
    }

	public Director(String name, String surname, Integer age, String ProductionCompany, List<String> Filmography) {
		super(name, surname, age);
		this.ProductionCompany=ProductionCompany;
		this.Filmography=Filmography;
		// TODO Auto-generated constructor stub
	}

	public Director() {
		super();
		this.ProductionCompany = "Olamoments";
		this.Filmography.add("Nemo");
	}
	
	

}
