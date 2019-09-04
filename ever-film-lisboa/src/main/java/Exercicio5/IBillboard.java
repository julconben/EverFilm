package Exercicio5;

import Exercicio3.Film;

public interface IBillboard {

	String toString();

	Film getBestFilm();
	
	Boolean addFilm();

	Film removeOldFilm();

}
