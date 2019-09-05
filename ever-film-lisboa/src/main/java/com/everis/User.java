package com.everis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User extends People implements IUsuario {

	private Map<Film, Integer> ratings = new HashMap<Film, Integer>();
	private List<Film> WatchedFilms;
	private String username;

	public User(String name, String surname, Integer age, Map<Film, Integer> ratings, List<Film> watchedFilms,
			String username) {
		super(name, surname, age);
		this.ratings = ratings;
		WatchedFilms = watchedFilms;
		this.username = username;
	}

	public Map<Film, Integer> getRatings() {
		return ratings;
	}

	public void setRatings(Map<Film, Integer> ratings) {
		this.ratings = ratings;
	}

	public void setRatings(HashMap<Film, Integer> ratings) {
		this.ratings = ratings;
	}

	public List<Film> getWatchedFilms() {
		return WatchedFilms;
	}

	public void setWatchedFilms(List<Film> watchedFilms) {
		WatchedFilms = watchedFilms;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public double getAverageRating() throws NoRatingFilmsException {
		int contador = 0;
		if (ratings.size() == 0) {
			throw new NoRatingFilmsException();
		} else {
			for (Integer filmRating : ratings.values()) {
				contador += filmRating;
			}
			return ((double) contador) / ratings.size();
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		User other = (User) obj;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
}