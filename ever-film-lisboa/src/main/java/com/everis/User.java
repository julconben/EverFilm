package com.everis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User extends Pessoa implements IUser {
	private Map<Filme, Integer> ratings = new HashMap<Filme, Integer>();
	private List<Filme> watchedFilm = new ArrayList<Filme>();
	private String username;

	public Map<Filme, Integer> getRatings() {
		return ratings;
	}

	public void setRatings(Map<Filme, Integer> ratings) {
		this.ratings = ratings;
	}

	public List<Filme> getWatchedFilm() {
		return watchedFilm;
	}

	public void setWatchedFilm(List<Filme> watchedFilm) {
		this.watchedFilm = watchedFilm;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public User(String nome, String apelido, Integer idade, Map<Filme, Integer> ratings, List<Filme> watchedFilm,
			String username) {
		super(nome, apelido, idade);
		this.ratings = ratings;
		this.watchedFilm = watchedFilm;
		this.username = username;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		User other = (User) obj;
		if (other.getUsername() == this.username) {
			return true;
		} else {
			return false;
		}
	}

	public double getAverageRating() throws NoRatedFilmsException {
		int contador = 0;
		if (ratings.size() == 0) {
			throw new NoRatedFilmsException();
		} else {
			for (Integer ratingFilm : ratings.values()) {
				contador += ratingFilm;

			}
			return ((double) contador) / ratings.size();
		}
	}

	@Override
	public String toString() {
		return "User [Ratings=" + ratings + ", Filmes Visto=" + watchedFilm + ", Username=" + username + ", Nome="
				+ getNome() + ", Apelido=" + getApelido() + ", Idade()=" + getIdade() + "]";
	}

}
