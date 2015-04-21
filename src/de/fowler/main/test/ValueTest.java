package de.fowler.main.test;

import static org.junit.Assert.*;

import org.junit.Test;

import de.fowler.main.Customer;
import de.fowler.main.Movie;
import de.fowler.main.PriceCode;
import de.fowler.main.Rental;

public class ValueTest {

	@Test
	public void test() {
		Movie m1 = new Movie("movie1", PriceCode.NEW);
        Movie m2 = new Movie("movie2", PriceCode.CHILDREN);
        Rental r1 = new Rental(m1, 10);
        Rental r2 = new Rental(m2, 5);
        Customer c1 = new Customer("joe");
        c1.addRental(r1);
        c1.addRental(r2);
        assertTrue(r1.getCharge()==30);
        assertTrue(r2.getCharge()==4.5);
        assertTrue(c1.getAmountOwed()==34.5);
        assertTrue(c1.getFrequentRenterPoints()==3);
	}

}
