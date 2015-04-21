package de.fowler.main;

public class RegularMovie extends Movie {

	public RegularMovie(String newtitle, PriceCode newpriceCode) {
		super(newtitle, newpriceCode);
		// TODO Auto-generated constructor stub
	}

	public double getCharge(int daysRented) {
		double price = 2;
			if (daysRented > 2) {
				price += (daysRented - 2) * 1.5;
			}
		return price;
	}
	
	public int getRenterPoints(int daysRented) {
		int frequentRenterPoints = 1;
		if ((this.getPriceCode() == PriceCode.NEW) && daysRented > 1) {
			frequentRenterPoints ++;

		} return frequentRenterPoints;
	}
}
