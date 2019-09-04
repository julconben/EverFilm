package com.everis;

import java.util.ArrayList;
import java.util.List;

public class Actor extends People {

	List<Integer> oscarNominations = new ArrayList<Integer>();
	ActorType actorType;

	
	public Actor() {
		super();
	}
	
	public Actor(ArrayList<Integer> oscarNominations, ActorType actorType) {
		this.oscarNominations = oscarNominations;
		this.actorType = actorType;
	}

	public ActorType getActorType() {
		return actorType;
	}
	
	public void setActorType(ActorType actorType) {
		if (ActorType.values().equals(actorType)) {
		this.actorType = actorType;
		}
		
	}

	public Actor(ArrayList<Integer> oscarNominations) {
		this.oscarNominations=oscarNominations;
	}

	public ArrayList<Integer> getOscarNominations() {
		return (ArrayList<Integer>) oscarNominations;
	}

	public void setOscarNominations(List<Integer> oscarNominations) {
		this.oscarNominations = oscarNominations;
	}

}
