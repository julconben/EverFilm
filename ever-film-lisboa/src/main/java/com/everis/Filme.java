package com.everis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Filme implements Comparable<Filme>, IFilm {
	private String titulo;
	private Integer ano;
	private Integer qualidade;
	private Diretor diretor;
	private List<Ator> cast;
	private TipoFilme tipo;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Integer getQualidade() {
		return qualidade;
	}

	public void setQualidade(int qualidade) {
		this.qualidade = qualidade;
	}

	public Diretor getDiretor() {
		return diretor;
	}

	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}

	public List<Ator> getCast() {
		return cast;
	}

	public void setCast(List<Ator> cast) {
		this.cast = cast;
	}

	public TipoFilme getTipo() {
		return tipo;
	}

	public void setTipo(TipoFilme tipo) {
		this.tipo = tipo;
	}

	public Filme() {
		super();
	}

	public Filme(String titulo, Integer ano, Integer qualidade, Diretor diretor, List<Ator> cast, TipoFilme tipo) {
		super();
		this.titulo = titulo;
		this.ano = ano;
		this.qualidade = qualidade;
		this.diretor = diretor;
		this.cast = new ArrayList<Ator>();
		this.tipo = tipo;
	}

	public String getQuality(Integer qualidade) {
		switch (qualidade) {
		case 0:

		case 1:
			return "Really Bad";
		case 2:

		case 3:
			return "Bad";
		case 4:
			break;
		case 5:
		case 6:
			return "NORMAL";
		case 7:
		case 8:
			return "GOOD";
		case 9:
		case 10:
			return "EXCELENT";
		}
		return "Não Dá";
	}

	public String getQualityString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Filme [titulo=" + getTitulo() + ", ano=" + getAno() + "Qualidade= " + getQuality(qualidade) + "]";
	}

	public int compareTo(Filme otherFilm) {
		if (this.getQualidade()==otherFilm.getQualidade()) {
			return this.getAno().compareTo(otherFilm.getAno());
		} else {
			return this.qualidade.compareTo(otherFilm.qualidade);
		}			
}
}
