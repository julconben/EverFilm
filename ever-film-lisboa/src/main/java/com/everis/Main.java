package com.everis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * EVERFILM
 * 
 * author: Diana Nogueira
 *
 */
public class Main {
    public static void main(String[] args) {
    	
    	List<String> listFilms1 = new ArrayList<String>();
    	List<Actor> allActors = new ArrayList<Actor>();    	
    	List<Integer> oscars0 = new ArrayList<Integer>();
    	List<Integer> oscars1 = new ArrayList<Integer>();
    	List<Integer> oscars2 = new ArrayList<Integer>(); 
    	List<Integer> oscars3 = new ArrayList<Integer>();    	
    	List<Actor> act1 = new ArrayList<Actor>();
    	List<Actor> act2 = new ArrayList<Actor>();
    	List<Actor> act3 = new ArrayList<Actor>();
        List<Film> films1 = new ArrayList<Film>();	
        List<Film> films2 = new ArrayList<Film>();	
        List<People> allPeople = new ArrayList<People>();
        
        HashMap<String, Integer> ratings1 = new HashMap<String, Integer>();       
        HashMap<String, Integer> ratings2 = new HashMap<String, Integer>();
    	List<String> listFilms2 = new ArrayList<String>();    	
    	List<Actor> actorsWithNoOscars = new ArrayList<Actor>();
        List<Film> allFilms = new ArrayList<Film>();    	
        Billboard bill = new Billboard();
        List b = new LinkedList<Film>();
    	
    	//random people **********************************************************************************************************************************************
    	People people1 = new People("Joao","Pedro", 15);
    	People people2 = new People("Maria","Silva", 35);
    	People people3 = new People("Antonia","Lopes", 52);
    	People people4 = new People("Pedro","Santos", 47);
	
    	//Actors**********************************************************************************************************************************************
    	Actor actor1 = new Actor("Morgan","Freeman", 70, oscars3, com.everis.ActorType.MAIN); //actor morgan
    	Actor actor2 = new Actor("Tim", "Robbins", 69, oscars2, com.everis.ActorType.SUPPORTING); //actor tim
    	Actor actor3 = new Actor("Mary","Fields", 20, oscars1, com.everis.ActorType.STUNTMAN); //actress mary
    	Actor actor4 = new Actor("Anne", "Hathaway", 35, oscars2, com.everis.ActorType.SUPPORTING); //actress anne
    	Actor actor5 = new Actor("Leonardo", "Dicaprio", 55, oscars0, com.everis.ActorType.MAIN); 
    	
    	//Directores ******************************************************************************************************************************************
    	Director director1 = new Director("james", "cameron", 50, "fox", listFilms1);
    	Director director2= new Director("john", "snow", 54, "disney", listFilms2);
    	
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
    	
    	//Lists of actors***************************************************************************************************************************************

    	act1.add(actor1);
    	act1.add(actor5);
    	act1.add(actor3);    	
    	act1.add(actor4);    	

    	act2.add(actor1);
    	act2.add(actor2);  
    	
    	act3.add(actor4);
    	act3.add(actor5);
    	act3.add(actor1);

        films1.add(film10);	      
        films1.add(film1);	    
        films1.add(film4);	     
        films1.add(film6);	    
        films1.add(film8);	   
        	        
       
        films2.add(film1);	        
        films2.add(film7);	        
        films2.add(film4);	       
        films2.add(film9);
        
    	//film names lists to use for director****************************************************************************************************************
    	
    	listFilms1.add(film1.title);
    	listFilms1.add(film2.title);
    	listFilms1.add(film3.title);
    	listFilms1.add(film4.title);  	
    	listFilms2.add(film1.title);
    	listFilms2.add(film5.title);
    	listFilms2.add(film2.title);
    	listFilms2.add(film9.title);
    	listFilms2.add(film10.title);

        //Ratings*******************************************************************************************************************************************

        ratings1.put("The Goodfather", 10);
        ratings1.put("Lion King", 5);
        ratings1.put("Pokemon", 4);
        ratings1.put("Once Upon a Time", 8);      
        ratings1.put("The Goodfather", 8);
        ratings1.put("Nemo", 10);
        ratings1.put("Lion King", 7);
        ratings1.put("Pokemon", 1);
        ratings1.put("Once Upon a Time", 10);
       
        //Users*********************************************************************************************************************************************
        
        User user1 = new User("Xana", "Goncalves", 45, "", ratings1, films1);
        User user2 = new User("Luis", "Lopes", 50, "", ratings2, films2);

    	//GENERATE PSEUDO-RAND OSCAR NOMINATIONS*****************************************************************************************************************
      	
    	for(int i=0; i<5; i++)
    		oscars1.add(1991+i);
    		    	    	
    	for(int i=0; i<5; i++)
    		oscars2.add(1978+(i*2));
    			    			    	
    	for(int i=0; i<5; i++)
    		oscars3.add(1950+(i+3));

    	actor1.setOscarNominations(oscars0);
    	actor3.setOscarNominations(oscars3);
    	actor2.setOscarNominations(oscars2);
    	actor4.setOscarNominations(oscars0);
    	actor5.setOscarNominations(oscars1);
  
    	//PUTS DATA ON LISTS************************************************************************************************************************************
        
    	allFilms.add(film1);
        allFilms.add(film2);
        allFilms.add(film4);
        allFilms.add(film5);
        allFilms.add(film3);
        
    	allActors.add(actor1);
    	allActors.add(actor2);
    	allActors.add(actor3);
    	allActors.add(actor4);
    	allActors.add(actor5); 
        
        allPeople.add(user2);
        allPeople.add(user1);
        allPeople.add(director1);
        allPeople.add(director2);
        allPeople.add(actor1);
        allPeople.add(actor2);
        allPeople.add(actor3);
        allPeople.add(people1);
        allPeople.add(people2);
        allPeople.add(people3);
        allPeople.add(people4);
        
        Collections.sort(allPeople);
         
        /**Gera Billboard*/

        b.add(film10);
        b.add(film1);
        b.add(film3);
        b.add(film4);
        bill.setBillboard(b);     
        bill.addFilm(film5);
        
        /** Prints list of all films, sorted by quality*/    
        
        Collections.sort(allFilms);
        for(int i=0; i<allFilms.size(); i++) 
        	System.out.println(allFilms.get(i).toString());
  
    	/**LISTA DE ACTORES SEM OSCARS*/

    	actorsWithNoOscars = actorsWithoutOscars(allActors);
    	
    	for(Actor a : actorsWithNoOscars)
    		System.out.println(a.firstName+" "+a.surName);
 
        /**TESTE removeOldFilm()*/
//        System.out.println(bill.toString());
//        bill.removeOldFilm();
//        System.out.println(bill.toString());
        
       /**teste getAverageRating()*/
//       System.out.println(user1.getAverageRating());
        
//        /** TESTE GETSTRING*/
//        System.out.println(film1.toString());
//        System.out.println(film3.toString());
//        System.out.println(film5.toString());
//        System.out.println(film7.toString());
        
       /** TESTE GETQUALITY*/
//        System.out.println(film1.getQualityString());
//        System.out.println(film4.getQualityString());
//        System.out.println(film6.getQualityString());
//        System.out.println(film8.getQualityString());
//        System.out.println(film10.getQualityString());
        
        

        
}
    
	private static List<Actor> actorsWithoutOscars(List<Actor> allActors) {
		List<Actor> failedActors = new ArrayList<Actor>();
		
		for(Actor a: allActors) {
			if (a.oscarNominations.isEmpty())
				failedActors.add(a);
		}
		return failedActors;		
	}


}
