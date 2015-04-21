package de.fowler.main;
public class Rental {
    private Movie movie;
    private int daysRented;
    public Rental(Movie newmovie, int newdaysRented) {
        movie = newmovie;
        daysRented = newdaysRented;
    }
    public int getDaysRented() {
        return daysRented;
    }
    public Movie getMovie() {
        return movie;
    }
    
    public double getPrice() {
    	 double price = 0;
         switch (this.getMovie().getPriceCode()) {
             case REGULAR:
                 price += 2;
                 if (this.getDaysRented() > 2)
                     price += (this.getDaysRented() - 2) * 1.5;
                 break;
             case NEW:
                 price += this.getDaysRented() * 3;
                 break;
             case CHILDREN:
                 price += 1.5;
                 if (this.getDaysRented() > 3)
                     price += (this.getDaysRented() - 3) * 1.5;
                 break;
         }
         return price;
    }
    
    public int getRenterPoints() {
    	int frequentRenterPoints = 1;
        if ((this.getMovie().getPriceCode() == PriceCode.NEW) && this.getDaysRented() > 1) {
            frequentRenterPoints ++;
            
        } return frequentRenterPoints;
    }
}