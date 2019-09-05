package com.everis;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Actor ana = new Actor("Ana", "Matos", 25, Arrays.asList(2005, 2007), TipoActor.MAIN);
		Actor pedro = new Actor("Pedro", "Coelho", 23, Arrays.asList(2005, 2007), TipoActor.MAIN);
		Actor joao = new Actor("João", "Ferreira", 25, TipoActor.STUNTMAN);
		Actor miguel = new Actor("Miguel", "Ramos", 26, Arrays.asList(2015, 2017), TipoActor.SUPPORTING);
		Actor jose = new Actor("José", "Morais", 22, Arrays.asList(2000, 2001), TipoActor.MAIN);

		Director tarantino = new Director("Quentin", "Tarantino", 44, "Tarantino Films",
				Arrays.asList("Kill Bill", "Inglorious Bastards", "Django"));

		Film film1 = new Film("Kill Bill", 1999, 2, tarantino, Arrays.asList(ana, pedro));
		Film film2 = new Film("Kill Bill Vol.2", 2015, 4, tarantino, Arrays.asList(joao, miguel));
		Film film3 = new Film("Hateful 8", 1999, 5, tarantino, Arrays.asList(jose, pedro));
		Film film4 = new Film("Inglorious Bastards", 1999, 8, tarantino, Arrays.asList(ana, joao));
		Film film5 = new Film("Django", 1999, 10, tarantino, Arrays.asList(jose, miguel));

		List<Film> listaFilmes = new ArrayList<Film>(Arrays.asList(film1, film2, film3, film4, film5));

		for (Film film : listaFilmes) {

			System.out.println(film);
		}
		System.out.println("\n-----------------------------------------------------\n");

		Collections.sort(listaFilmes);
		for (Film film : listaFilmes) {
			System.out.println(film);
		}
		System.out.println("\n-----------------------------------------------------\n");

		List<People> listaPeople = new ArrayList<People>(Arrays.asList(ana,pedro,jose,joao,miguel));

		for (People people : listaPeople) {
			System.out.println(people);
		}

		System.out.println("\n-----------------------------------------------------\n");
		HashMap<Film, Integer> ratingsUser1 = new HashMap<Film, Integer>();
		ratingsUser1.put(film1, 7);
		ratingsUser1.put(film2, 5);
		ratingsUser1.put(film3, 9);
		ratingsUser1.put(film4, 4);
		ratingsUser1.put(film5, 8);
		User user1 = new User("Emanuel", "Morais", 23, ratingsUser1, Arrays.asList(film1, film2, film3, film4, film5),
				"EJlmorais");

		try {
			System.out.println(user1.getAverageRating());
		} catch (NoRatedFilmsException e) {
			e.printStackTrace();
		}

		System.out.println("\n-----------------------------------------------------\n");
		ArrayList<Actor> listaActores = new ArrayList<Actor>(Arrays.asList(ana,pedro,jose,joao,miguel));
		ArrayList<Actor> listaActoresOscar = new ArrayList<Actor>();

		for (int i = 0; i < listaActores.size(); i++) {
			if ((listaActores.get(i).getOscarNominations().size()) > 0) {
				listaActoresOscar.add(listaActores.get(i));
			}
		}

		for(Actor actor: listaActoresOscar) {
			System.out.println(actor+"\n");
		}
	}

}
/*
 * Ejercicio 1. Class People:
 * 
 * Crear un nuevo Java Project con una clase Main Crear la class People con los
 * atributos: -name y surname de tipo String -age de tipo Integer Crear los
 * metodos getters y Setters para la clase persona Crear un constructor vacío y
 * otro con todos los parámetros
 * 
 * 
 * Ejercicio 2. Subclass de people y Film: Crear las classes Actor, Director y
 * User y que extiendan de People Añadir a Actor un atributo lista de Enteros
 * con llamada oscarNominations con los años que fue nominado a los oscars Crear
 * un Enumerado TipoActor con los valores (Main, Supporting, Stuntman) y
 * añadirlo a la clase Actor como atributo
 * 
 * En la clase Director añadir los atributos ProductionCompany (String) y
 * Filmography (lista de String)
 *******************************************************
 * 
 * 
 * Crear una Interface IFilm con los siguientes métodos: -toString() (String)
 * -getQualityString() método que retorna un String y sin input Crear una clase
 * Film con los atributos y que extienda a IFilm: -title (String) -year
 * (Integer) -quality (Integer) -director (Director) -cast (Lista de Actors)
 * -filmType (Enumerado con los valores Commedy, Thriller, Cartoon y Drama)
 * -getQualityString usando switch case devolver un string segun el atibuto
 * quality (REALLY BAD: entre 0 y 2, BAD (entre 2.1 y 4), NORMAL (entre 4.1 y
 * 6), GOOD (Entre 6.1 y 8), EXCELENT(entre 8.1 y 10)) según un atributo quality
 * (Integer) -toString() Retornar string con el formato [Title – Year –
 * getQuality (quality)]
 ****************************************************************************
 * Crear un interface IUsuario que tenga un método getAverageRating que retorne
 * un Double y no tenga parámetros de entrada
 * 
 * Hacer que la clase User implementar de IUser. Y añadir los atributos en las
 * class User: - ratings (Mapa con key Film y value Integer) - watchedFilms
 * (Lista de Film) - username (String) Implementar el método getAverageRating en
 * la class User: -El método debe calcular la media de todas las pelicular
 * evaluadas por el usuario. Si no ha evaluado ninguna tiene que lanzar (throw)
 * una exception del tipo NoRatedFilmsException Sobrescribir (Override) el
 * método equals y hashcode de User (Dos users son iguales si tienen el mismo
 * username) En la clase main, crear una lista de 5 Films y hacer un
 * System.out.println en un for extendido para imprimir cada uno de los
 * elementos de la collection En la class Film extender de Comparable para poder
 * usar el método compareTo. Para comparar dos Films hay que usar el atributo
 * quality (en caso de empate usar year) Probar a ordenar la lista de películas
 * anterior e imprimir por pantalla Crear en la class Main una lista de People y
 * añadir Users, Directors y Actors. En la class People extender de Comparable
 * para ordenar por age. Intentar ordenar la lista y mostrar por pantalla.
 * -------------------------------- - Crear una class Billboard con un atributo
 * de tipo LinkedList de Film llamado filmBillBoard - Crear un Getter pero NO el
 * setter - Crear un constructor vacio que inicialize el atributo filmBillBoard
 * vacío - Crear una interface IBillBoard con los siguientes métodos: toString()
 * retorna String getBestFilm() retorna Film addFilm(Film) retorna Boolean
 * removeOldFilm() retorna Film - En la Class Billboard, implementar IBillboard
 * y completar los métodos toString() -> Retornar String con la lista de Films
 * como String getBestFilm() retorna el Film con mejor quality addFilm(Film)
 * retorna Boolean: - Comprueba si filmBillBoard tiene un size mayor que 5, si
 * no lo tiene podrá añadir un Film y devuelve True, en otro caso devuelve
 * False. removeOldFilm() retorna Film - Remove el Film que lleva más tiempo en
 * el Billboard y lo retorna - En la Class Main crear una lista de Actors de al
 * menos 5 elementos y intentar crear un loop que añada a otra List los actores
 * que han sido nominados a un Oscar.
 */
