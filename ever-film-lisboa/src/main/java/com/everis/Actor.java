package com.everis;

public class Actor extends People {

	int [] oscarNominations;
	ActorType actorType;
	
	public enum ActorType {
		MAIN, SUPPORTING, STUNTMAN;
	}
	
	public Actor() {
		super();
	}
	
	public Actor(int[] oscarNominations, String actorType) {
		super();
		this.oscarNominations = oscarNominations;
		this.actorType = ActorType.valueOf(actorType);
	}

	public ActorType getActorType() {
		return actorType;
	}
	
	public void setActorType(String actorType) {
		if (ActorType.values().equals(actorType)) {
		this.actorType = ActorType.valueOf(actorType);
		}
		
	}

	public Actor(int [] oscarNominations) {
		this.oscarNominations=oscarNominations;
	}

	public int[] getOscarNominations() {
		return oscarNominations;
	}

	public void setOscarNominations(int[] oscarNominations) {
		this.oscarNominations = oscarNominations;
	}

}
