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

	public Actor(String name, String surname, Integer age, TipoActor tipoActor) {
		super(name, surname, age);
		this.tipoActor = tipoActor;
	}

	public List<Integer> getOscarNominations() {
		return oscarNominations;
	}

	public void setOscarNominations(List<Integer> oscarNominations) {
		this.oscarNominations = oscarNominations;
	}

	public TipoActor getTipoActor() {
		return tipoActor;
	}

	public void setTipoActor(TipoActor tipoActor) {
		this.tipoActor = tipoActor;
	}

	@Override
	public String toString() {
		return "Actor" + " " + getName() + " " + getSurname() + " " + getAge() + " " + getTipoActor() + " " + getOscarNominations() + "]";
	}
}
