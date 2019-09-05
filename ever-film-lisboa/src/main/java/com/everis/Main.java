package com.everis;


import java.util.*;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main(String[] args) throws NoRatedFilmsException {
    	HashMap<Film, Integer> rates = new HashMap<Film, Integer>();
    	List<Film> vistos= new ArrayList<Film>();
    	Film mov1 = new Film();
    	Film mov2 = new Film();
    	rates.put(mov1	, 8);
    	
        User user1 = new User("Manuel", "Lopes", 24, rates, vistos, "manelopes");
        
        user1.getAverageRating();   //media do ratings
       // this.diretor = new Director();
		//Actor act1 = new Actor();
	//	this.cast.add(act1);
		
    }
}
