package com.everis;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Billboard implements IBillboard {

	List<Film> billboard;
	private Iterator<Film> itFilm;
	
	public Billboard() {
		billboard = new LinkedList<Film>();
		itFilm = billboard.iterator();
	}

	public void setBillboard(List<Film> billboard) {
		
		this.billboard = billboard;
		this.itFilm = this.billboard.iterator();
	}

	public Film getBestFilm() {
		
		Integer maxQuality = 0;
		Film bestFilm = new Film();
		
		while(itFilm.hasNext()) {
		/*I assume, based on the exercise, since we only return ONE movie, 
		 * that we will return the first we find with the maxQuality.
		 * If we wanted to return more, we would need a different return type on the function*/		
		
			if(maxQuality < itFilm.next().quality) {
				bestFilm = itFilm.next();
				maxQuality =  itFilm.next().quality; //TODO not happy about this yet
			}
		}
		return bestFilm;
	}

	public Boolean addFilm(Film f) {
		
		if (billboard.size()<5)
			return billboard.add(f);
		
		return false;
	}

	public Film removeOldFilm() {	
		
		
		return  billboard.remove(0);
	}
	
	@Override
	public String toString() {
		
		String aux = new String();
		String s = new String();
		
		for(Film f: billboard) {
			aux = f.toString();
			s = s.concat(aux);	
		}
		
		
		
		return s;
	}

}
