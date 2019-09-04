package com.everis;

import java.util.Arrays;
import Exercicio.People;
import Exercicio2.Actor;
import Exercicio2.Director;
import Exercicio2.TipoActor;

public class Main {

	public static void main(String[] args) {
		
		People ator1 = new Actor("Joao", "Rafael", 23, TipoActor.MAIN, Arrays.asList(2005, 2007));
		
		People diretor1 = new Director("Joao", "Anjos", 20, "Warner Bros", Arrays.asList("The Matrix", "Fantastic Beasts"));
		System.out.println(ator1);
		System.out.println("-------------------------");
		System.out.println(diretor1);
	}

}