package com.everis;

import java.util.ArrayList;
import java.util.List;

public class Actor extends People {

	private List<Integer> oscarNominations = new ArrayList<Integer>();
	private TipoActor tipoActor;

	public Actor(String name, String surname, Integer age, List<Integer> oscarNominations, TipoActor tipoActor) {
		super(name, surname, age);
		this.oscarNominations = oscarNominations;
		this.tipoActor = tipoActor;
	}

	public TipoActor getTipoActor() {
		return tipoActor;
	}

	public void setTipoActor(TipoActor tipoActor) {
		this.tipoActor = tipoActor;
	}

	public void setOscarNominations(List<Integer> oscarNominations) {
		this.oscarNominations = oscarNominations;
	}

	public List<Integer> getOscarNominations() {
		return oscarNominations;
	}

	public void setOscarNominations(ArrayList<Integer> oscarNominations) {
		this.oscarNominations = oscarNominations;
	}

	public static void main(String[] args) {
		TipoActor myVar = TipoActor.Main;
		System.out.println(myVar);
	}
}