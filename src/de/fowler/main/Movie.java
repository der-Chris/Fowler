package de.fowler.main;
public abstract class Movie {
	private String title;
	private PriceCode priceCode;

	public Movie(String newtitle, PriceCode newpriceCode) {
		title = newtitle;
		priceCode = newpriceCode;
	}

	public PriceCode getPriceCode() {
		return priceCode;
	}

	public void setPriceCode(PriceCode arg) {
		priceCode = arg;
	}

	public String getTitle (){
		return title;
	}

	public abstract double getCharge(int daysRented);
	
	public abstract int getRenterPoints(int daysRented);
}