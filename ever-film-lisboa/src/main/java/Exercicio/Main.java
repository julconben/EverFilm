package Exercicio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Exercicio2.Actor;
import Exercicio2.Director;
import Exercicio2.TipoActor;

public class Main {

	public static void main(String[] args) {
		
		
		List<Integer> oscarNominations1 = new ArrayList<Integer>( Arrays.asList(2005, 2007));
		People ator1 = new Actor("Joao", "Rafael", 23, TipoActor.MAIN, oscarNominations1);
		
		List<String> filmography1 = new ArrayList<String>( Arrays.asList("The Matrix", "Fantastic Beasts"));
		People diretor1 = new Director("Joao", "Anjos", 20, "Warner Bros", filmography1);
		System.out.println(ator1);
		System.out.println("-------------------------");
		System.out.println(diretor1);
	}

}
