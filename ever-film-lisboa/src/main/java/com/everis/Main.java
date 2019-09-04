package com.everis;

import java.util.ArrayList;
import java.util.List;

/**
 * EVERFILM
 * 
 * author: Diana Nogueira
 *
 */
public class Main {
    public static void main(String[] args) {
    	
    	
    	
    	
    	/**TESTE SHAWSHANK*********************************************************************************************************************/
    	
    	List<String> l = new ArrayList<String>(); // film list for director
    	
    	Director fDarabout = new Director("Frank", "Darabout", 85, "Fox", l); //Diretor
    	
    	List<Integer> m = new ArrayList<Integer>(); //simulate 'random' oscar nominations
    	for(int i=0; i<5; i++) {
    		m.add(1991+i);
    	}
    	
    	List<Integer> t = new ArrayList<Integer>(); //simulate 'random'  oscar nominations
    	for(int i=0; i<5; i++) {
    		t.add(1978+(i*2));
    	}
    		
    	Actor mFreeman = new Actor("Morgan","Freeman", 70, (ArrayList) m, com.everis.ActorType.MAIN); //actor morgan
    	Actor tRobbins = new Actor("Tim", "Robbins", 69, (ArrayList) m, com.everis.ActorType.SUPPORTING); //actor tim
    	
    	List<Actor> act = new ArrayList<Actor>(); // actors list
    	act.add(mFreeman);
    	act.add(tRobbins);
    	
        Film shawshank = new Film("The Shawshank Redemption", 1994, 9, fDarabout , act, "DRAMA");
        
        /** TESTE GETSTRING*/
        System.out.println(shawshank.toString());
        
        /** TESTE GETQUALITY*/
        System.out.println(shawshank.getQualityString());
        /** FIM DO TESTE SHAWSHANK*********************************************************************************************************************/
    }
}
