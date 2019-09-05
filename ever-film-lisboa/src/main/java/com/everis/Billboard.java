package com.everis;

import java.util.ArrayList;
import java.util.LinkedList;

public class Billboard {
	LinkedList<Filme> filmeBillboard = new LinkedList<Filme>();

	public LinkedList<Filme> getFilmeBillboard() {
		return filmeBillboard;
	}

	public Billboard() {

	}

	public Filme getBestFilm() {
		int tempClassif = 0;
		Filme melhorFilm = null;
		for (Filme filme : filmeBillboard) {
			if (filme.getQualidade() > tempClassif) {
				tempClassif = filme.getQualidade();
				melhorFilm = filme;
			}
		}
		return melhorFilm;
	}

	public Boolean addFilm() {
		if (filmeBillboard.size() > 5) {
			return true;
		} else {
			return false;

		}
	}

	public Filme removeOldFilm() {
		return filmeBillboard.remove(0);

	}

	@Override
	public String toString() {
		return "Billboard [FilmeBillboard=" + filmeBillboard + "]";
	}

}
