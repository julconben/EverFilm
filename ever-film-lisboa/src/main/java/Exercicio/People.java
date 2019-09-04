package Exercicio;

public class People implements Comparable<People> {
	private String name;
	private String surname;
	private Integer age;

	public People(String name, String surname, int age) {
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int compareTo(People otherPeople) {
		Integer i = this.getAge();
		return i.compareTo(otherPeople.getAge());
	}

	@Override
	public String toString() {

		return "Name: " + this.getName() + " " + this.getSurname() + "\nAge: " + this.getAge();
	}

}
