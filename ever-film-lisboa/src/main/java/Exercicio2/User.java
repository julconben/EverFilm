package Exercicio2;

import Exercicio.People;

public class User extends People{

	@Override
	public String toString() {
		return this.getClass() + "\n" + super.toString();
	}
	
}
