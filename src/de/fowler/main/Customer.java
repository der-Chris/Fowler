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
        String result = "Rental Record for " + this.getName() + "\n";
        result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";

        for(Rental rental : rentals){
            result += "\t" + rental.getMovie().getTitle()+ "\t" + "\t" + rental.getDaysRented() + "\t" + rental.getPrice() + "\n";
        }
        //add footer lines
        result += "Amount owed is " + getAmountOwed() + "\n";
        result += "You earned " + getFrequentRenterPoints() + " frequent renter points";
        return result;
    }
    
    public String htmlStatement() {
    	String result = "<H1>" + "Rentals for " + "<EM>" + getName() + "</EM></H1><P>\n";
    	for(Rental rental : rentals){
            result += rental.getMovie().getTitle()+ ": " +  rental.getPrice() + "<BR>\n";
        }
    
    	//add footer lines
        result += "<P>" + "You owe <EM>" + getAmountOwed() + "</BR><P>\n";
    	result += "On this rental you eared <EM>" + getFrequentRenterPoints() + " </EM>frequent renter points <P>";
    	return result;
    }
    
    public double getAmountOwed(){
    	double amount = 0;
    	for(Rental rental : rentals){
    		amount += rental.getPrice();
    	}
    	return amount;
    }
    
    public int getFrequentRenterPoints(){
    	int amount = 0;
    	for(Rental rental : rentals){
    		amount += rental.getRenterPoints();
    	}
    	return amount;
    }

}
    
