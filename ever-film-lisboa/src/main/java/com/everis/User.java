package com.everis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User extends People implements IUser{
	
	String userName;
	HashMap<String, Integer> ratings = new HashMap<String, Integer>();
	List<Film> watchedFilms = new ArrayList<Film>();
	
	public User(String userName) {
		super();
		this.userName = userName;
	}

	public User(String firstName, String surName, int age, String userName) {
		super(firstName, surName, age);
		this.userName = userName;
	}
	
	public User(String firstName, String surName, int age, String userName, HashMap<String, Integer> ratings, List<Film> watchedFilms) {
		super(firstName, surName, age);
		this.userName = userName;
		this.ratings = ratings;
		this.watchedFilms = watchedFilms;
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
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	public double getAverageRating() throws NoRatedFilmsException { //TODO NO RATED FILM EXCEPTION
		
		List<Integer> rat = new ArrayList<Integer>(ratings.values());
		double totalRating = 0;
		int i;
		
		if (ratings.size() == 0) {
			throw new NoRatedFilmsException();
		}
		else {
		
		for (i=0; i < ratings.size(); i++) {
			totalRating = totalRating + rat.get(i);
		}
		
		return totalRating/i;
	}}
	
	

}
