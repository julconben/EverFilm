package com.everis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * EVERFILM
 * 
 * author: Diana Nogueira
 *
 */
public class Main {
    public static void main(String[] args) {

    	
    	//film names lists to use for director****************************************************************************************************************
    	List<String> listFilms1 = new ArrayList<String>();
    	listFilms1.add("Shawshank Redemption");
    	listFilms1.add("The Godfather");
    	listFilms1.add("Nemo");
    	listFilms1.add("Pocahontas");
    	
    	List<String> listFilms2 = new ArrayList<String>();
    	listFilms2.add("Maleficent");
    	listFilms2.add("Lion King");
    	listFilms2.add("Once Upon a Time");
    	listFilms2.add("Pokemon");
    	listFilms2.add("Barbie");
    	
    	//Directores ******************************************************************************************************************************************
    	Director director1 = new Director("Frank", "Darabout", 85, "Disney", listFilms1); //Diretor
    	Director director2= new Director("James", "Cameron", 50, "21 century Fox", listFilms2); //Diretor
    	
    	//Oscar lists******************************************************************************************************************************************
    	List<Integer> oscars1 = new ArrayList<Integer>(); //simulate 'random' oscar nominations
    	for(int i=0; i<5; i++)
    		oscars1.add(1991+i);
    	
    	List<Integer> oscars2 = new ArrayList<Integer>(); //simulate 'random'  oscar nominations
    	for(int i=0; i<5; i++)
    		oscars2.add(1978+(i*2));
    		
    	List<Integer> oscars3 = new ArrayList<Integer>(); //simulate 'random'  oscar nominations
    	for(int i=0; i<5; i++)
    		oscars3.add(1950+(i+3));
    	
    	//Actors**********************************************************************************************************************************************
    	Actor actor1 = new Actor("Morgan","Freeman", 70, oscars3, com.everis.ActorType.MAIN); //actor morgan
    	Actor actor2 = new Actor("Tim", "Robbins", 69, oscars2, com.everis.ActorType.SUPPORTING); //actor tim
    	Actor actor3 = new Actor("Mary","Fields", 20, oscars1, com.everis.ActorType.STUNTMAN); //actress mary
    	Actor actor4 = new Actor("Anne", "Hattaway", 35, oscars2, com.everis.ActorType.SUPPORTING); //actress anne
    	
    	//List of actors***************************************************************************************************************************************
    	List<Actor> act1 = new ArrayList<Actor>();
    	act1.add(actor1);
    	act1.add(actor2);
    	act1.add(actor3);    	
    	act1.add(actor4);
    	
    	List<Actor> act2 = new ArrayList<Actor>();
    	act2.add(actor1);
    	act2.add(actor2);
    	
    	List<Actor> act3 = new ArrayList<Actor>();
    	act3.add(actor4);
    	act3.add(actor3);
    	act3.add(actor1);
    	
    	//Films**********************************************************************************************************************************************
        Film film1 = new Film("The Shawshank Redemption", 1994, 1, director1 , act1, com.everis.FilmType.DRAMA);
        Film film2 = new Film("The Godfather", 1996, 2, director2 , act2, com.everis.FilmType.DRAMA);
        Film film3 = new Film("The Ring", 2019, 3, director1 , act3, com.everis.FilmType.THRILLER);
        Film film4 = new Film("Nemo", 2005, 4, director2 , act2, com.everis.FilmType.CARTOON);
        Film film5 = new Film("Pocahontas", 1998, 5, director1 , act3, com.everis.FilmType.CARTOON);
        Film film6 = new Film("Maleficent", 2015, 6, director2 , act3, com.everis.FilmType.DRAMA);        
        Film film7 = new Film("Lion King", 1995, 7, director1 , act1, com.everis.FilmType.COMMEDY);        
        Film film8 = new Film("Pokemon", 1999, 8, director2 , act1, com.everis.FilmType.CARTOON);
        Film film9 = new Film("Barbie", 1990, 9, director1 , act2, com.everis.FilmType.CARTOON);
        Film film10 = new Film("Once Upon a Time", 2018, 10, director2 , act1, com.everis.FilmType.COMMEDY);
        
        //Ratings*******************************************************************************************************************************************
        HashMap<String, Integer> ratings1 = new HashMap<String, Integer>();
        ratings1.put("The Goodfather", 10);
        ratings1.put("Lion King", 5);
        ratings1.put("Pokemon", 4);
        ratings1.put("Once Upon a Time", 8);
        
        HashMap<String, Integer> ratings2 = new HashMap<String, Integer>();
        
        ratings1.put("The Goodfather", 8);
        ratings1.put("Nemo", 10);
        ratings1.put("Lion King", 7);
        ratings1.put("Pokemon", 1);
        ratings1.put("Once Upon a Time", 10);
        
        //watchedFilms*************************************************************************************************************************************
        List<Film> films1 = new ArrayList<Film>();
        films1.add(film10);
        films1.add(film1);
        films1.add(film4);
        films1.add(film6);
        films1.add(film8);
        
        List<Film> films2 = new ArrayList<Film>();
        films2.add(film1);
        films2.add(film7);
        films2.add(film4);
        films2.add(film9);
        
               
        //Users*********************************************************************************************************************************************
        User user1 = new User("Xana", "Goncalves", 45, "", ratings1, films1);
        User user2 = new User("Luis", "Lopes", 50, "", ratings2, films2);

        System.out.println(user1.getAverageRating());
        
//        /** TESTE GETSTRING*/
//        System.out.println(film1.toString());
//        System.out.println(film3.toString());
//        System.out.println(film5.toString());
//        System.out.println(film7.toString());
        
//        /** TESTE GETQUALITY*/
//        System.out.println(film1.getQualityString());
//        System.out.println(film4.getQualityString());
//        System.out.println(film6.getQualityString());
//        System.out.println(film8.getQualityString());
//        System.out.println(film10.getQualityString());
        
        

        
    }
}
