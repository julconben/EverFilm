package com.everis;

import java.util.Arrays;
import java.util.List;

import Exercicio.People;
import Exercicio2.Actor;
import Exercicio2.Director;
import Exercicio2.TipoActor;
import Exercicio3.Film;

public class Main {

	public static void main(String[] args) {

		Actor leo = new Actor("Leonardo", "DiCaprio", 44, TipoActor.MAIN, Arrays.asList(2005, 2007, 2014, 2017));
		Actor kate = new Actor("Kate", "Winslet", 43, TipoActor.MAIN, Arrays.asList(2002, 2005, 2007, 2009, 2016));
		Actor billy = new Actor("Billy", "Zane", 53, TipoActor.SUPPORTING, null);
		Director diretor1 = new Director("James", "Cameron", 65, "20th Century Fox",
				Arrays.asList("Titanic", "Avatar", "Terminator"));

		Film film1 = new Film("Titanic", 1997, 9, diretor1, Arrays.asList(leo, kate, billy));
		System.out.println(leo);
		System.out.println("-------------------------");
		System.out.println(diretor1);
		System.out.println("--------------------------");
		System.out.println(film1);
	}

}