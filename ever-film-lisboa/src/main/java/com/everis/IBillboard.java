package com.everis;

public interface IBillboard {

public toString(); // retorna String
public getBestFilm(); //retorna Film
public addFilm(Film); //retorna Boolean
public removeOldFilm(); //retorna Film
//En la Class Billboard, implementar IBillboard y completar los métodos
public toString();// -> Retornar String con la lista de Films como String 
public getBestFilm(); // retorna el Film con mejor quality
public addFilm(Film); // retorna Boolean: Comprueba() si filmBillBoard tiene un size mayor que 5, si no lo tiene podrá añadir un Film y devuelve True, en otro caso devuelve False.
public removeOldFilm(); // retorna Film Remove el Film que lleva más tiempo en el Billboard y lo retorna
	
}
