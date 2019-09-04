package com.everis;

import java.util.ArrayList;
import java.util.List;

public class Actor extends People {

	List<Integer> oscarNominations = new ArrayList<Integer>();
	ActorType actorType;
	
	public enum ActorType {
		MAIN, SUPPORTING, STUNTMAN;
	}
	
	public Actor() {
		super();
	}
	
	public Actor(ArrayList oscarNominations, String actorType) {
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

	public Actor(ArrayList oscarNominations) {
		this.oscarNominations=oscarNominations;
	}

	public ArrayList getOscarNominations() {
		return (ArrayList) oscarNominations;
	}

	public void setOscarNominations(List<Integer> oscarNominations) {
		this.oscarNominations = oscarNominations;
	}

}
