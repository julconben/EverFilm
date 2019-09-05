package com.everis;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class User extends People implements IUsuer {

    private Map<Film,Integer> ratings = new HashMap<Film, Integer>();
    private List<Film> watchedFilms = new ArrayList<Film>();
    private String username;
    
  
    
    public User(String name, String surname, Integer age, Map<Film, Integer> ratings, List<Film> watchedFilms,
			String username) {
		super(name, surname, age);
		this.ratings = ratings;
		this.watchedFilms = watchedFilms;
		this.username = username;
	}



	public Map<Film, Integer> getRatings() {
		return ratings;
	}



	public void setRatings(Map<Film, Integer> ratings) {
		this.ratings = ratings;
	}



	public List<Film> getWatchedFilms() {
		return watchedFilms;
	}



	public void setWatchedFilms(List<Film> watchedFilms) {
		this.watchedFilms = watchedFilms;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public double getAverageRating() throws NoRatedFilmsException {
    	int contador = 0;
		if (ratings.size() == 0) {
			throw new NoRatedFilmsException();
		} else {

			for (Integer filmRating : ratings.values()) {
				contador += filmRating;
			}
			return  ((double)contador) / ratings.size();
		}
	}



	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + username.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object otherUser) {
		if (this.username.contentEquals((CharSequence) ((User) otherUser).getUsername())) {
			return true;
		} else
			return false;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "\n" + super.toString();
	}



    
	}

