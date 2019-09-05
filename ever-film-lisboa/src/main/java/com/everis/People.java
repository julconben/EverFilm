package com.everis;

import java.util.Date;

public class People<T> implements Comparable<People>{
	
	
	private String name, surname;
	private int age;
	
	public People() {
		super();
	}

	public People(String name, String surname,int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public int compareTo(People o) {
		if(this.age > o.age) {
			return 1;
		} 
		if(this.age < o.age) {
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", surname=" + surname + ", age=" + age + "]";
	}

	
	
	
	
}
