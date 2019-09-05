package com.everis;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Billboard implements IBillBoard{
	
	private List<Film> filmBillBoard;
	
	public Billboard() {
		filmBillBoard = new LinkedList<Film>();
	}

	public List getFilmBillBoard() {
		return filmBillBoard;
	}

	@Override
	public Film getBestFilm() {
		Film bestMovie = new Film();
		for (Film film : filmBillBoard) {
			if(bestMovie.compareTo(film)==1) bestMovie=film;
		}
        return bestMovie;
	}

	@Override
	public Boolean addFilm(Film film) {
		if(filmBillBoard.size() > 4) return false;
		filmBillBoard.add(film); return true;
	}

	@Override
	public Film removeOldFilm() {
		Film old = new Film();
		for (Film film : filmBillBoard) {
			old = film.getYear() > old.getYear() ? film : old;
		}
		filmBillBoard.remove(old);
		return old;
	}

	@Override
	public String toString() {
		return "Billboard [filmBillBoard=" + filmBillBoard.toString() + "]";
	}

}
