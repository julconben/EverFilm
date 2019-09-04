package Exercicio5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import Exercicio3.Film;

public class Billboard implements IBillboard {

	List<Film> filmBillboard = new LinkedList<Film>();

	public List<Film> getFilmBillboard() {
		return filmBillboard;
	}

	public Billboard() {
		super();
	}

	public Film getBestFilm() {
		int tempRating = 0;
		Film bestFilm = null;
		for (Film film : filmBillboard) {
			if (film.getQuality() > tempRating) {
				tempRating = film.getQuality();
				bestFilm = film;
			}
		}

		return bestFilm;
	}

	public Boolean addFilm() {
		if (filmBillboard.size() < 5) {
			return true;
		} else
			return false;
	}

	public Film removeOldFilm() {
		return filmBillboard.remove(0);
	}

	@Override
	public String toString() {
		return Arrays.toString(filmBillboard.toArray());
	}

}
