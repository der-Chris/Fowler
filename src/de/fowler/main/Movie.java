package de.fowler.main;
public class Movie {
	private String title;
	private PriceCode priceCode;

	public Movie(String newtitle, PriceCode newpriceCode) {
		title = newtitle;
		setPriceCode(newpriceCode);
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

	public double getCharge(int daysRented) {
		double price = 0;
		switch (this.getPriceCode()) {
		case REGULAR:
			price += 2;
			if (daysRented > 2)
				daysRented += (daysRented - 2) * 1.5;
			break;
		case NEW:
			price += daysRented * 3;
			break;
		case CHILDREN:
			price += 1.5;
			if (daysRented > 3)
				price += (daysRented - 3) * 1.5;
			break;
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