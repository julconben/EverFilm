package com.everis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {

		// List of filmografy
		List<String> filmography = new ArrayList<String>();
		filmography.add("M");
		filmography.add("X");
		filmography.add("O");
		filmography.add("F");
		filmography.add("G");

		// List of nominations
		List<Integer> oscarNominations = new ArrayList<Integer>();
		oscarNominations.add(0);
		oscarNominations.add(1);
		oscarNominations.add(2);
		oscarNominations.add(3);
		oscarNominations.add(4);
		oscarNominations.add(5);

		// List of  Actors
		List<Actor> atores = new ArrayList<Actor>();
		atores.add(new Actor("Alex","Del", 60, TipoActor.MAIN));

		// List of the films
		List<Film> films = new ArrayList<Film>();
		films.add(new Film("Matrix", 2001, 5, new Director("Alex", "Neto",  15, "M", filmography), atores, FilmType.CARTOON));
		films.add(new Film("Furious", 2002, 3, new Director("Kevin","Durant", 45, "O", filmography), atores, FilmType.COMMEDY));
		films.add(new Film("Matrix", 2001, 5, new Director("Alex", "Neto",  15, "M", filmography), atores, FilmType.CARTOON));
		films.add(new Film("Furious", 2002, 3, new Director("Kevin","Durant", 45, "O", filmography), atores, FilmType.COMMEDY));
		films.add(new Film("Matrix", 2001, 5, new Director("Alex", "Neto",  15, "M", filmography), atores, FilmType.CARTOON));
		films.add(new Film("Furious", 2002, 3, new Director("Kevin","Durant", 45, "O", filmography), atores, FilmType.COMMEDY));
		
		// Show a list of the films as a string
		films.forEach((n) -> System.out.println(n));

		Map<Film, Integer> ratings = new HashMap<>();
		ratings.put(films.get(0), 5);

		// List of People
		List<People> peopleList = new ArrayList<>();
		peopleList.add(new User("Alex","Neto", 60, "alp", ratings, films));
		peopleList.add(new Actor("Pedrito","Martinez", 75, TipoActor.MAIN));
		peopleList.add(new Director("Cris","Duarte", 15, "M", filmography));
		
		peopleList.sort(new Comparator<People>() {
			@Override
			public int compare(People o1, People o2) {
				return o1.getAge() - o2.getAge();
			}			
		});
		
		for (People people : peopleList) {
			System.out.println(people);
		}
		
		List<Actor> atoresL = new ArrayList<Actor>();
		Actor a1 = new Actor("Bela","Babab", 60, TipoActor.MAIN);
		Actor a2 = new Actor("Pedro","Fernandes", 40, TipoActor.STUNTMAN);
		Actor a3 = new Actor("Antonio","Silva", 20, TipoActor.SUPPORTING);
		Actor a4 = new Actor("Manuel","Jesus", 50, TipoActor.STUNTMAN);
		Actor a5 = new Actor("Ruben","Cruz", 30, TipoActor.SUPPORTING);
		List<Integer> oscarNom = new ArrayList<Integer>();
		oscarNom.add(1);
		oscarNom.add(2);
		oscarNom.add(3);
		oscarNom.add(4);
		
		a1.setOscarNominations(oscarNom);
		a2.setOscarNominations(oscarNom);
		a3.setOscarNominations(oscarNom);
		
		atoresL.add(a1);		
		atoresL.add(a2);		
		atoresL.add(a3);
		atoresL.add(a4);
		atoresL.add(a5);
		List<Actor> othersActors = new ArrayList<Actor>();
		for (Actor actor : atoresL) {
			if(!actor.getOscarNominations().isEmpty() && actor.getOscarNominations()!=null ) {
				othersActors.add(actor);
			}
		}
		System.out.println(othersActors);

	}
}
