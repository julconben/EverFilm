package com.everis;

public interface IBillboard {

//En la Class Billboard, implementar IBillboard y completar los métodos
public String toString();// -> Retornar String con la lista de Films como String 
public Film getBestFilm(); // retorna el Film con mejor quality
public Boolean addFilm(Film f); // retorna Boolean: Comprueba() si filmBillBoard tiene un size mayor que 5, si no lo tiene podrá añadir un Film y devuelve True, en otro caso devuelve False.
public Film removeOldFilm(); // retorna Film Remove el Film que lleva más tiempo en el Billboard y lo retorna
	
}
