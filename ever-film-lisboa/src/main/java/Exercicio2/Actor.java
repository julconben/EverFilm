package Exercicio2;

import java.util.ArrayList;
import java.util.List;

import Exercicio.People;

public class Actor extends People {

	private List<Integer> oscarNominations = new ArrayList<Integer>();
	private TipoActor tipoActor; 
	
	public TipoActor getTipoActor() {
		return tipoActor;
	}

	public void setTipoActor(TipoActor tipoActor) {
		this.tipoActor = tipoActor;
	}

	public List<Integer> getOscarNominations() {
		return oscarNominations;
	}

	public void setOscarNominations(List<Integer> oscarNominations) {
		this.oscarNominations = oscarNominations;
	}

	public Actor(String name, String surname, int age,TipoActor tipoActor, List<Integer> oscarNominations) {
		super(name, surname, age);
		this.oscarNominations = oscarNominations;
		this.tipoActor = tipoActor;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName() + "\n" + super.toString() + "\nOscar Nominations: " + this.getOscarNominations().toString() + "\nTipo de Actor: " + this.getTipoActor();
	}

}
