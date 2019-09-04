package com.everis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User extends People implements IUser{
	
	String userName;
	HashMap<String, Integer> ratings = new HashMap<String, Integer>();
	List<Film> watchedFilms = new ArrayList<Film>();
		
	public User() {
		super();
	}
	public User(String firstName, String surName, int age) {
		super(firstName, surName, age);
	}

	public User(String firstName, String surName, int age, String userName) {
		super(firstName, surName, age);
		this.userName = userName;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public HashMap<String, Integer> getRatings() {
		return ratings;
	}
	public void setRatings(HashMap<String, Integer> ratings) {
		this.ratings = ratings;
	}
	public List<Film> getWatchedFilms() {
		return watchedFilms;
	}
	public void setWatchedFilms(List<Film> watchedFilms) {
		this.watchedFilms = watchedFilms;
	}
	public double getAverageRating() {
		
		List<Integer> rat = (List<Integer>) ratings.values();
		double totalRating = 0;
		
		for (int i=0; i < ratings.size(); i++) {
			totalRating =+ rat.get(i);
		}
		
		return totalRating/ratings.size();
	}

}
