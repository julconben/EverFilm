package com.everis;

import java.util.*;

public class Billboard {
	
	private List<Film> filmBillboard;
	
	public String getBillboard() {
		return filmBillboard.toString();
	}

	public Billboard(LinkedList<Film> filmBillboard) {
		super();
		this.filmBillboard = filmBillboard;
	}
	public Billboard() {
		super();
		this.filmBillboard = new LinkedList();
	}
	
	public String toString() {
		return "oi";
	}
	public Film getBestFilm() {
		return filmBillboard.get(0);
	}
	public boolean addFilm(Film movie) {
		return true;
	}
	public Film removeOldFilm() {
		return filmBillboard.remove(-1);
	}
	
}
