package com.everis;

import java.util.ArrayList;
import java.util.List;

public class Actor extends People {

	List<Integer> oscarNominations = new ArrayList<Integer>();
	ActorType actorType;

	
	public Actor() {
		super();
	}
	
	public Actor(String firstName, String surName, int age, List<Integer> oscarNominations, ActorType actorType) {
		super(firstName, surName, age);
		this.oscarNominations = oscarNominations;
		this.actorType = actorType;
	}

	public ActorType getActorType() {
		return actorType;
	}
	
	public void setActorType(ActorType actorType) {
		this.actorType = actorType;	
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
