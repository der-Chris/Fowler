package de.fowler.main;

import java.io.FileNotFoundException;
import java.io.PrintStream;


/**
 * Note that Java console applications need to be run through the java runtime
 * by running "java -jar JarFile.jar" in the command line.
 * Java console applications can not be previewed in the Compilr IDE, only applets can.
 */
public class Program
{
    /**
     * This is the main entry point for the application
     */
    
    
    public static void main(String args[]) 
    {
		try {
			System.setOut(new PrintStream("test.txt"));
		} catch (FileNotFoundException e) {
		}
        String result;
        System.out.println("Welcome to the Movie Store");
        Movie m1 = new NewReleaseMovie("movie1", PriceCode.NEW);
        Movie m2 = new ChildrensMovie("movie2", PriceCode.CHILDREN);
        Rental r1 = new Rental(m1, 10);
        Rental r2 = new Rental(m2, 5);
        Customer c1 = new Customer("joe");
        c1.addRental(r1);
        c1.addRental(r2);   
        System.out.println("Let's get the Statement");
        result = c1.statement();
        System.out.println(result);
    }
}


