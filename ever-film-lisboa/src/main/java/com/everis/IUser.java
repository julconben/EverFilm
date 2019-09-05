package com.everis;

public interface IUser {
	
	public double getAverageRating() throws NoRatedFilmsException;
	public int hashCode();
	public boolean equals(Object obj);
	
}
