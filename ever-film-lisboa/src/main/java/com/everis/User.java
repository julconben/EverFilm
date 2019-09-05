package com.everis;

import java.util.*;
import java.util.Map.Entry;

public class User extends People implements IUser {
	private Map<Film, Integer> ratings;
	private List<Film> watchedFilms;
	private String username;
	
	public User() {
		super();
		this.username = "laura123";
		
		
	}

	public User(String name, String surname, Integer age, Map<Film, Integer> ratings, List<Film> watchedFilms, String username) {
		super(name, surname, age);
		this.ratings=ratings;
		this.watchedFilms=watchedFilms;
		this.username=username;
		
		
		// TODO Auto-generated constructor stub
	}
	
	public Map<Film, Integer> getRatings() {
		
		return ratings;
	}
	
	public double getAverageRating() throws NoRatedFilmsException{
		double sum = 0;
		int count = 0;
		if(this.getRatings().keySet().isEmpty()) {
			throw new NoRatedFilmsException("No hay ratings");
		}else {
			for(Entry<Film, Integer> e : ratings.entrySet()) {
		        Integer rate = e.getValue();
		        sum += rate;
		        count++;
		        System.out.println("rate "+rate+", sum "+sum+", count "+count);
		    }
			double media = sum/count;
			System.out.println("A media de ratings e "+media);
			return media;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ratings == null) ? 0 : ratings.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		result = prime * result + ((watchedFilms == null) ? 0 : watchedFilms.hashCode());
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
		if (ratings == null) {
			if (other.ratings != null)
				return false;
		} else if (!ratings.equals(other.ratings))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		if (watchedFilms == null) {
			if (other.watchedFilms != null)
				return false;
		} else if (!watchedFilms.equals(other.watchedFilms))
			return false;
		return true;
	}

}
