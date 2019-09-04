package com.everis;

import java.util.HashMap;
import java.util.List;


public class User extends People implements IUsuario {

    private HashMap<Film, Integer> ratings;
    private List<String> watchedFilms;
    private String username;
	public double getAverageRating() {
		// TODO Auto-generated method stub
		return 0;
	}

	public HashMap<Film, Integer> getRatings() {
		return ratings;
	}

	public void setRatings(HashMap<Film, Integer> ratings) {
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
	

