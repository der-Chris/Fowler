package de.fowler.main;

public class NewReleaseMovie extends Movie {

	public NewReleaseMovie(String newtitle, PriceCode newpriceCode) {
		super(newtitle, newpriceCode);
		// TODO Auto-generated constructor stub
	}

	public double getCharge(int daysRented) {
		return daysRented * 3;
	}
	
	public int getRenterPoints(int daysRented) {
		int frequentRenterPoints = 1;
		if ((this.getPriceCode() == PriceCode.NEW) && daysRented > 1) {
			frequentRenterPoints ++;
		} return frequentRenterPoints;
	}
}
