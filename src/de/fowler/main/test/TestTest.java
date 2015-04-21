/**
 * 
 */
package de.fowler.main.test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import de.fowler.main.Customer;
import de.fowler.main.Movie;
import de.fowler.main.PriceCode;
import de.fowler.main.Rental;

/**
 * @author root
 *
 */
public class TestTest {
	
    String movieNames[] = {"movie1", "movie2"};
    Movie movies[] = new Movie[movieNames.length];
    Rental rentals[] = new Rental[movieNames.length];
    int rentalNewDaysRented[] = {10, 5};
    PriceCode[] moviePriceCodes = {PriceCode.NEW, PriceCode.CHILDREN};
    String customerName = "joe";

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link de.fowler.main.Program#main(java.lang.String[])}.
	 */
	@Test
	public void testMain() {
        String result;
        Customer customer1 = new Customer(customerName);
        for (int i = 0; i < movieNames.length; i = i + 1) {
        	movies[i] = new Movie(movieNames[i], moviePriceCodes[i]);
            rentals[i] = new Rental(movies[i], rentalNewDaysRented[i]);
            customer1.addRental(rentals[i]);
        }
  
        result = customer1.statement();
        System.out.println(result);
        
        StringBuilder wantedResult = new StringBuilder(); 
        wantedResult.append("Rental Record for " + customerName + System.lineSeparator());
        wantedResult.append("\t" + "Title" + "\t\t" + "Days" + "\t" + "Amount" + System.lineSeparator());
        double amounts = 0;
        for (int i = 0; i < movieNames.length; i = i + 1) {
        	double amount = customer1.amountFor(rentals[i]);
        	amounts = amounts + amount;
            wantedResult.append("\t" + movieNames[i] + "\t\t" + rentalNewDaysRented[i] + "\t" + amount + System.lineSeparator());
        }
        wantedResult.append("Amount owed is " + amounts + System.lineSeparator());
        wantedResult.append("You earned 3 frequent renter points");
        System.out.println(wantedResult.toString());

        assertTrue(wantedResult.toString().equals(result));
        //fail("Not yet implemented");
	}

}
