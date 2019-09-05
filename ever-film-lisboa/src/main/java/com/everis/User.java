package com.everis;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class User extends People implements IUser {

	private String username;

	private Map<Film, Integer> ratings;

	private List<Film> watchedFilms;

	public User() {
		super();
	}

	public User(String name, String surname, int age, String username, Map<Film, Integer> ratings,
			List<Film> watchedFilms) {
		super(name, surname, age);
		this.username = username;
		this.ratings = ratings;
		this.watchedFilms = watchedFilms;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
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

	// Calcular média do todos os filmes avaliados pelos utilizadores
	public double getAverageRating() throws NoRatedFilmsException {

		if (ratings.isEmpty() || ratings == null)
			throw new NoRatedFilmsException("NUESTRA EXCEPTION", "Zero film rated");
		double sum = 0;
		
		for (Integer value : ratings.values()) {
			sum += value;
		}
		return sum / ratings.size();
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
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
}
