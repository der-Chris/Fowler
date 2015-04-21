package de.fowler.main;

public class RegularPrice extends Price {

	@Override
	public PriceCode getPriceCode() {
		return PriceCode.REGULAR;
	}
	
	public double getCharge(int daysRented) {
		double price = 2;
		if (daysRented > 2)
			price += (daysRented - 2) * 1.5;
		return price;
	}
}
