package com.everis;

import java.util.List;

public class Actor extends People {

	private List<Integer> oscarNom;
	private TipoActor tipoActor;
	public List<Integer> getOscarNom() {
		return oscarNom;
	}
	public void setOscarNom(List<Integer> oscarNom) {
		this.oscarNom = oscarNom;
	}
	public TipoActor getTipoActor() {
		return tipoActor;
	}
	public void setTipoActor(TipoActor tipoActor) {
		this.tipoActor = tipoActor;
	}
}
