package com.everis;

public class People implements Comparable<People> {
	
	String firstName;
	String surName;
	Integer age;
	
	
	public People() {
		
	}
	public People(String firstName, String surName, int age) {
		this.firstName = firstName;
		this.surName = surName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getSurName() {
		return surName;
	}
	
	public void setSurName(String surName) {
		this.surName = surName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int compareTo(People other) {
		return age.compareTo(other.age) ;
	}
	

}
