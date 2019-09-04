package com.everis;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.List;


public class User extends People implements IUsuario {

    private HashMap<String,Integer> ratings;
    private List<String> watchedFilms;
    private String username;
    
    public void testRatings(String args[]) {
    	
    	for (Entry<String, Integer> entry : ratings.entrySet()) {
    	    String key = entry.getKey();
    	    Object value = entry.getValue();
    	}
    	
    
    }
    
    public double getAverageRating() {
		double averageRating = 0;
		if (ratings != null && !ratings.isEmpty()) {
			int entradas = ratings.values().size();
			double soma = 0;
			for (Integer value : ratings.values()) {
				soma = soma + value;
			}

			averageRating = soma / entradas;

		} else {
			// throw new NoRatedFilmsException();
		}
		return averageRating;
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
	

