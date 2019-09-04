package com.everis;

/**
 * EVERFILM
 * 
 * author: Diana Nogueira
 *
 */
public class Main {
    public static void main(String[] args) {
        Film f = new Film();
        
        /** TESTE GETQUALITY*/
        f.setQuality(1);
        System.out.println(f.getQualityString());
    }
}
