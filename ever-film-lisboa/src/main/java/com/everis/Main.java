package com.everis;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Add your run execution here
		Actor a = new Actor("Francisco", "VL", 24, Arrays.asList(2005, 2017), TipoActor.Main);
		Actor b = new Actor("Antonio", "VL", 24, Arrays.asList(2005, 2017), TipoActor.Main);
		Actor c = new Actor("Joao", "VL", 24, Arrays.asList(2005, 2017), TipoActor.Main);
		Director y = new Director("ze", "ze", 78, "soidsosjdk", Arrays.asList("a1, a2, a3"));
		Film hey = new Film("Harry Potter", 2008, 3, y, Arrays.asList(a, b, c), FilmType.Thriller);
		Film ola = new Film("Harry Potter 2", 2009, 3, y, Arrays.asList(a, b, c), FilmType.Thriller);

		HashMap<Film, Integer> ratingFilmUser = new HashMap<Film, Integer>();

		ratingFilmUser.put(hey, 3);
		ratingFilmUser.put(ola, 4);

		User zzz = new User("Patricia", "VL", 27, ratingFilmUser, Arrays.asList(hey), "patricia");
	}
}