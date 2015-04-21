package de.fowler.main;

public class NewReleasePrice extends Price {

	@Override
	public PriceCode getPriceCode() {
		return PriceCode.NEW;
	}

	@Override
	public double getCharge(int daysRented) {
		return daysRented * 3;
	}

	@Override
	public int getFrequentRenterPoints(int daysRented) {
		if (daysRented > 1) {
			return 2;
		} 
		return 1;
	}
}
