package com.everis;

import java.util.*;

public class User extends People implements IUser {
	private HashMap<Film, Integer> ratings;
	private List<Film> watchedFilms;
	private String username;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String name, String surname, Integer age) {
		super(name, surname, age);
		this.username = "laura123";
		
		// TODO Auto-generated constructor stub
	}
	
	public Object getRatings() {
		
		return ratings;
	}
	
	public double getAverageRating() {
		int sum = 0;
		for (Map.Entry<Film, Integer> i : ratings.entrySet) {
			
			sum += ;
		}
		double media = sum/ratingsArray.length;
		System.out.println("A media dos ratings é "+ media);
		return (media);
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
