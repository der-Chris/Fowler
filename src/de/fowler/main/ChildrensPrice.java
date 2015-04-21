package de.fowler.main;

public class ChildrensPrice extends Price {
	
	public PriceCode getPriceCode() {
		return PriceCode.CHILDREN;
	}
	
	@Override
	public double getCharge(int daysRented) {
		double price = 1.5;
		if (daysRented > 3) {
			price += (daysRented - 3) * 1.5;	
		}
		return price;
	}
}
