package com.everis;

public interface IUser {
	
	public double getAverageRating() throws NoRatedFilmsException;

	boolean equals(Object o);
}
