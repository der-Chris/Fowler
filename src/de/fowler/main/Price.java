package de.fowler.main;

public abstract class Price {
	
	public abstract PriceCode getPriceCode();
	
	public abstract double getCharge(int daysRented);
}
