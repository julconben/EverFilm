package com.everis;
import java.util.ArrayList;
import java.util.List;

public class Ator extends Pessoa  {

	private List<Integer> oscarNominations = new ArrayList<Integer>();
	private TipoAtor tipo;

	public List<Integer> getOscarNominations() {
		return oscarNominations;
	}

	public void setOscarNominations(List<Integer> oscarNominations) {
		this.oscarNominations = oscarNominations;
	}

	public TipoAtor getTipo() {
		return tipo;
	}

	public void setTipo(TipoAtor tipo) {
		this.tipo = tipo;
	}

	public Ator() {
		super();
	}
	
	public Ator(String nome,String apelido,Integer idade, TipoAtor tipo) {
		super(nome,apelido,idade);
		this.tipo = tipo;
	}
	
	public Ator(String nome,String apelido,Integer idade, TipoAtor tipo,List<Integer> oscarNominations) {
		super(nome,apelido,idade);
		this.tipo = tipo;
		//Instancia e o que mandar da instaciação manda para o oscarNominations
		this.oscarNominations = oscarNominations;
	}

	public int compareTo(Ator otherAtor) {
		return getIdade().compareTo(otherAtor.getIdade());
			
	}
	
	@Override
	public String toString() {
		return "Ator [getOscarNominations()=" + getOscarNominations() + ", getTipo()=" + getTipo() + ", getNome()="
				+ getNome() + ", getApelido()=" + getApelido() + "]";
	}

	

	
	
	
	
}
