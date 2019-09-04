package com.everis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import Exercicio.People;
import Exercicio2.Actor;
import Exercicio2.Director;
import Exercicio2.TipoActor;
import Exercicio3.Film;
import Exercicio4.NoRatedFilmsException;
import Exercicio4.User;

public class Main {

	public static void main(String[] args) {

		Actor leo = new Actor("Leonardo", "DiCaprio", 44, TipoActor.MAIN, Arrays.asList(2005, 2007, 2014, 2017));
		Actor kate = new Actor("Kate", "Winslet", 43, TipoActor.MAIN, Arrays.asList(2002, 2005, 2007, 2009, 2016));
		Actor billy = new Actor("Billy", "Zane", 53, TipoActor.SUPPORTING, null);
		Actor tom = new Actor("Tom", "Cruise", 54, TipoActor.SUPPORTING, null);
		Actor amy = new Actor("Amy", "Adams", 34, TipoActor.MAIN, null);
		Director james = new Director("James", "Cameron", 65, "20th Century Fox",
				Arrays.asList("Titanic", "Avatar", "Terminator"));

		Film film1 = new Film("Titanic", 1997, 9, james, Arrays.asList(leo, kate, billy));
		Film film2 = new Film("Avatar", 1997, 8, james, Arrays.asList(leo, kate, billy));
		Film film3 = new Film("Terminator", 1997, 5, james, Arrays.asList(leo, kate, billy));
		Film film4 = new Film("Harry Potter", 1997, 7, james, Arrays.asList(leo, kate, billy));
		Film film5 = new Film("Sherlock Holmes", 1997, 6, james, Arrays.asList(leo, kate, billy));

		List<Film> listaFilmes = new ArrayList<Film>(Arrays.asList(film1, film2, film3, film4));

		for (Film film : listaFilmes) {
			System.out.println(film);
		}

		System.out.println("-------------------");
		Collections.sort(listaFilmes);
		for (Film film : listaFilmes) {
			System.out.println(film);
		}

		System.out.println("-------------------");
		List<People> listaPeople = new ArrayList<People>(Arrays.asList(james,kate,billy,leo));
		
		for(People people: listaPeople) {
			System.out.println(people + "\n\n<><><><>\n");
			
		}
		
		System.out.println("-------------------");
		Collections.sort(listaPeople);
		
		for(People people: listaPeople) {
			System.out.println(people + "\n\n<><><><>\n");
			
		}
		
		HashMap<Film, Integer> ratingsUser1 = new HashMap<Film, Integer>();
		ratingsUser1.put(film1, 7);
		ratingsUser1.put(film2, 5);
		ratingsUser1.put(film3, 9);
		ratingsUser1.put(film4, 4);
		ratingsUser1.put(film5, 8);
		User user1 = new User("Joao", "Rafael", 23, ratingsUser1, Arrays.asList(film1,film2,film3,film4,film5), "JRafa");
		
		try {
			System.out.println(user1.getAverageRating());
		} catch (NoRatedFilmsException e) {
			e.printStackTrace();
		}
		
		System.out.println("-------------------");
		ArrayList<Actor> listaActores = new ArrayList<Actor>(Arrays.asList(leo,kate,billy,tom,amy));
		ArrayList<Actor> listaActoresOscar = new ArrayList<Actor>();
		
		System.out.println(listaActores.get(0).toString());
		
		/*
		 * for(int i = 0; i<listaActores.size();i++) {
		 * if(listaActores.get(i).getOscarNominations().size()>0) {
		 * listaActoresOscar.add(listaActores.get(i)); } }
		 */
		System.out.println(listaActoresOscar);
		
	}

}