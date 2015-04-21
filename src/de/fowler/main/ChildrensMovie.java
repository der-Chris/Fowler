package de.fowler.main;

public class ChildrensMovie extends Movie {

	public ChildrensMovie(String newtitle, PriceCode newpriceCode) {
		super(newtitle, newpriceCode);
		// TODO Auto-generated constructor stub
	}

	public double getCharge(int daysRented) {
		double price = 1.5;
		if (daysRented > 3) {
			price += (daysRented - 3) * 1.5;
		}
		return price;
	}

	public int getRenterPoints(int daysRented) {
		return 1;
	}
}
