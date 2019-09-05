package com.everis;

import java.util.ArrayList;
import java.util.List;

public class Actor extends People{
	
	private List<Integer> oscarNominations;
	
	private TipoActor tipoActor;
	
	

	public Actor(String name, String surname, int age, TipoActor tipoActor) {
		super(name, surname,age);
		this.oscarNominations = new ArrayList<Integer>();
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
	
	
	
}
