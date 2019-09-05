package com.everis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Diretor d1 = new Diretor("Joao", "Anjos", 12, "Almeirim Warner", Arrays.asList("Titanic", "Homens de negroe"));

		System.out.println(d1);

		Ator a1 = new Ator("Joao", "Anjos", 12, TipoAtor.MAIN, Arrays.asList(2010, 2011));
		System.out.println(a1.toString());

		Filme f1 = new Filme("Titanic", 2000, 1, d1, Arrays.asList(a1), TipoFilme.CARTOON);
		Filme f2 = new Filme("Piquenique", 2011, 10, d1, Arrays.asList(a1), TipoFilme.CARTOON);
		Filme f3 = new Filme("Foca", 2010, 5, d1, Arrays.asList(a1), TipoFilme.CARTOON);
		Filme f4 = new Filme("Mama", 2010, 6, d1, Arrays.asList(a1), TipoFilme.CARTOON);
		System.out.println();

		List<Filme> listaFilme = new ArrayList<Filme>(Arrays.asList(f1, f2, f3, f4));
		for (Filme film : listaFilme) {
			System.out.println(film);
		}

		System.out.println("------------------");
		Collections.sort(listaFilme);
		for (Filme film : listaFilme) {
			System.out.println(film);

		}

		Ator a2 = new Ator("Joao", "Anjos", 10, TipoAtor.MAIN, Arrays.asList(2010, 2011));
		Ator a4 = new Ator("Pedro", "Anjos", 12, TipoAtor.MAIN);
		Ator a5 = new Ator("Miguel", "Anjos", 9, TipoAtor.MAIN, Arrays.asList(2010, 2011));
		Ator a6 = new Ator("Joaquim", "Anjos", 11, TipoAtor.MAIN);

		List<Ator> listaActor = new ArrayList<Ator>(Arrays.asList(a2, a4, a5, a6));

		for (Ator actor : listaActor) {
			System.out.println(actor);
		}
		System.out.println("============");
		Collections.sort(listaActor);
		for (Ator ator : listaActor) {
			System.out.println(ator);
		}

		Pessoa p1 = new Pessoa("Diana", "Nogueira", 14);
		Pessoa p2 = new Pessoa("Joao", "Rafael", 20);
		Pessoa p3 = new Pessoa("Joao", "Jacob", 22);

		List<Pessoa> listaPessoa = new ArrayList<Pessoa>(Arrays.asList(p1, p2, p3));

		Collections.sort(listaPessoa);
		for (Pessoa pessoa : listaPessoa) {
			System.out.println(pessoa);
			System.out.println("==========================");
		}

		Map<Filme, Integer> rate = new HashMap<Filme, Integer>();
		rate.put(f4, 10);
		rate.put(f1, 12);
		rate.put(f2, 9);
		rate.put(f3, 11);

		User u1 = new User("João", "Anjos", 19, rate, Arrays.asList(f1, f2, f3, f4), "Veado");
		System.out.println(u1.toString());
		System.out.println("================================");
		
		
		ArrayList<Ator> listaAtor = new ArrayList<Ator>(Arrays.asList(a2, a4, a5, a6));
		ArrayList<Ator> listaAtorNomeados = new ArrayList<Ator>();
		
		for(Ator a: listaActor) {
			if(a.getOscarNominations().size() > 0) {
				listaAtorNomeados.add(a);
			}
		}
		
		for (Ator ator : listaAtorNomeados) {
			System.out.println(ator);

		}
		
		System.out.println("=========================================");
		try {
			System.out.println("Media de Classificação " + u1.getAverageRating());
		} catch (NoRatedFilmsException e) {
			e.printStackTrace();
		}
	}

}
 