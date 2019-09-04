package com.everis;


public class Film implements IFilm {
	public String title;
	public Integer year;
	public static Integer quality;
	public Director director;
	public ListadeActors cast;
	private FilmType tipoFilme;
	

	public void getQualityString(String args[]) {
		switch (quality) {
		case 0:
		case 1:
		case 2:
			System.out.println("REALLY BAD");
			break;
		case 3:
		case 4:
			System.out.println("BAD");
			break;
		case 5:
		case 6:
			System.out.println("NORMAL");
			break;
		case 7:
		case 8:
			System.out.println("GOOD");
			break;
		case 9:
		case 10:
			System.out.println("EXCELENT");
			break;
		default:
			System.out.println("Invalid");
			break;
		}
	}

	public FilmType getTipoFilme() {
		return tipoFilme;
	}


	public void setTipoFilme(FilmType tipoFilme) {
		this.tipoFilme = tipoFilme;
	}

	public void getQualityString() {
		// TODO Auto-generated method stub
		
	}
}
