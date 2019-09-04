package com.everis;

import java.util.Map;
import java.util.HashMap;
import java.util.List;


public class User extends People implements IUsuario {

    private HashMap<String,Integer> ratings;
    private List<String> watchedFilms;
    private String username;
    
    public void testRatings(String args[]) {

    	ratings = new HashMap<String,Integer>();
    	
    	ratings.put("A",1);
    	ratings.put("A",2);
    	ratings.put("A",3);
    }
    
	public double getAverageRating() {
		// TODO Auto-generated method stub
		return 0;
	}

	public HashMap<String,Integer> getRatings() {
		return ratings;
	}

	public void setRatings(HashMap<String, Integer> ratings) {
		this.ratings = ratings;
	}

	public List<String> getWatchedFilms() {
		return watchedFilms;
	}

	public void setWatchedFilms(List<String> watchedFilms) {
		this.watchedFilms = watchedFilms;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	}
	

