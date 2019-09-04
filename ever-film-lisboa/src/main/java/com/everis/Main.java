package com.everis;

public class Main{
}
/*
Ejercicio 1. Class People:

*Crear un nuevo Java Project con una clase Main
*Crear la class People con los atributos:
	-name y surname de tipo String
	-age de tipo Integer
*Crear los metodos getters y Setters para la clase persona
*Crear un constructor vacío y otro con todos los parámetros


Ejercicio 2. Subclass de people y Film:
*Crear las classes Actor, Director y User y que extiendan de People
*Añadir a Actor un atributo lista de Enteros con llamada oscarNominations
	con los años que fue nominado a los oscars
*Crear un Enumerado TipoActor con los valores (Main, Supporting, Stuntman) 
	y añadirlo a la clase Actor como atributo

*En la clase Director añadir los atributos ProductionCompany (String) 
y Filmography  (lista de String)

*******************************************************

*Crear una Interface IFilm con los siguientes métodos:
	-toString() (String)
	-getQualityString()  método que retorna un String y sin input 
*Crear una clase Film con los atributos y que extienda a IFilm:
	-title (String)
	-year (Integer)
	-quality (Integer)
	-director (Director)
	-cast (Lista de Actors)
	-filmType (Enumerado con los valores Commedy, Thriller, Cartoon y Drama)
	-getQualityString  usando switch case devolver un string segun el atibuto quality (REALLY BAD: entre 0 y 2, BAD (entre 2.1 y 4), NORMAL (entre 4.1 y 6), 
GOOD (Entre 6.1 y 8), EXCELENT(entre 8.1 y 10)) según un atributo quality (Integer)
	-toString()  Retornar string con el formato [Title – Year – getQuality (quality)]
****************************************************************************
*Crear un interface IUsuario que tenga un método getAverageRating que retorne un Double y no tenga parámetros de entrada

*Hacer que la clase User implementar de IUser. Y añadir los atributos en las class User:
	-  ratings (Mapa con key Film y value Integer)
	- watchedFilms (Lista de Film)
	- username (String)
* Implementar el método getAverageRating en la class User:
	-El método debe calcular la media de todas las pelicular evaluadas por el usuario. Si no ha evaluado ninguna tiene que lanzar (throw) una exception 
  del tipo NoRatedFilmsException
*Sobrescribir (Override) el método equals y hashcode de User (Dos users son iguales si tienen el mismo username)
*En la clase main, crear una lista de 5 Films y hacer un System.out.println  en un for extendido para imprimir cada uno de los elementos de la collection
	En la class Film extender de Comparable para poder usar el método compareTo. Para comparar dos Films hay que usar el atributo quality (en caso de empate usar year)
Probar a ordenar la lista de películas anterior e imprimir por pantalla
Crear en la class Main una lista de People y añadir Users, Directors y Actors. En la class People extender de Comparable 
para ordenar por age. Intentar ordenar la lista y mostrar por pantalla.*/