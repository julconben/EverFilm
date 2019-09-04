package com.everis;


public class Actor extends People {
	
	private Integer oscarNominations;
	
	public Actor(String name, String surname, Integer age) {
		super(name, surname, age);
	}

	public Actor(String name, String surname, Integer age, Integer oscarNominations) {
		super(name, surname, age);
		this.oscarNominations = oscarNominations;
	}

	public Integer getOscarNominations() {
		return oscarNominations;
	}

	public void setOscarNominations(Integer oscarNominations) {
		this.oscarNominations = oscarNominations;
	}

	enum TipoActor {
		Main, Supporting, Stuntman
	}
	
	  public static void main(String[] args) { 
		    TipoActor myVar = TipoActor.Main; 
		    System.out.println(myVar); 
	  }
}