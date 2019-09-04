package com.everis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Diretor extends Pessoa {
	private String ProductionCompany;
	private List<String> Filmografia = new ArrayList<String>();

	public List<String> getFilmografia() {
		return Filmografia;
	}

	public void setFilmografia(List<String> filmografia) {
		Filmografia = filmografia;
	}

	public String getProductionCompany() {
		return ProductionCompany;
	}

	public void setProductionCompany(String productionCompany) {
		ProductionCompany = productionCompany;
	}

	public Diretor() {

	}

	public Diretor(String nome, String apelido, int idade, String productionCompany, List<String> filmografia1) {
		super(nome, apelido, idade);
		this.ProductionCompany = productionCompany;
		this.Filmografia = new ArrayList<String>();
		this.Filmografia = filmografia1;

	}

	@Override
	public String toString() {
		return "Diretor [Nome= " + getNome() + ", Apeldido=" + getApelido() + ", Idade=" + getIdade()
				+ ", ProductionCompany= " + ProductionCompany + " Filmografia= " + Filmografia + "]";
	}

}
