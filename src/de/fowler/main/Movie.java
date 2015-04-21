package de.fowler.main;
public class Movie {
	private String title;
	private Price price;

	public Movie(String newtitle, PriceCode priceCode) {
		title = newtitle;
		setPriceCode(priceCode);
	}

	public PriceCode getPriceCode() {
		return this.price.getPriceCode();
	}

	public void setPriceCode(PriceCode priceCode) {
		switch(priceCode) {
		case REGULAR:
			this.price = new RegularPrice();
			break;
		case NEW:
			this.price = new NewReleasePrice();
			break;
		case CHILDREN:
			this.price = new ChildrensPrice();
			break;
		}
	}

	public String getTitle (){
		return title;
	}

	public double getCharge(int daysRented) {
		return this.price.getCharge(daysRented);
	}
	public int getRenterPoints(int daysRented) {
		return this.price.getFrequentRenterPoints(daysRented);
	}
}