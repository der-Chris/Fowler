package de.fowler.main;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Rental> rentals = new ArrayList<Rental>();
    public Customer (String newname){
        name = newname;
    };
    
    public void addRental(Rental arg) {
        rentals.add(arg);
    };
    
    public String getName () {
        return name;
    };
    
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;   
        String result = "Rental Record for " + this.getName() + "\n";
        result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";

        for(Rental rental : rentals){
            //determine amounts for each line
            double thisAmount = rental.getPrice();
            // add frequent renter points
            frequentRenterPoints += rental.getRenterPoints();
            //show figures for this rental
            result += "\t" + rental.getMovie().getTitle()+ "\t" + "\t" + rental.getDaysRented() + "\t" + thisAmount + "\n";
            totalAmount += thisAmount;
        }
        //add footer lines
        result += "Amount owed is " + totalAmount + "\n";
        result += "You earned " + frequentRenterPoints + " frequent renter points";
        return result;
    }

}
    
