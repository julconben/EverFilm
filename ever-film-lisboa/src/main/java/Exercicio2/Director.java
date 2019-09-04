package Exercicio2;

import java.util.List;
import java.util.ArrayList;

import Exercicio.People;

public class Director extends People {

	private String productionCompany;
	private List<String> Filmography;

	public String getProductionCompany() {
		return productionCompany;
	}

	public void setProductionCompany(String productionCompany) {
		this.productionCompany = productionCompany;
	}

	public List<String> getFilmography() {
		return Filmography;
	}

	public void setFilmography(ArrayList<String> filmography) {
		Filmography = filmography;
	}

	public Director(String name, String surname, int age, String productionCompany, List<String> filmography2) {
		super(name, surname, age);
		Filmography = new ArrayList<String>();
		this.productionCompany = productionCompany;
		Filmography = filmography2;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName() + "\n" + super.toString() + "\nProduction Company: " + this.getProductionCompany()
				+ "\nFilmography: " + this.getFilmography();
	}

}
