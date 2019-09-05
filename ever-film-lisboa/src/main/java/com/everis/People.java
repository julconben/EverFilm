package com.everis;

public class People {
	private String name;
	private String surname;
	private int age;
	
	public static void main(String[] args) {
       
    }
	
	
	public String getName() {
		return name;
	}
	
	public void setId(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	public People(String name, String surname, Integer age) {
		super();
		this.name=name;
		this.surname=surname;
		this.age=age;
	}
	public People() {
		super();
		this.name = "Laura";
		this.surname = "Mendes";
		this.age = 23;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		People other = (People) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}
	
	
}
